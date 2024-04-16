> [!NOTE]
> The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework.

*   [Preface](#preface)
*   [Audience]("#audience)
*   [Introduction](#introduction)
    *   [Supported Features](#supported features)
    *   [Supported Software Versions](#supported Software Versions)  
*   [Understanding the Integration between EIC and  Adobe Creative Cloud](#Understanding the Integration between EIC and  Adobe Creative Cloud)
    *   [Integration Architecture](#Integration Architecture)
    *   [Setting Up the Integration](#Setting Up the Integration)
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=Up%20the%20Integration-,Prerequisites,-To%20obtain%20the" ""https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=Up%20the%20Integration-,Prerequisites,-To%20obtain%20the"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=see%20Adobe%20documentation-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=see%20Adobe%20documentation-,Creating%20a%20Connection,-Connection%20refers%20to"")
            
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=Yes-,Importing%20Connection%20Package,-connection%20package%20helps" ""https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=Yes-,Importing%20Connection%20Package,-connection%20package%20helps"")
            
        *   [Creating a Security System]("https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=Cloud%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system" ""https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=Cloud%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system"")
            
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to"")
            
*   [Using the  Adobe Creative Cloud Integration]("http://Using ""Using")
    
    *   [Guidelines for Using the Integration]("http://Guidelines ""Guidelines")
        
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import" ""https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import"")
        
        *   [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import" ""https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import"")
            
    *   [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically" ""https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/integration-drafts/adobe-cloud-integration-guide/ta-p/33790#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common"")
    

# Preface

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and  Adobe Creative Cloud.

# Audience


This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with  Adobe Creative Cloud.

# Introduction


**Adobe Creative Cloud** is a set of applications and services from Adobe Inc. that gives subscribers access to a collection of software used for graphic design, video editing, web development, and photography, along with a set of mobile applications and also some optional cloud services

The  Adobe Creative Cloud connector enables you to seamlessly integrate with  Adobe Creative Cloud to manage user lifecycle and govern access to their Groups.

For more information about different connectors in EIC, see  [Saviynt Enterprise Identity Cloud Connectors](https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm).

**Note:** This guide provides information about using the  Adobe Creative Cloud REST connector using REST API for performing operations listed in the Supported Features.

## Supported Features


The  Adobe Creative Cloud integration supports the following features:

  

### Supported Software Versions

| **Software** | **Version** | 
| ------------ | ----------- |
| EIC | Release v5.5 and later| 

Understanding the Integration between EIC and  Adobe Creative Cloud
===================================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and de-provisioning tasks. The following components are involved in the integration:

*   The Complete Service Management platform  Adobe Creative Cloud combines ITSM with ESM and SIAM capabilities, enabling all internal departments, such as IT, HR, and Facilities, as well as external service providers and customers, to collaborate securely and seamlessly on one complete platform, reducing complexity and improving productivity.
    
*   **Objects** are imported as entitlement types into EIC.
    
*   **Security System** represents the connection between EIC and the target application.
    
    * It comprises an endpoint, which is the target application for which you want EIC to manage the identity repository.
    * It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see [Creating a Security System](https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm).
        
*   **Endpoint** is an instance of an application within the context of a security system.
    
    * It is the target application or application from which the connector imports the data and performs provisioning or de-provisioning of identity objects, such as users, accounts, and entitlements.
        
    * It is mandatory to create an endpoint after creating the security system.  
      You can associate a single security system with multiple endpoints if the deployment involves modeling multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see [Creating an Endpoint for the Security System](https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm).
        
*   **The connector** is a software component that enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing, provisioning accounts, and accessing through the REST APIs. For more information about creating a connection, see [Creating a Connection](https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x).
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import or provisioning operations from EIC.  
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the  Adobe Creative Cloud integration.
    

## Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with  Adobe Creative Cloud for importing data and for performing provisioning and de-provisioning tasks.

The following diagram illustrates the integration architecture and communication with the target application.

## Setting Up the Integration
--------------------------

### Prerequisites

To obtain the credentials you need to access the User Management service, create a **Service Account Integration** using the [Adobe I/O Console](https://console.adobe.io/).

* A member of the organization with admin rights can create the Integration. You can use the Admin Console to grant administrative privileges to users.
* You will need to create or purchase a digital signing certification and use it to sign a JSON Web Token (JWT), which you will use to authenticate your requests.  
* Your integration provides an API key that uniquely identifies your client, and other credentials that you need to access the UM API. 
* For complete details of the entire integration process, see [Adobe documentation](https://adobe-apiplatform.github.io/umapi-documentation/en/api/user.html)  
      
    

### Creating a Connection

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see [Creating a Connection](https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x).

#### Understanding the Configuration Parameters

While creating a connection, you must specify connection parameters that the connector uses to connect with the target application, define the type of operations to perform, the target application objects against which those operations are performed, and the frequency of performing them. In addition, you can view and edit attribute mappings between EIC and the target application, predefined correlation rules, and provisioning jobs and import jobs.

##### Configuration Parameters for Account and Access Import

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

*   Select the connection type as “ Adobe Creative Cloud (REST)”
    
*   If the “ Adobe Creative Cloud (REST) connection type is not present in your tenant then import the connection package using T2P
    
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

**Note:**

*   Validate the generated JWT token in Postman
    

Use the following format to connect to the  Adobe Creative Cloud application:

{  
"authentications": {  
"acctAuth": {  
"authType": "Jwt",  
"httpParamsName": "jwt\_token",  
"jwtConfig": {  
"jwtHeader": {  
"alg": "RS256",  
"typ": "JWT"  
},  
"jwtPayload": {  
"exp": 1675754298,  
"iss": "@@ISSUER@@",  
"sub": "@@SUBJECT@@",  
"@@INSTANCE\_URL@@/s/ent\_user\_sdk": true,  
"aud": "@@INSTANCE\_URL@@/c/@@ORG\_ID@@"  
},  
"signedAlgorithm": "RS256",  
"key": "@@KEY@@",  
"jwtExpiryDuration": 120  
},  
"url": "@@INSTANCE\_URL@@/ims/exchange/jwt",  
"httpMethod": "POST",  
"httpParams": {  
"client\_id": "@@CLIENT\_ID@@",  
"client\_secret": "@@CLIENT\_SECRET@@"  
},  
"httpContentType": "multipart/form-data",  
"retryFailureStatusCode": \[  
401,  
500,  
400  
\],  
"authError": \[  
"SESSION\_NOT\_VALID",  
"AuthenticationFailed",  
"ExpiredJwtException"  
\],  
"errorPath": "code",  
"maxRefreshTryCount": 5,  
"tokenResponsePath": "access\_token",  
"tokenType": "Bearer",  
"accessToken": "Bearer abcd"  
}  
}  
}

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatory?**

AccountEntImport JSON

Specify this parameter to reconcile the accounts and entitlements

Use the following format to import accounts and entitlements using the  Adobe Creative Cloud application:  
  
{  
"accountParams": {  
"connection": "acctAuth",  
"processingType": "SequentialAndIterative",  
"statusAndThresholdConfig": {  
"statusColumn": "customproperty11",  
"activeStatus": \[  
"active"  
\],  
"deleteLinks": true,  
"accountThresholdValue": 10,  
"correlateInactiveAccounts": false,  
"inactivateAccountsNotInFile": true,  
"deleteAccEntForActiveAccounts": true  
},  
"call": {  
"call1": {  
"callOrder": 0,  
"stageNumber": 0,  
"http": {  
"url": "[https://usermanagement.adobe.io/v2/usermanagement/users/@@ORG\_ID@@/0]("https://usermanagement.adobe.io/v2/usermanagement/users/@@ORG_ID@@/0")",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"x-api-key": "@@X-API-KEY@@",  
"Accept": "application/json"  
},  
"httpMethod": "GET"  
},  
"listField": "users",  
"keyField": "accountID",  
"statusConfig": {  
"active": "true",  
"inactive": "false"  
},  
"colsToPropsMap": {  
"accountID": "id~#~char",  
"name": "email~#~char",  
"displayName": "username~#~char",  
"customproperty2": "email~#~char",  
"customproperty11": "status~#~char",  
"customproperty13": "country~#~char",  
"customproperty15": "domain~#~char",  
"customproperty31": "STORE#ACC#ENT#MAPPINGINFO~#~char"  
},  
"pagination": {  
"nextUrl": {  
"nextUrlPath": "${response?.objectList?.size()>0?'[https://usermanagement.adobe.io/v2/usermanagement/users/@@ORG\_ID@@/'+Math.addExact(headers?.X-Current-Page,1)+':null]("https://usermanagement.adobe.io/v2/usermanagement/users/@@ORG_ID@@/'+Math.addExact(headers?.X-Current-Page,1)+':null")}"  
}  
}  
}  
},  
"acctEntMappings": {  
"groups": {  
"listPath": "groups",  
"idPath": "",  
"keyField": "entitlement\_value"  
}  
}  
},  
"entitlementParams": {  
"connection": "acctAuth",  
"processingType": "SequentialAndIterative",  
"entTypes": {  
"groups": {  
"entTypeOrder": 1,  
"call": {  
"call1": {  
"callOrder": 0,  
"stageNumber": 0,  
"http": {  
"url": "[https://usermanagement.adobe.io/v2/usermanagement/groups/@@ORG\_ID@@/0]("https://usermanagement.adobe.io/v2/usermanagement/groups/@@ORG_ID@@/0")",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"x-api-key": "@@X-API-KEY@@",  
"Accept": "application/json"  
},  
"httpContentType": "application/json",  
"httpMethod": "GET"  
},  
"listField": "groups",  
"keyField": "entitlementID",  
"colsToPropsMap": {  
"entitlementID": "groupId~#~char",  
"entitlement\_value": "groupName~#~char",  
"customproperty20": "type~#~char",  
"customproperty21": "memberCount~#~char",  
"customproperty22": "adminGroupName~#~char",  
"customproperty23": "productName~#~char",  
"customproperty24": "licenseQuota~#~char"  
},  
"pagination": {  
"nextUrl": {  
"nextUrlPath": "${response?.objectList?.size()>0?'[https://usermanagement.adobe.io/v2/usermanagement/groups/@@ORG\_ID@@/'+Math.addExact(headers?.X-Current-Page,1)+':null]("https://usermanagement.adobe.io/v2/usermanagement/groups/@@ORG_ID@@/'+Math.addExact(headers?.X-Current-Page,1)+':null")}"  
}  
}  
}  
}  
}  
}  
},  
"acctEntParams": {  
"entTypes": {  
"groups": {  
"call": {  
"call1": {  
"callOrder": 0,  
"stageNumber": 0,  
"processingType": "acctToEntMapping"  
}  
}  
}  
}  
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

{  
"accountIdPath": "call2.message.user.id",  
"call": \[  
{  
"name": "call1",  
"connection": "acctAuth",  
"showResponse": true,  
"url": "[https://usermanagement.adobe.io/v2/usermanagement/action/@@ORG\_ID@@]("https://usermanagement.adobe.io/v2/usermanagement/action/@@ORG_ID@@")",  
"httpMethod": "POST",  
"httpParams": "\[{\\"user\\":\\"${user.email}\\",\\"requestID\\":\\"action\_1\\",\\"do\\":\[{\\"addAdobeID\\":{\\"email\\":\\"${user.email}\\",\\"country\\":\\"${user.country}\\",\\"firstname\\":\\"${user.firstname}\\",\\"lastname\\":\\"${user.lastname}\\",\\"option\\":\\"ignoreIfAlreadyExists\\"}}\]}\]",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"Accept": "application/json",  
"x-api-key": "@@X-API-KEY@@"  
},  
"httpContentType": "application/json",  
"successResponses": {  
"result": "success"  
}  
},  
{  
"name": "call2",  
"connection": "acctAuth",  
"showResponse": true,  
"url": "[https://usermanagement.adobe.io/v2/usermanagement/organizations/@@ORG\_ID@@/users/${user.email]("https://usermanagement.adobe.io/v2/usermanagement/organizations/@@ORG_ID@@/users/${user.email")}",  
"httpMethod": "GET",  
"httpParams": "",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"Accept": "application/json",  
"x-api-key": "@@X-API-KEY@@"  
},  
"httpContentType": "application/json",  
"successResponses": {  
"statusCode": \[  
200,  
201  
\]  
}  
}  
\]  
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

Use the following format to add access using the  Adobe Creative Cloud application:

{  
"call": \[  
{  
"name": "groups",  
"connection": "acctAuth",  
"url": "[https://usermanagement.adobe.io/v2/usermanagement/action/@@ORG\_ID@@]("https://usermanagement.adobe.io/v2/usermanagement/action/@@ORG_ID@@")",  
"httpMethod": "POST",  
"httpParams": "\[{\\"user\\" : \\"${user.email}\\",\\"requestID\\": \\"action\_1\\",\\"do\\" : \[{\\"add\\": {\\"group\\": \[\\"${entitlementValue.entitlement\_value}\\"\]}}\]}\]",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"X-Api-Key": "@@X-API-KEY@@",  
"Accept": "application/json"  
},  
"httpContentType": "application/json",  
"successResponses": {  
"statusCode": \[  
200,  
201,  
204,  
205  
\]  
}  
}  
\]  
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

Use the following format to remove access using the  Adobe Creative Cloud application:

{  
"call": \[  
{  
"name": "groups",  
"connection": "acctAuth",  
"url": "[https://usermanagement.adobe.io/v2/usermanagement/action/@@ORG\_ID@@]("https://usermanagement.adobe.io/v2/usermanagement/action/@@ORG_ID@@")",  
"httpMethod": "POST",  
"httpParams": "\[{\\"user\\" : \\"${user.email}\\",\\"requestID\\": \\"action\_1\\",\\"do\\" : \[{\\"remove\\": {\\"group\\": \[\\"${entitlementValue.entitlement\_value}\\"\]}}\]}\]",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"X-Api-Key": "@@X-API-KEY@@",  
"Accept": "application/json"  
},  
"httpContentType": "application/json",  
"successResponses": {  
"statusCode": \[  
200  
\]  
}  
}  
\]  
}

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

Use the following format to remove an account using the  Adobe Creative Cloud application:

{  
"call": \[  
{  
"name": "call1",  
"connection": "acctAuth",  
"url": "[https://usermanagement.adobe.io/v2/usermanagement/action/@@ORG\_ID@@]("https://usermanagement.adobe.io/v2/usermanagement/action/@@ORG_ID@@")",  
"httpMethod": "POST",  
"httpParams": "\[{\\"user\\" : \\"${user.email}\\",\\"requestID\\": \\"action\_1\\",\\"do\\" : \[{\\"removeFromOrg\\": {\\"deleteAccount\\": \\"false\\"}}\]}\]",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"X-Api-Key": "@@X-API-KEY@@",  
"Accept": "application/json"  
},  
"httpContentType": "application/json",  
"successResponses": {  
"statusCode": \[  
200  
\]  
}  
}  
\]  
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

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out-of-the-box connection templates available. Here are the steps to import the  Adobe Creative Cloud connection package.

*   Download the connection package attached below.
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “ Adobe Creative Cloud ” Connection.
    
*   Edit the connection with your  Adobe Creative Cloud tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the  Adobe Creative Cloud Integration
===========================================

You can use the  Adobe Creative Cloud integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run the account import before running the access import.
    
*   Map all  Adobe Creative Cloud attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Configuring Import Operations
-----------------------------

*   **Full account import:** When configuring the connection for the first time, first perform the full import to import all existing accounts from the target application to EIC. To perform a full import, the invoke API gets the response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
    
*   **Full Access import:** When configuring the connection for the first time, first perform the full import to import all existing access from the target application to EIC. To perform a full import, the invoke API gets a response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.
    

The import jobs are automatically created in EIC after you create a connection for the  Adobe Creative Cloud integration. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").

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
