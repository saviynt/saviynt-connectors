**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users . The integration is available “as is” and fall under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework. 

**Note: Contributor** - [Manju Kumari]("http://linkedin.com/in/manju-royal-ab4931258" ""http://linkedin.com/in/manju-royal-ab4931258"")

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
    
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=and%20GoTo%20Meeting%20.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=and%20GoTo%20Meeting%20.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=with%20GoTo%20Meeting%20.-,Introduction,-GoToMeeting%20is%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=with%20GoTo%20Meeting%20.-,Introduction,-GoToMeeting%20is%20a"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20GoTo%20Meeting" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20GoTo%20Meeting"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
            
*   [Understanding the Integration between EIC and]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0GoTo%20Meeting,-You%20must%20create" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0GoTo%20Meeting,-You%20must%20create"") GoTo Meeting
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=GoTo%20Meeting%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=GoTo%20Meeting%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Setting Up the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=the%20target%20application-,Setting%20Up%20the%20Integration,-Prerequisites" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=the%20target%20application-,Setting%20Up%20the%20Integration,-Prerequisites"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Up%20the%20Integration-,Prerequisites,-Perform%20the%20following" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Up%20the%20Integration-,Prerequisites,-Perform%20the%20following"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=next%2030%20days.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=next%2030%20days.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Yes-,Importing%20Connection%20Package,-connection%20package%20helps" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Yes-,Importing%20Connection%20Package,-connection%20package%20helps"")
            
        *   [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Meeting%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Meeting%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system"")
            
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to"")
            
