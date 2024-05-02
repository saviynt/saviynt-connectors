**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users and verified by Saviynt. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework.

**Contributor** - [Vedanth B.K]("https://www.linkedin.com/in/vedanthbk" ""https://www.linkedin.com/in/vedanthbk"")

**Contents**

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=Troubleshooting-,Preface,-This%20guide%20describes")
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=EIC)%20and%20Onetrust.-,Audience,-This%20guide%20is")
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=service%20with%20Onetrust.-,Introduction,-OneTrust%20provides%20an")
    *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=The%20Onetrust%20integration%20supports%20the%20following%C2%A0features%3A")
*   [Understanding the Integration between EIC and Onetrust]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Onetrust,-You%20must%20create")
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=the%20Onetrust%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a")
    *   [Setting Up the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=Onetrust%20Integration%20Architecture-,Setting%20Up%20the%20Integration,-Prerequisites")
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=Up%20the%20Integration-,Prerequisites,-Onetrust%20uses%20Client")
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=the%20client%20credential.-,Creating%20a%20Connection,-Connection%20refers%20to")
            *   [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=Creating%20Connections.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a")
                *   [Configuration Parameters for Account and Access Import]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=and%20import%20jobs.-,Configuration%20Parameters%20for%20Account%20and%20Access%20Import,-The%20connector%20uses")
                    *   [Connection Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter")
                    *   [Import Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=Yes-,Import%C2%A0Parameters,-Parameter")
                *   [Configuration Parameter for Provisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=Yes-,Configuration%20Parameter%20for%20Provisioning,-Parameter")
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=Yes-,Importing%20Connection%20Package,-The%20connection%20package")
        *   [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=Onetrust%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system")
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to")
*   [Using the Onetrust Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=Creating%20Endpoints.-,Using%20the%20Onetrust%20Integration,-You%20can%20use")
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply")
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import")
        *   [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=the%20Onetrust%20integration.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import")
    *   [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically")
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/onetrust-integration-guide/ta-p/30253#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common")

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Onetrust.

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with Onetrust.

Introduction
============

OneTrust provides an application solution to aid customers with Privacy, Security, and Data Governance to meet privacy management, third-party risk monitoring, GRC functions, and data governance for various information security standards. The integration allows customers to manage user lifecycle and access to Groups.

For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the Onetrust(REST) connector for performing operations listed in the Supported Features

**The Onetrust integration supports the following features:**

**Full Import****Incremental Import****Lifecycle Management****Add or Remove Access**

### Supported Software Versions

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Onetrust
======================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and de-provisioning tasks. The following components are involved in the integration:

*   **Onetrust** is the target application for which EIC manages the identity lifecycle. Onetrust integrates with EIC through the connector to manage accounts.
    
*   **Objects** are imported as entitlement types into EIC.
    
*   **Security System** represents the connection between EIC and the target application.
    
    *   It comprises an endpoint, which is the target application for which you want EIC to manage the identity repository.
        
    *   It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"").
        
*   **Endpoint** is an instance of an application within the context of a security system.
    
    *   It is the target application or application from which the connector performs provisioning or de-provisioning of identity objects, such as users, accounts, and entitlements.
        
    *   It is mandatory to create an endpoint after creating the security system.  
        You can associate a single security system with multiple endpoints if the deployment involves modeling multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see [Creating an Endpoint for the Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").
        
*   **Connector** is a software component that enables the communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The (REST-based) Connector is used for provisioning accounts and access through the REST APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform provisioning operations from EIC.  
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the Onetrust integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Onetrust for importing data and for performing provisioning and de-provisioning tasks. The REST connection uses the REST protocol to communicate with the REST interface of Onetrust. 

The following diagram illustrates the integration architecture and communication with the target application.  

Figure: Onetrust Integration Architecture

Setting Up the Integration
--------------------------

### Prerequisites

Onetrust uses Client credentials for integrating with Onetrust. Perform the following steps to generate a Cloud API key.

1.  On your account page, click the gear icon in the upper right to access Global Settings.
    
2.  From the Global Settings menu, select Credentials.
    
3.  Click Add. ...
    
4.  In the Client Credentials section, add a value in the Name field for the client credential.
    

### Creating a Connection

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see [Creating Connections]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").

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

Select the connection type as **REST**.

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

Use the following format to connect to the Onetrust application:  
{  
"authentications": {  
"acctAuth": {  
"authType": "oauth2",  
"url": "https://@@HOSTNAME@@/api/access/v1/oauth/token",  
"httpMethod": "POST",  
"httpParams": {  
"client\_id": "@@CLIENT\_ID",  
"client\_secret ": "@@CLIENT\_SECRET@@",  
"grant\_type": "client\_credentials"  
},  
"httpHeaders": {  
"Content-Type": "application/x-www-form-urlencoded"  
},  
"authError": \[  
"InvalidAuthenticationToken"  
\],  
"httpContentType": "application/x-www-form-urlencoded",  
"errorPath": "error.code",  
"maxRefreshTryCount": 5,  
"tokenResponsePath": "access\_token",  
"tokenType": "Bearer",  
"retryFailureStatusCode": \[  
401  
\],  
"accessToken": "Bearer ABCD"  
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

Use the following format to reconcile accounts and entitlements using the Onetrust application:    
{  
"accountParams": {  
"connection": "acctAuth",  
"processingType": "SequentialAndIterative",  
"statusAndThresholdConfig": {  
"statusColumn": "customproperty11",  
"activeStatus": \[  
"true"  
\],  
"deleteLinks": true,  
"accountThresholdValue": 100,  
"correlateInactiveAccounts": false,  
"inactivateAccountsNotInFile": true,  
"deleteAccEntForActiveAccounts": true  
},  
"call": {  
"call1": {  
"callOrder": 0,  
"stageNumber": 0,  
"http": {  
"url": "https://@@HOSTNAME@@/api/scim/v3/Users",  
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
"displayName": "userName~#~char",  
"customproperty2": "emails\[0\].value~#~char",  
"customproperty3": "meta.created~#~char",  
"customproperty4": "meta.lastModified~#~char",  
"customproperty5": "userType~#~char",  
"customproperty6": "emails\[0\].type~#~char",  
"customproperty7": "title~#~char",  
"customproperty8": "urn:ietf:params:scim:schemas:extension:enterprise:2.0:User.department",  
"customproperty9": "urn:ietf:params:scim:schemas:extension:enterprise:2.0:User.employeeNumber",  
"customproperty10": "urn:ietf:params:scim:schemas:extension:enterprise:2.0:User.officeLocation",  
"status": "active~#~char",  
"customproperty11": "active~#~char",  
"customproperty31": "STORE#ACC#ENT#MAPPINGINFO~#~char"  
},  
"pagination": {  
"page": {  
"pageSizeParam": "count",  
"pageSize": 50,  
"pageRecordCount": "completeResponseMap.itemsPerPage",  
"pageNumberParam": "startIndex",  
"totalCountPath": "completeResponseMap.totalResults",  
"firstPageNumber": 1  
}  
}  
}  
},  
"acctEntMappings": {  
"Group": {  
"listPath": "groups",  
"idPath": "value",  
"keyField": "entitlementID"  
}  
}  
},  
"entitlementParams": {  
"connection": "acctAuth",  
"processingType": "SequentialAndIterative",  
"entTypes": {  
"Group": {  
"entTypeOrder": 0,  
"entTypeLabels": {  
"customproperty1": "Deleted",  
"customproperty2": "CreatedAt",  
"customproperty3": "UpdatedAt"  
},  
"call": {  
"call1": {  
"callOrder": 0,  
"stageNumber": 0,  
"http": {  
"url": "https://@@HOSTNAME@@/api/scim/v3/Groups",  
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
"customproperty1": "urn:ietf:params:scim:schemas:onetrust:Group.category~#~char",  
"customproperty2": "urn:ietf:params:scim:schemas:onetrust:Group.description~#~char"  
},  
"pagination": {  
"page": {  
"pageSizeParam": "count",  
"pageSize": 50,  
"pageRecordCount": "completeResponseMap.itemsPerPage",  
"pageNumberParam": "startIndex",  
"totalCountPath": "completeResponseMap.totalResults",  
"firstPageNumber": 1  
}  
},  
"disableDeletedEntitlements": true  
}  
}  
}  
}  
},  
"acctEntParams": {  
"processingType": "acctToEntMapping"  
}  
}

Yes

##### **Configuration Parameter for Provisioning**

**Parameter**

**Description**

**Recommended Configuration**

**Support for Binding Variables?**

**Support for Java Ternary Operations?**

CreateAccountJSON

Specify this parameter to create an account in the target application.

Use the following format to create accounts using the Onetrust application:

{  
"accountIdPath": "call1.message.id",  
"dateFormat": "yyyy-MM-dd'T'HH:mm:ssXXX",  
"responseColsToPropsMap": {  
"displayName": "call1.message.userName~#~char",  
"customproperty6": "call1.message.emails\[0\].type~#~char",  
"customproperty2": "call1.message.emails\[0\].value~#~char",  
"customproperty7": "call1.message.title~#~char"  
},  
"call": \[  
{  
"name": "call1",  
"connection": "acctAuth",  
"url": "https://@@HOSTNAME@@/api/scim/v3/Users",  
"httpMethod": "POST",  
"httpParams": "{\\"name\\":{\\"familyName\\":\\"${user.firstname}\\",\\"givenName\\":\\"${user.lastname}\\"},\\"emails\\":\[{\\"value\\":\\"${user.email}\\",\\"type\\":\\"${user.customproperty6}\\"}\],\\"userType\\":\\"External\\",\\"active\\":true,\\"title\\":\\"${user.customproperty7}\\"}",  
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
}  
\]  
}

For more information on description of attributes in this parameter, see [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm"").

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

UpdateAccountJSON

Specify this parameter to update an account in the target application.

  
  
  

{  
"dateFormat": "yyyy-MM-dd'T'HH:mm:ssXXX",  
"responseColsToPropsMap": {  
"displayName": "call1.message.user.name~#~char"  
},  
"call": \[  
{  
"name": "call1",  
"connection": "acctAuth",  
"url": "https://@@HOSTNAME@@/api/scim/v3/Users/${account.accountID}",  
"httpMethod": "PUT",  
"httpParams": "{\\"name\\":{\\"familyName\\":\\"${user.firstname}\\",\\"givenName\\":\\"${user.lastname}\\"},\\"emails\\":\[{\\"value\\":\\"${user.email}\\",\\"type\\":\\"${user.custompropertry6}\\"}\],\\"urn:ietf:params:scim:schemas:extension:enterprise:2.0:User\\":{\\"department\\":\\"${user.custompropertry}\\",\\"officeLocation\\":\\"${user.custompropertry10}\\",\\"employeeNumber\\":\\"${user.custompropertry9}\\"},\\"userType\\":\\"${user.custompropertry5}\\"}",  
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
}  
\]  
}

For more information on description of attributes in this parameter, see [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm"").

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
    
*   Account
    

Yes

EnableAccountJSON

Specify this parameter to enable an account in the target application.

{  
"call": \[  
{  
"name": "call1",  
"connection": "acctAuth",  
"url": "https://@@HOSTNAME@@/api/scim/v3/Users/${account.accountID}",  
"httpMethod": "PATCH",  
"httpParams": "{{\\"Operation\\":\[{\\"value\\":{\\"active\\":true}}\]}",  
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
}  
\]  
}

For more information on description of attributes in this parameter, see [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm"").

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
    
*   Account
    

Yes

DisableAccountJSON

Specify this parameter to disable an account in the target application.

{  
"call": \[  
{  
"name": "call1",  
"connection": "acctAuth",  
"url": "https://@@HOSTNAME@@/api/scim/v3/Users/${account.accountID}",  
"httpMethod": "PATCH",  
"httpParams": "{{\\"Operation\\":\[{\\"value\\":{\\"active\\":false}}\]}",  
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
}  
\]  
}

For more information on description of attributes in this parameter, see [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm"").

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
    
*   Account
    

Yes

AddAccessJSON

Specify this parameter to add access to an account.

{  
"call": \[  
{  
"name": "Group",  
"connection": "acctAuth",  
"url": "https://@@HOSTNAME@@/api/scim/v3/Groups/${entitlementValue.entitlementID}",  
"httpMethod": "PATCH",  
"httpParams": "{\\"Operations\\":\[{\\"members\\":\[{\\"value\\":\\"${account.accountID}\\",\\"type\\":\\"Add\\"}\]}\]}",  
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
}  
\]  
}

For more information on description of attributes in this parameter, see [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm"").

The bindings supported are:

*   ServiceAccountOwnerMap
    
*   endpoints
    
*   userManager
    
*   approvers
    
*   arsTasks/task
    
*   managerAccount
    
*   requestid
    
*   response
    
*   connection
    
*   userAccount
    
*   requestAccessAttributes/reqAttrs
    
*   businessJustification
    
*   user
    
*   account
    
*   entitlementValue
    

Yes

RemoveAccessJSON

Specify this parameter to Remove access from an account.

{  
"call": \[  
{  
"name": "Group",  
"connection": "acctAuth",  
"url": "https://@@HOSTNAME@@/api/scim/v3/Groups/${entitlementValue.entitlementID}",  
"httpMethod": "PATCH",  
"httpParams": "{\\"Operations\\":\[{\\"members\\":\[{\\"value\\":\\"${account.accountID}\\",\\"type\\":\\"Remove\\"}\]}\]}",  
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
}  
\]  
}

For more information on description of attributes in this parameter, see [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm"").

The bindings supported are:

*   ServiceAccountOwnerMap
    
*   endpoints
    
*   userManager
    
*   approvers
    
*   arsTasks/task
    
*   managerAccount
    
*   requestid
    
*   response
    
*   connection
    
*   userAccount
    
*   requestAccessAttributes/reqAttrs
    
*   businessJustification
    
*   user
    
*   account
    
*   entitlementValue
    

Yes

RemoveAccountJSON

Specify this parameter to remove an account. 

Use the following format to remove an account using the Onetrust application:

{  
"call": \[  
{  
"name": "call1",  
"connection": "acctAuth",  
"url": "https://@@HOSTNAME@@/api/scim/v2/Users/${account.accountID}",  
"httpMethod": "DELETE",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"Accept": "application/json"  
},  
"httpContentType": "application/json",  
"successResponses": {  
"statusCode": \[  
200,  
201,  
204  
\]  
}  
}  
\]  
}

For more information on description of attributes in this parameter, see [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm"").

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

### Importing Connection Package

The connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out-of-the-box connection templates available. Here are the steps to import the Onetrust connection package.

*   [Download the connection package]("https://saviynt.freshdesk.com/helpdesk/attachments/152012062869" ""https://saviynt.freshdesk.com/helpdesk/attachments/152012062869"").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “Onetrust” Connection.
    
*   Edit the connection with your Onetrust tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the Onetrust Integration
==============================

You can use the Onetrust integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run the account import before running the access import.
    
*   Map all Onetrust attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Configuring Import Operations
-----------------------------

*   **Full account import:** When configuring the connection for the first time, first perform full import to import all existing accounts from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
    
*   **Full Access import:** When configuring the connection for the first time, first perform full import to import all existing access from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.
    

The import jobs are automatically created in EIC after you create a connection for the Onetrust integration.

### **Importing Accounts and Accesses**

You must import accounts after the users are available in EIC.

**To import accounts:** 

1.  Specify the connection and import parameters, see Configuration Parameters for [Account]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Accounts.htm" ""https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Accounts.htm"") and [Access]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Access.htm" ""https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Access.htm"") Import.  
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **Application Data Import (Single Threaded)** job to import accounts and access. For more information, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").
    

Configuring Provisioning and Deprovisioning
-------------------------------------------

Provisioning is automatically enabled when a connection is configured. For detailed information about performing provisioning tasks, see [Access Request System]("https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x"").

**To provision objects to the target application:**

1.  Specify the connection and provisioning parameters.   
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **Provisioning** job **(WSRETRY)**. For more information, see [Provisioning Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").
    

When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the connector.

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers to frequently asked questions for REST connectors, see the  [REST Connector guide]("https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm"").