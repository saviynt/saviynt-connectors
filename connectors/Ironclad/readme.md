**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users . The integration is available “as is” and fall under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework. 

*   1 [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=6%20Troubleshooting-,Preface,-This%20guide%20describes")
*   2 [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=EIC)%20and%20Ironclad.-,Audience,-This%20guide%20is")
*   3 [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=service%20with%20Ironclad.-,Introduction,-Ironclad%20is%20the")
    *   3.1 [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Ironclad%20integration")
        *   3.1.1 [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=or%20Remove%20Access-,Supported%20Software%20Versions,-Software")
*   4 [Understanding the Integration between EIC and Ironclad]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Ironclad,-You%20must%20create")
    *   4.1 [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=the%20Ironclad%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a")
    *   4.2 [Setting Up the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-Prerequisites")
        *   4.2.1 [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=Up%20the%20Integration-,Prerequisites,-You%20can%20generate")
        *   4.2.2 [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=the%20admin%20group.-,Creating%20a%20Connection,-Connection%20refers%20to")
            *   4.2.2.1 [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=a%20Connection.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a")
                *   4.2.2.1.1 [Configuration Parameters for Account and Access Import]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=and%20import%20jobs.-,Configuration%20Parameters%20for%20Account%20and%20Access%20Import,-The%20connector%20uses")
                    *   4.2.2.1.1.1 [Connection Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter")
                    *   4.2.2.1.1.2 [Import Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=Yes-,Import%C2%A0Parameters,-Parameter")
                    *   4.2.2.1.1.3 [Configuration Parameter for Provisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=Yes-,Configuration%20Parameter%20for%20Provisioning,-Parameter")
        *   4.2.3 [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=Yes-,Importing%20Connection%20Package,-The%20connection%20package")
        *   4.2.4 [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=Ironclad%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system")
        *   4.2.5 [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to")
*   5 [Using the Ironclad Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=Creating%20Endpoints.-,Using%20the%20Ironclad%20Integration,-You%20can%20use")
    *   5.1 [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply")
    *   5.2 [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import")
        *   5.2.1 [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import")
    *   5.3 [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically")
*   6 [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/ironclad-integration-guide/ta-p/28852#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common")

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Ironclad.

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with Ironclad.

Introduction
============

Ironclad is the contract lifecycle management platform for innovative companies. L’Oréal, Staples, Mastercard, and other leading innovators use Ironclad to collaborate and negotiate on contracts, accelerate contracting while maintaining compliance, and turn contracts into critical carriers of operational business intelligence.

The **Ironclad** connector enables you to seamlessly integrate with Ironclad to manage user lifecycle and govern access to their Groups.

For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the Ironclad REST connector using SCIM API for performing operations listed in the Supported Features.

**Supported Features**
----------------------

The Ironclad integration supports the following features:

**Full Import****Incremental Import****Lifecycle Management****Add or Remove Access**

### **Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Ironclad
======================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and deprovisioning tasks. The following components are involved in the integration:

*   The Complete Service Management platform Ironclad combines ITSM with ESM and SIAM capabilities, enabling all internal departments, such as IT, HR, and Facilities, as well as external service providers and customers, to collaborate securely and seamlessly on one complete platform, reducing complexity and improving productivity.
    
*   **Objects** are imported as entitlement types into EIC.
    
*   **Security System** represents the connection between EIC and the target application.
    
    *   It comprises of an endpoint, which is the target application for which you want EIC to manage the identity repository.
        
    *   It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm"").
        
*   **Endpoint** is an instance of an application within the context of a security system.
    
    *   It is the target application or application from which the connector imports the data and performs provisioning or deprovisioning of identity objects, such as users, accounts, and entitlements.
        
    *   It is mandatory to create an endpoint after creating the security system.  
        You can associate a single security system with multiple endpoints if the deployment involves modelling of multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see [Creating an Endpoint for the Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm"").
        
*   **Connector** is a software component that enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing, provisioning accounts and access through the SCIM APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import or provisioning operations from EIC.  
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the Ironclad integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Ironclad for importing data and for performing provisioning and deprovisioning tasks. The REST connection uses the SCIM (System for Cross Identity Management) protocol to communicate with the SCIM interface of Ironclad. 

The following diagram illustrates the integration architecture and communication with the target application. 

![""]("blob:https://saviyntars.atlassian.net/67b39a78-42af-4d6e-88ea-e5c34dbe1049#media-blob-url=true&id=e5ae3fe5-0cb2-49c0-bef4-0d556877b2f3&collection=contentId-4273012929&contextId=4273012929&height=443&width=1123&alt=")

Setting Up the Integration
--------------------------

### **Prerequisites**

1.  You can generate these access tokens in Ironclad by clicking \[YOUR\_NAME\] > Company Settings > API > Access Tokens.
    

2.Adding a valid token to the “Authorization” header will validate your request.

**Note:** Only company admins have the ability to generate API tokens. See your internal company's admin if you need to be added to the admin group.

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

*   Select the connection type as “Ironclad(REST)”
    
*   If the “Ironclad(REST) connection type is not present in your tenant then import the connection package using T2P
    
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

**Note:** Update TOKEN as per your Ironclad details.

Use the following format to connect to the Ironclad application:

{

"authentications": {

"acctAuth": {

"authType": "oauth2",

"url": "[https://ironcladapp.com/scim/v2/Users]("https://ironcladapp.com/scim/v2/Users")",

"httpMethod": "GET",

"httpParams": {},

"httpHeaders": {

"contentType": "application/json"

},

"httpContentType": "application/json",

"expiryError": "ExpiredAuthenticationToken",

"authError": \[

"InvalidAuthenticationToken",

"AuthenticationFailed"

\],

"retryFailureStatusCode": \[

401

\],

"timeOutError": "Read timed out",

"errorPath": "errors.type",

"maxRefreshTryCount": 5,

"tokenResponsePath": "",

"tokenType": "Bearer",

"accessToken": "Bearer ABCDxxxx"

}

}

}

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatrory**

AccountEntImport JSON

Specify this parameter to reconcile the accounts and entitlements

Use the following format to import accounts and entitlements using the Ironclad application:

{

"accountParams": {

"connection": "acctAuth",

"processingType": "SequentialAndIterative",

"statusAndThresholdConfig": {

"statusColumn": "customproperty7",

"activeStatus": \[

"true"

\],

"deleteLinks": true,

"accountThresholdValue": 1000,

"correlateInactiveAccounts": false,

"inactivateAccountsNotInFile": true,

"deleteAccEntForActiveAccounts": true

},

"call": {

"call1": {

"callOrder": 0,

"stageNumber": 0,

"http": {

"url": "[https://ironcladapp.com/scim/v2/Users]("https://ironcladapp.com/scim/v2/Users")",

"httpHeaders": {

"Authorization": "${access\_token}",

"Accept": "application/json"

},

"httpContentType": "application/json",

"httpMethod": "GET"

},

"listField": "Resources",

"keyField": "accountID",

"colsToPropsMap": {

"accountID": "id~#~char",

"name": "userName~#~char",

"status": "active~#~char",

"customproperty1": "name.givenName~#~char",

"customproperty2": "name.familyName~#~char",

"customproperty3": "schemas~#~char",

"customproperty4": "emails\[0\].value~~#~char",

"customproperty5": "emails\[0\].type~#~char",

"customproperty6": "emails\[0\].primary~#~char",

"customproperty7": "active~#~char"

},

"pagination": {

"page": {

"pageSizeParam": "perPage",

"pageSize": 50,

"pageRecordCount": "completeResponseMap.itemsPerPage",

"pageNumberParam": "page",

"totalCountPath": "completeResponseMap.totalResults",

"firstPageNumber": 0

}

}

}

}

},

"entitlementParams": {

"connection": "acctAuth",

"processingType": "SequentialAndIterative",

"entTypes": {

"Groups": {

"entTypeOrder": 0,

"call": {

"call1": {

"callOrder": 0,

"stageNumber": 0,

"http": {

"url": "[https://ironcladapp.com/scim/v2/Groups]("https://ironcladapp.com/scim/v2/Groups")",

"httpHeaders": {

"Authorization": "${access\_token}",

"Accept": "application/json"

},

"httpContentType": "application/json",

"httpMethod": "GET"

},

"listField": "Resources",

"keyField": "entitlementID",

"colsToPropsMap": {

"entitlementID": "id~#~char",

"entitlement\_value": "displayName~#~char",

"customproperty1": "schemas\[0\]~#~char",

"customproperty2": "externalId~#~char",

"customproperty3": "members\[0\].type~#~char",

"customproperty4": "members\[0\].$ref~#~char",

"customproperty5": "members\[0\].value~~#~char",

"acctEntMappingInfoColumnFromEnt": "STORE#ACC#ENT#MAPPINGINFO~#~char"

}

}

},

"acctEntMappings": {

"listField": "members",

"idPath": "value",

"keyField": "accountID",

"importAsAccount": false

}

}

}

},

"acctEntParams": {

"processingType": "entToAcctMapping"

}

}

Yes

###### **Configuration Parameter for Provisioning**

**Parameter**

**Description**

**Recommended Configuration**

**Support for Binding Variables?**

**Support for Java Ternary Operations?**

CreateAccountJSON

Specify this parameter to create an account in the target application.

Use the following format to create accounts using the Ironclad application:

{

"accountIdPath": "call1.message.id",

"responseColsToPropsMap": {

"displayName": "call1.message.userName~#~char",

"firstname": "call1.message.name.givenName~#~char",

"lastname": "call1.message.name.familyName~#~char"

},

"call": \[{

"name": "call1",

"connection": "acctAuth",

"url": "[https://ironcladapp.com/scim/v2/Users]("https://ironcladapp.com/scim/v2/Users")",

"httpMethod": "POST",

"httpParams": "{\\"schemas\\":\[\\"urn:ietf:params:scim:schemas:core:2.0:User\\"\],\\"name\\":{\\"givenName\\":\\"${user.firstname}\\",\\"familyName\\":\\"${user.lastname}\\"},\\"userName\\":\\"${user.username}\\"}",

"httpHeaders": {

"Authorization": "${access\_token}",

"Accept": "application/json"

},

"httpContentType": "application/json",

"successResponses": {

"statusCode": \[

200,

201

\]

}

}\]

}

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

Use the following format to update accounts using the Ironclad application:

{

"call": \[{

"name": "call1",

"connection": "acctAuth",

"url": "[https://ironcladapp.com/scim/v2/Users/${account.accountID]("https://ironcladapp.com/scim/v2/Users/${account.accountID")}",

"httpMethod": "PATCH",

"httpParams": "{\\"schemas\\":\[\\"urn:ietf:params:scim:api:messages:2.0:PatchOp\\"\],\\"Operations\\":\[{\\"op\\":\\"replace\\",\\"path\\":\\"name.familyName\\",\\"value\\":\\"${user.lastname}\\"}\]}",

"httpHeaders": {

"Authorization": "${access\_token}",

"Accept": "application/json"

},

"httpContentType": "application/json",

"successResponses": {

"statusCode": \[

200,

201

\]

}

}\]

}

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

Use the following format to add access using the Ironclad application:

{

"call": \[{

"name": "Entitlement",

"connection": "acctAuth",

"url": " [https://ironcladapp.com/scim/v2/Groups/${entitlementValue.entitlementID]("https://ironcladapp.com/scim/v2/Groups/${entitlementValue.entitlementID")}",

"httpMethod": "PATCH",

"httpParams": "{\\"schemas\\":\[\\"urn:ietf:params:scim:api:messages:2.0:PatchOp\\"\],\\"Operations\\":\[{\\"path\\":\\"members\\",\\"value\\":\[{\\"value\\":\\"${account.accountID}\\"}\],\\"op\\":\\"add\\"}\]}",

"httpHeaders": {

"Authorization": "${access\_token}",

"Accept": "application/json"

},

"httpContentType": "application/json",

"successResponses": {

"statusCode": \[

200,

201

\]

}

}\]

}

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

{

"call": \[{

"name": "Entitlement",

"connection": "acctAuth",

"url": " [https://ironcladapp.com/scim/v2/Groups/${entitlementValue.entitlementID]("https://ironcladapp.com/scim/v2/Groups/${entitlementValue.entitlementID")}",

"httpMethod": "PATCH",

"httpParams": "{\\"schemas\\":\[\\"urn:ietf:params:scim:api:messages:2.0:PatchOp\\"\],\\"Operations\\":\[{\\"path\\":\\"members\\",\\"value\\":\[{\\"value\\":\\"${account.accountID}\\"}\],\\"op\\":\\"remove\\"}\]}",

"httpHeaders": {

"Authorization": "${access\_token}",

"Accept": "application/json"

},

"httpContentType": "application/json",

"successResponses": {

"statusCode": \[

200,

201

\]

}

}\]

}

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

Use the following format to remove an account using the Ironclad application:

{

"call": \[{

"name": "call1",

"connection": "acctAuth",

"url": "[https://ironcladapp.com/scim/v2/Users/${account.accountID]("https://ironcladapp.com/scim/v2/Users/${account.accountID")}",

"httpMethod": "DELETE",

"httpParams": "{}",

"httpHeaders": {

"Authorization": "${access\_token}",

"Accept": "application/json"

},

"httpContentType": "application/json",

"successResponses": {

"statusCode": \[

204,

200,

201

\]

}

}\]

}

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

The connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out of the box connection templates available. Here are the steps to import the Ironclad connection package.

*   Download the [connection package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/6/1/Ironclad.zip" ""Connection").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “Ironclad” Connection.
    
*   Edit the connection with your Ironclad tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the Ironclad Integration
==============================

You can use the Ironclad integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run account import before running the access import.
    
*   Map all Ironclad attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Configuring Import Operations
-----------------------------

*   **Full account import:** When configuring the connection for the first time, first perform full import to import all existing accounts from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
    
*   **Full Access import:** When configuring the connection for the first time, first perform full import to import all existing access from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.
    

The import jobs are automatically created in EIC after you create a connection for the Ironclad integration. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").

### **Importing Accounts and Accesses**

You must import accounts after the users are available in EIC.

**To import accounts:** 

1.  Specify the connection and import parameters. For more information, see Configuration Parameters for [Account]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Accounts.htm" ""https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Accounts.htm"") and [Access]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Access.htm" ""https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Access.htm"") Import.  
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