*   [Using the GoTo Meeting Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Creating%20Endpoints.-,Using%20the%20GoTo%20Meeting%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Creating%20Endpoints.-,Using%20the%20GoTo%20Meeting%20Integration,-You%20can%20use"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply"")
        
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import"")
        
        *   [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import"")
            
    *   [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/community-sourced-integrations/goto-meeting-integration-guide/ta-p/44809#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common"")
    

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and GoTo Meeting .

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with GoTo Meeting .

Introduction
============

**GoToMeeting** is a web-based video conferencing and online meeting platform developed by LogMeIn. It allows users to host and participate in virtual meetings, webinars, and collaborative sessions with remote participants. It is commonly used for business purposes, remote work, and distance learning.

Some of the key features of GoToMeeting include:

1.  Video Conferencing: Users can conduct face-to-face meetings with high-definition video and audio capabilities. Participants can join the meeting using their computer, smartphone, or tablet.
    
2.  Screen Sharing: Presenters can share their screens with others, allowing them to showcase presentations, documents, or applications.
    
3.  Meeting Recording: Meetings can be recorded for future reference or for participants who couldn't attend the live session.
    
4.  Chat and Messaging: Users can exchange messages during the meeting using the built-in chat feature.
    
5.  Mobile Apps: GoToMeeting offers mobile applications for iOS and Android devices, enabling participants to join meetings on the go.
    
6.  Integrations: It integrates with various productivity tools and applications, such as Microsoft Office, Google Calendar, and Slack, to streamline workflows.
    
7.  Security: The platform includes encryption and authentication mechanisms to ensure the security and privacy of meetings.
    

The **GoTo Meeting** connector enables you to seamlessly integrate with GoTo Meeting to manage user lifecycle and govern access to their Groups.

For more information about different connectors in EIC, see  [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the GoTo Meeting REST connector using REST API for performing operations listed in the Supported Features.

**Supported Features**
----------------------

The GoTo Meeting integration supports the following features:

### **Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and GoTo Meeting
==========================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and deprovisioning tasks. The following components are involved in the integration:

*   The Complete Service Management platform GoTo Meeting combines ITSM with ESM and SIAM capabilities, enabling all internal departments, such as IT, HR, and Facilities, as well as external service providers and customers, to collaborate securely and seamlessly on one complete platform, reducing complexity and improving productivity.
    
*   **Objects** are imported as entitlement types into EIC.
    
*   **Security System** represents the connection between EIC and the target application.
    
    *   It comprises of an endpoint, which is the target application for which you want EIC to manage the identity repository.
        
    *   It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm"").
        
*   **Endpoint** is an instance of an application within the context of a security system.
    
    *   It is the target application or application from which the connector imports the data and performs provisioning or deprovisioning of identity objects, such as users, accounts, and entitlements.
        
    *   It is mandatory to create an endpoint after creating the security system.  
        You can associate a single security system with multiple endpoints if the deployment involves modelling of multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see [Creating an Endpoint for the Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm"").
        
*   **Connector** is a software component that enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing, provisioning accounts and access through the REST APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import or provisioning operations from EIC.  
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the GoTo Meeting integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with GoTo Meeting for importing data and for performing provisioning and deprovisioning tasks.

The following diagram illustrates the integration architecture and communication with the target application

Setting Up the Integration
--------------------------

### **Prerequisites**

Perform the following steps to Generate & Setup token authentication

#### **How to obtain an OAuth access token**

1.  **Obtaining an Authorization Code**
    

*   Log in to the GoTo Meeting portal using administrator credentials.
    
*   Choose **OAuth Clients** on the main menu.
    
*   Open your client and copy the client ID value.
    
*   Insert the client ID into the sample URL below to replace {clientID}.
    
*   Enter a valid redirect URI to replace {redirectUri}. This value is optional but recommended to prevent the wrong URI to be used.
    
*   Send the call from your browser address/search field. You are directed to the GoTo sign in page.
    
*   If you are not already logged in, you will sign in with your credentials and must click **Allow** to authorize access for your API client.
    
*   You are then automatically redirected to the redirect URI. The redirect URI (in the browser address bar) includes an authorization code.
    
*   NOTE: Only the scopes set in your OAuth client will be requested from your end users.
    

**2.Sample URL**

[https://authentication.logmeininc.com/oauth/authorize?client\_id={clientID}&response\_type=code&redirect\_uri={redirectUri]("https://authentication.logmeininc.com/oauth/authorize?client_id={clientID}&response_type=code&redirect_uri={redirectUri")}  
  

With (fake) values filled in, the call looks like:

[https://authentication.logmeininc.com/oauth/authorize?client\_id=a2094c4f-fAk0e-4339-934f-4da2d788d0aa&response\_type=code&redirect\_uri=https://example.com]("https://authentication.logmeininc.com/oauth/authorize?client_id=a2094c4f-fAk0e-4339-934f-4da2d788d0aa&response_type=code&redirect_uri=https://example.com")  
  

###### **Allow Screen Sample**

**IMPORTANT:** You may see an error on the page such as 404 NOT FOUND. This is not a problem. Look at the URL in the browser. It contains the authorization code you need for the next step. It will look something like:

[https://example.com/?code=iS0vynEEvRFA9i6kZ8gvNDnnOGE...]("https://example.com/?code=iS0vynEEvRFA9i6kZ8gvNDnnOGE...")

**3.Authorization header**

The Authorization header is created by base64-encoding the app's client ID and client secret. To encode these values, open an encoding site, for example, [Base64Encode.org]("https://www.base64encode.org/" ""https://www.base64encode.org/""), and paste in the client ID, add a colon (:), and then paste in the client secret. No spaces, no quotes, no brackets. Submit the values and an encoded value is returned that will look something like:

YTIwfAKeNGYtODY4YS00MzM5LTkzNGYtNGRhMmQ3ODhkMGFhOjNuYU8xMElBMmFnY3ZHKzlJOVRHRVE9PQ==

Add this value to the Authorization header after the word Basic as shown in the cURL example below.

### Data Parameters

4.**Obtain an Access Token**

You can now send the authorization code in exchange for an access token. Each authorization code can only be exchanged once. Any subsequent attempts will result in an error.

Request an access token using a POST call. This call can be sent through Postman, using the cURL command line, or other clients.

cURL syntax below shows the full request. Details on creating the Authorization header and the other POST data follows the code sample.

The code value above is truncated for clarity in the example

**5.Obtain and Use Refresh Tokens**

A valid access token is required to make a successful API call for GoTo products. Access tokens have a lifespan of 60 minutes. Getting a new access token requires a new login and new token request, or - more easily - a request that contains a refresh token. Refresh tokens are good for longer periods.

To use a refresh token, you send an API token request with a grant type of refresh\_token with the refresh token value from the original token request. A sample request is shown below in cURL format.

**NOTE:** The refresh\_token displayed in the examples on this page are truncated. The tokens are significantly larger.

curl --request POST '[https://authentication.logmeininc.com/oauth/token]("https://authentication.logmeininc.com/oauth/token")' \\ \--header 'Content-Type: application/x-www-form-urlencoded' \\ --header 'Authorization: Basic YTIwfAKeNGYtODY4YS00MzM5LTkzNGYtNGRhMmQ3ODhkMGFhOjNuYU8xMElBMmFnY3ZHKzlJOVRHRVE9PQ==' \\ -d 'grant\_type=refresh\_token&refresh\_token=eyJraWQiOiJvYXV0aHYyLmxt999...'

The Authorization header value is the same as the one you used to obtain the original token, namely the string of clientID:clientSecret base64 encoded. The refresh token is the value received in the results body when you received the original access token.

##### Response example

IMPORTANT: The access token and refresh token values are truncated. They are large values.

{ "access\_token": "eyJraWQiOiJvYXV0aHYyLmxt666...", "refresh\_token": "eyJraWQiOiJvYXV0aHYyLmxt999...", "expires\_in": 3600, "principal": "mahar.singh@company.com", }

**NOTE:**

*    Generate an access token. The body of the response contains a new valid access token and a refresh token.
*   At any time when you need access (within the next 30 days), send a grant type=refresh token request. The body of the response contains the same refresh token as the first request. Best practice is to harvest the refresh token from the response body daily and use it for the next grant type=refresh token request.
*   At some point, on or about day 30 of the refresh token's lifecycle, the response body will contain a new refresh token, good for the next 30 days.

### **Creating a Connection**

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").

#### **Understanding the Configuration Parameters**

While creating a connection, you must specify connection parameters that the connector uses to connect with the target application, define the type of operations to perform, the target application objects against which those operations are performed, and the frequency of performing them. In addition, you can view and edit attribute mappings between EIC and the target application, predefined correlation rules, and provisioning jobs and import jobs.

##### **Configuration Parameters for Account and Access Import**

The connector uses the following parameters for creating a connection and for importing account and access from the target application:

###### **Connection Parameters**

**Parameter**

**Description**

**Example Configuration**

**Mandatory?**

Connection Name 

Specify the name to identify the connection.

\-

Yes

Connection Description

Specify the description for the connection.

\-

No

Connection Type

*   Select the connection type as “GoTo Meeting (REST)”
    
*   If the “GoTo Meeting (REST) connection type is not present in your tenant then import the connection package using T2P
    
*   You can also create a new connection with type “REST” and use the JSONS specified in this document.
    

\-

Yes

Default SAV Role 

Specify this parameter to assign the SAV role for the connection.

The SAV role is a role in EIC that assigns specific access to users.

This parameter is valid only for importing users.

**Sample value:** User assigned with the **ROLE\_ADMIN** role, has access to all the sections of EIC.

\-

No

Email Template

Specify this parameter to select an email template for sending notifications.

Email templates provide immediate trigger of emails to a user based on actions performed. Email informs user about the action performed and if critical, needs immediate action from the user.

\-

No

ConnectionJSON

Specify this parameter to create a connection.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip"") 

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatory?**

AccountEntImport JSON

Specify this parameter to reconcile the accounts and entitlements

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip"") 

Yes

###### **Configuration Parameter for Provisioning**

**Parameter**

**Description**

**Recommended Configuration**

**Support for Binding Variables?**

**Support for Java Ternary Operations?**

CreateAccountJSON

Specify this parameter to create an account in the target application.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip"") 

The bindings supported are:

*   ServiceAccountOwnerMap
    
*   endpoints
    
*   accountName
    
*   userManager
    
*   approvers
    
*   arsTasks/task
    
*   managerAccount
    
*   password
    
*   requestid
    
*   response
    
*   connection
    
*   userAccount
    
*   requestAccessAttributes/reqAttrs
    
*   businessJustification
    
*   user
    

Yes

Update Account JSON

Specify this parameter to update an account in the target application.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip"") 

