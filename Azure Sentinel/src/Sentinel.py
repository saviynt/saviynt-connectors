from datetime import datetime, timedelta, timezone
import logging
import json
import requests
import hashlib
import hmac
import base64
import os
import azure.functions as func

# Update the customer ID to your Log Analytics workspace ID
customer_id = os.environ["customer_id"]
shared_key = os.environ["shared_key"]
# The log type is the name of the event that is being submitted
log_type = os.environ["log_type"]
# Number of data chunks to post at once - Sentinel limit 30MB
chunks = 5
data = 0
# Saviynt Endpoint
url =  os.environ["url"]

def auth():
    auth_url = url + "/ECM/api/login"
    payload = json.dumps({
        "username": os.environ["username"],
        "password": os.environ["password"]
    })
    headers = {
        'Content-Type': 'application/json'
    }
    response = requests.post(auth_url, headers=headers, data=payload)
    logging.info("Response content: {}".format(response.content))
    if response.status_code >= 200:
        logging.info("Response text: {}".format(response.text))
        data = response.json()
        logging.info("Returned Access Token")
        return data["access_token"]
    else:
        logging.info("Response code: {}".format(response.status_code))
        raise Exception("Problems getting a token from Saviynt %s %s" % (response.status_code, response))


def getSaviyntData():
    token = auth()
    other_url = url + "/ECM/api/v5/fetchRuntimeControlsDataV2"
    RequestedBefore = datetime.utcnow()
    RequestedAfter = datetime.utcnow() - timedelta(minutes=10)
    payload = json.dumps({
        "analyticsname": os.environ["analyticsname"],
        "attributes": {
            "timeFrame": os.environ["timeFrame"]
        }
    }, default=str)
    headers = {
        'Authorization': 'Bearer ' + token,
        'Content-Type': 'application/json'
    }

    response = requests.post(other_url, headers=headers, data=payload)
    if (response.status_code >= 200):
        results = response.json()
        if results["displaycount"] != 0:
            logging.info("Received data from Saviynt")
            return results["results"]
        else:
            logging.info("There was no data to fetch... exiting")
            exit(1)
    else:
        logging.info("Response code: {}".format(response.status_code))
        raise Exception("Problems getting logs %s %s" % (response.status_code, response))

def build_signature(customer_id, shared_key, date, content_length, method, content_type, resource):
    x_headers = 'x-ms-date:' + date
    string_to_hash = method + "\n" + str(content_length) + "\n" + content_type + "\n" + x_headers + "\n" + resource
    bytes_to_hash = bytes(string_to_hash, encoding="utf-8")
    # Make sure there is enough padding on b64 string
    key_with_padding = f"{shared_key}{'=' * ((4 - len(shared_key) % 4) % 4)}"
    decoded_key = base64.b64decode(key_with_padding)
    encoded_hash = base64.b64encode(hmac.new(decoded_key,
                                             bytes_to_hash, digestmod=hashlib.sha256).digest()).decode()
    authorization = "SharedKey {}:{}".format(customer_id, encoded_hash)
    return authorization

def post_data(customer_id, shared_key, body, log_type):
    method = 'POST'
    content_type = 'application/json'
    resource = '/api/logs'
    # Set TimeGenerated to Access Time and not ingest time
    TimeStampField = os.environ["TimeStampField"]
    rfc1123date = datetime.utcnow().strftime('%a, %d %b %Y %H:%M:%S GMT')
    content_length = len(body)
    signature = build_signature(customer_id, shared_key,
                                rfc1123date, content_length, method, content_type, resource)
    uri = os.environ["logAnalyticsUri"] + resource + '?api-version=2016-04-01'
    headers = {
        'content-type': content_type,
        'Authorization': signature,
        'Log-Type': log_type,
        'x-ms-date': rfc1123date,
        'time-generated-field': TimeStampField
    }
    logging.info("Posting Data to Sentinel")
    response = requests.post(uri, data=body, headers=headers)
    if (response.status_code >= 200 and response.status_code <= 299):
        logging.info('Accepted, Data posted to sentinel')
    else:
        logging.info("Response code: {}".format(response.content))

def main(mytimer: func.TimerRequest) -> None:
    utc_timestamp = datetime.utcnow().replace(tzinfo=timezone.utc).isoformat()
    if mytimer.past_due:
        logging.info('The timer is past due!')
    logging.info("Timer on time logging data")
    # Get Data past 10 Minutes
    data = getSaviyntData()
    if data:
        # for item in data:
        # item["ACCESS TIME"]= datetime.strptime(item["ACCESSTIME"], '%Y-%m-%d %H:%M:%S.%f').isoformat()
        for item in range(0, len(data), chunks):
            chunk = json.dumps(data[item:item + chunks])
            post_data(customer_id, shared_key, chunk, log_type)
    else:
        logging.info("No data was returned")
    logging.info('Python timer trigger function ran at %s', utc_timestamp)
