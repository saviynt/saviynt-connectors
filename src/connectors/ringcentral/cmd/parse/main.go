package main

import "fmt"

func main() {
	info := "{\r\n  \"accountIdPath\": \"call1.message.id\",\r\n  \"responseColsToPropsMap\": {\r\n    \"name\": \"call1.message.userName~#~char\"\r\n  },\r\n  \"call\": [\r\n    {\r\n      \"name\": \"call1\",\r\n      \"connection\": \"acctAuth\",\r\n      \"url\": \"https://platform.devtest.ringcentral.com/scim/v2/Users\",\r\n      \"httpMethod\": \"POST\",\r\n      \"httpParams\": \"{\\\"active\\\":true,\\\"name\\\":{\\\"familyName\\\":\\\"${user.lastname}\\\",\\\"givenName\\\":\\\"${user.firstname}\\\"},\\\"emails\\\":[{\\\"type\\\":\\\"work\\\",\\\"value\\\":\\\"${user.email}\\\"}],\\\"schemas\\\":[\\\"urn:ietf:params:scim:schemas:core:2.0:User\\\"],\\\"userName\\\":\\\"${user.username}\\\"}\",\r\n      \"httpHeaders\": {\r\n        \"authorization\": \"${access_token}\",\r\n        \"Accept\": \"application/json\"\r\n      },\r\n      \"httpContentType\": \"application/json\",\r\n      \"successResponses\": {\r\n        \"statusCode\": [\r\n          200,\r\n          201\r\n        ]\r\n      }\r\n    }\r\n  ]\r\n}"
	fmt.Println(info)
	fmt.Println("DONE")
}