The bindings supported are:

*   ServiceAccountOwnerMap
    
*   endpoints
    
*   accountName
    
*   userManager
    
*   approvers
    
*   arsTasks/task
    
*   managerAccount
    
*   password
    
*   requestid
    
*   response
    
*   connection
    
*   userAccount
    
*   requestAccessAttributes/reqAttrs
    
*   businessJustification
    
*   user
    

Yes

AddAccessJSON

Specify this parameter to add access to an account.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip"") 

The bindings supported are:

*   ServiceAccountOwnerMap
    
*   endpoints
    
*   accountName
    
*   userManager
    
*   approvers
    
*   arsTasks/task
    
*   managerAccount
    
*   password
    
*   requestid
    
*   response
    
*   connection
    
*   userAccount
    
*   requestAccessAttributes/reqAttrs
    
*   businessJustification
    
*   user
    

Yes

RemoveAccessJSON

Specify this parameter to remove access from an account.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip"") 

The bindings supported are:

*   ServiceAccountOwnerMap
    
*   endpoints
    
*   accountName
    
*   userManager
    
*   approvers
    
*   arsTasks/task
    
*   managerAccount
    
*   password
    
*   requestid
    
*   response
    
*   connection
    
*   userAccount
    
*   requestAccessAttributes/reqAttrs
    
*   businessJustification
    
*   user
    

Yes

RemoveAccountJSON

Specify this parameter to remove an account. 

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip"") 

The bindings supported are:

*   ServiceAccountOwnerMap
    
*   endpoints
    
*   accountName
    
*   userManager
    
*   approvers
    
*   arsTasks/task
    
*   managerAccount
    
*   password
    
*   requestid
    
*   response
    
*   connection
    
*   userAccount
    
*   requestAccessAttributes/reqAttrs
    
*   businessJustification
    
*   user
    

Yes

###   
Importing Connection Package

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out of the box connection templates available. Here are the steps to import the GoTo Meeting connection package.

*   Download the [connection package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/62/1/GoToMeeting.zip"").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “GoTo Meeting ” Connection.
    
*   Edit the connection with your GoTo Meeting tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the GoTo Meeting Integration
==================================

You can use the GoTo Meeting integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run account import before running the access import.
    
*   Map all GoTo Meeting attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Configuring Import Operations
-----------------------------

*   **Full account import:** When configuring the connection for the first time, first perform full import to import all existing accounts from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
    
*   **Full Access import:** When configuring the connection for the first time, first perform full import to import all existing access from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.
    

The import jobs are automatically created in EIC after you create a connection for the GoTo Meeting integration. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").

### **Importing Accounts and Accesses**

You must import accounts after the users are available in EIC.

**To import accounts:** 

1.  Specify the connection and import parameters. For more information, see [Account]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Accounts.htm" ""https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Accounts.htm"") and [Access]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Access.htm" ""https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Access.htm"") import.  
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **Application Data Import (Single Threaded)** job to import accounts and access. For more information, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").
    

Configuring Provisioning and Deprovisioning
-------------------------------------------

Provisioning is automatically enabled when a connection is configured. For detailed information about performing provisioning tasks, see [Access Request System]("https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x"").

**To provision objects to the target application:**

1.  Specify the connection and provisioning parameters. For more information, see [Configuration Parameters for Provisioning]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Provisioning-and-Deprovisioning.htm" ""https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Provisioning-and-Deprovisioning.htm"").  
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **Provisioning** job **(WSRETRY)**. For more information, see [Provisioning Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").
    

When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the connector.

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers for frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm"").

**Note:** Ensure that you record the token expiry duration during the initial token generation. The connection may fail, if the token is not refreshed.