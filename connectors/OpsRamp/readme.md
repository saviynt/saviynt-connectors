**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework.

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=Troubleshooting-,Preface,-This%20guide%20describes")
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=EIC)%20and%20OpsRamp.-,Audience,-This%20guide%20is")
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=service%20with%20OpsRamp.-,Introduction,-OpsRamp%C2%A0is%20an")
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20OpsRamp%20integration")
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software")
    *   [Understanding the Integration between EIC and OpsRamp]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0OpsRamp,-You%20must%20create" ""Understanding")
        *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=the%20OpsRamp%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a")
        *   [Setting Up the Integration]("http://Setting)
            *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=Up%20the%20Integration-,Prerequisites,-Generate%20%26%20Setup%20token")
            *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=ID%20and%20password.-,Creating%20a%20Connection,-Connection%20refers%20to")
            *   [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=Yes-,Importing%20Connection%20Package,-connection%20package%20helps")
            *   [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=Creating%20a%20Security-,System,-The%20security%20system")
            *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to")
        *   [Using the OpsRamp Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=Creating%20Endpoints.-,Using%20the%20OpsRamp%20Integration,-You%20can%20use")
            *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply")
            *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import")
                *   [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import")
            *   [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically")
        *   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/opsramp-integration-guide/ta-p/32049#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common")

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and OpsRamp.

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with OpsRamp.

Introduction
============

**OpsRamp** is an AIOps-powered IT operations management (ITOM) solution. **_OpsRamp_** delivers hybrid IT infrastructure, cloud monitoring services, event management

The **OpsRamp** connector enables you to seamlessly integrate with OpsRamp to manage user lifecycle and govern access to their Groups and Roles.

For more information about different connectors in EIC, see  [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm").

**Note:** This guide provides information about using the OpsRamp REST connector using REST API for performing operations listed in the Supported Features.

**Supported Features**
----------------------

The OpsRamp integration supports the following features:

  

### **Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and OpsRamp
=====================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and de-provisioning tasks. The following components are involved in the integration:

*   The Complete Service Management platform OpsRamp combines ITSM with ESM and SIAM capabilities, enabling all internal departments, such as IT, HR, and Facilities, as well as external service providers and customers, to collaborate securely and seamlessly on one complete platform, reducing complexity and improving productivity.
*   **Objects** are imported as entitlement types into EIC.
*   **Security System** represents the connection between EIC and the target application.
    *   It comprises an endpoint, which is the target application for which you want EIC to manage the identity repository.
    *   It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm").
*   **Endpoint** is an instance of an application within the context of a security system.
    *   It is the target application or application from which the connector imports the data and performs provisioning or de-provisioning of identity objects, such as users, accounts, and entitlements.
    *   It is mandatory to create an endpoint after creating the security system.  
        You can associate a single security system with multiple endpoints if the deployment involves modeling of multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see [Creating an Endpoint for the Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm").
*   **The connector** is a software component that enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing, provisioning accounts, and accessing through the REST APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x").
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import or provisioning operations from EIC.  
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the OpsRamp integration.

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with OpsRamp for importing data and for performing provisioning and de-provisioning tasks.

The following diagram illustrates the integration architecture and communication with the target application.

Setting Up the Integration
--------------------------

### **Prerequisites**

Generate & Setup token authentication

1.  Use your client ID and authentication credentials to obtain an access token and a refresh token using [https://hostname/auth/oauth/token]("https://hostname/auth/oauth/token")
2.  Once you have obtained these tokens you do not need to store authentication credentials.
3.  You can now authorize requests using the access token instead of a user ID and password.   

### **Creating a Connection**

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x").

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

·        Select the connection type as “OpsRamp (REST)”

·        If the “OpsRamp (REST) connection type is not present in your tenant then import the connection package using T2P

·        You can also create a new connection with type “REST” and use the JSONS specified in this document.

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

**Note:** Update TOKEN as per your OpsRamp details.

Use the following format to connect to the OpsRamp application:

{  
"authentications": {  
"userAuth": {  
"authType": "oauth2",  
"url": "[https://hostname/auth/oauth/token]("https://hostname/auth/oauth/token")",  
"httpParams": {  
"grant\_type": "client\_credentials",  
"client\_id":"vnkEe",  
"client\_secret":"abcd"  
},  
"authError": \[  
"InvalidAuthenticationToken",  
"invalid\_token",  
"Invalid access token"  
\],  
"httpMethod": "POST",  
"httpContentType": "application/x-www-form-urlencoded",  
"errorPath": "error.code",  
"maxRefreshTryCount": 5,  
"tokenResponsePath": "access\_token",  
"tokenType": "Bearer",  
"accessToken": "Bearer abcd",  
"retryFailureStatusCode": \[  
401,407  
\]  
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

Use the following format to import accounts and entitlements using the OpsRamp application:

{  
"accountParams": {  
"connection": "userAuth",  
"processingType": "SequentialAndIterative",  
"call": {  
"call1": {  
"callOrder": 0,  
"stageNumber": 0,  
"http": {  
"url": "[https://hostname/api/v2/tenants/msp\_1123/users/search]("https://hostname/api/v2/tenants/msp_1123/users/search")",  
"httpContentType": "application/json",  
"httpMethod": "GET",  
"httpHeaders": {  
"Authorization": "${access\_token}"  
}  
},  
"listField": "results",  
"keyField": "accountID",  
"colsToPropsMap": {  
"accountID": "id~#~char",  
"customproperty1": "firstName~#~char",  
"CUSTOMPROPERTY2": "lastName~#~char",  
"customproperty3": "email~#~char",  
"CUSTOMPROPERTY4": "organizationName~#~char",  
"name":"loginName~#~char",  
"CUSTOMPROPERTY5": "status~#~char",  
"customproperty31": "STORE#ACC#ENT#MAPPINGINFO~#~char"  
}  
}  
},  
"acctEntMappings": {  
"roles": {  
"listPath": "roles",  
"IdPath": "uniqueId",  
"KeyField": "entitlementID"

},  
"Groups": {  
"listPath": "userGroups",  
"IdPath": "uniqueId",  
"KeyField": "entitlementID"  
}  
}  
},  
"entitlementParams": {  
"connection": "userAuth",  
"processingType": "SequentialAndIterative",  
"entTypes": {  
"roles": {  
"entTypeOrder": 0,  
"call": {  
"call1": {  
"callOrder": 0,  
"stageNumber": 0,  
"http": {  
"httpHeaders": {  
"Authorization": "${access\_token}"  
},  
"url": "[https://hostname/api/v2/tenants/msp\_1123/roles/search]("https://hostname/api/v2/tenants/msp_1123/roles/search")",  
"httpContentType": "application/json",  
"httpMethod": "GET"  
},  
"listField": "results",  
"keyField": "entitlementID",  
"colsToPropsMap": {  
"entitlementID": "uniqueId~#~char",  
"customproperty7": "id~#~char",  
"entitlement\_value": "name~#~char",  
"customproperty1": "uniqueId~#~char",  
"customproperty5": "description~#~char"  
}  
}  
}  
},  
"Groups": {  
"entTypeOrder": 1,  
"entTypeLabels": {},  
"call": {  
"call1": {  
"connection": "userAuth",  
"callOrder": 0,  
"stageNumber": 0,  
"http": {  
"httpHeaders": {  
"Authorization": "${access\_token}"  
},  
"url": "[https://hostname/api/v2/tenants/msp\_1123/userGroups]("https://hostname/api/v2/tenants/msp_1123/userGroups")",  
"httpContentType": "application/json",  
"httpMethod": "GET"  
},  
"listField": "results",  
"keyField": "entitlementID",  
"colsToPropsMap": {  
"description": "description~#~char",  
"customproperty3": "createdTime~#~char",  
"customproperty4": "updatedTime~#~char",  
"customproperty5": "email~#~char",  
"customproperty6": "uniqueId~#~char",  
"entitlementID": "uniqueId~#~char",  
"entitlement\_Value": "name~#~char"  
}  
}  
}  
}  
}  
},  
"acctEntParams": {  
"connection": "userAuth",  
"processingType": "acctToEntMapping"  
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

Use the following format to create accounts using the OpsRamp application:

  {  
"accountIdPath": "call1.message.id",  
"call": \[  
{  
"name": "call1",  
"connection": "userAuth",  
"url": "[https://hostname/api/v2/tenants/msp\_1123/users]("https://hostname/api/v2/tenants/msp_1123/users")",  
"httpMethod": "POST",  
"httpParams": "{\\"loginName\\":\\"${user.email}\\",\\"firstName\\": \\"${user.firstname}\\", \\"lastName\\": \\"${user.lastname}\\", \\"email\\": \\"${user.email}\\", \\"password\\":\\"ChangeMe@1234\\",\\"country\\": \\"${user.country}\\",\\"timeZone\\": { \\"code\\": \\"EST\\",\\"name\\": \\"Europe/Istanbul\\"}}",  
"httpHeaders": {  
"Authorization": "${access\_token}"  
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

·        ServiceAccountOwnerMap

·        endpoints

·        accountName

·        userManager

·        approvers

·        arsTasks/task

·        managerAccount

·        password

·        requestid

·        response

·        connection

·        userAccount

·        requestAccessAttributes/reqAttrs

·        businessJustification

·        user

Yes

Update Account JSON

Specify this parameter to update an account in the target application.

Use the following format to update accounts using the OpsRamp application:

{  
"accountIdPath": "call1.message.id",  
"call": \[  
{  
"name": "call1",  
"connection": "userAuth",  
"url": "[https://hostname/api/v2/tenants/msp\_1123/${account.accountID]("https://hostname/api/v2/tenants/msp_1123/${account.accountID")}",  
"httpMethod": "POST",  
"httpParams": "{\\"firstName\\": \\"${user.firstname}\\", \\"lastName\\": \\"${user.lastname}\\",\\"country\\": \\"${user.country}\\"}",  
"httpHeaders": {  
"Authorization": "${access\_token}"  
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

·        ServiceAccountOwnerMap

·        endpoints

·        accountName

·        userManager

·        approvers

·        arsTasks/task

·        managerAccount

·        password

·        requestid

·        response

·        connection

·        userAccount

·        requestAccessAttributes/reqAttrs

·        businessJustification

·        user

Yes

AddAccessJSON

Specify this parameter to add access to an account.

Use the following format to add access using the OpsRamp application:

  {  
"call": \[  
{  
"name": "roles",  
"connection": "userAuth",  
"url": "[https://hostname/api/v2/tenants/msp\_1123/roles/${entitlementValue.entitlementID]("https://hostname/api/v2/tenants/msp_1123/roles/${entitlementValue.entitlementID")}",  
"httpMethod": "POST",  
"httpParams": "{\\"uniqueId\\":\\"${entitlementValue.entitlementID}\\",\\"allClients\\":\\"true\\",\\"users\\": \[{ \\"id\\": \\"${account.accountID}\\",\\"loginName\\": \\"${user.systemUserName+'@sav.com'}\\",\\"lastName\\": \\"${account.customproperty2}\\",\\"firstName\\": \\"${account.customproperty1}\\",\\"email\\": \\"${user.systemUserName+'@sav.com'}\\"}\]}",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"Accept": "application/json"  
},  
"httpContentType": "application/json",  
"successResponses": {  
"statusCode": \[  
200  
\]  
}  
},  
{  
"name": "Groups",  
"connection": "userAuth",  
"url": "[https://hostname/api/v2/tenants/msp\_1123/userGroups/${entitlementValue.entitlementID}/users]("https://hostname/api/v2/tenants/msp_1123/userGroups/${entitlementValue.entitlementID}/users")",  
"httpMethod": "POST",  
"httpParams": "\[{\\"id\\":\\"${account.accountID}\\"}\]",  
"httpHeaders": {  
"Authorization": "${access\_token}"  
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

·        ServiceAccountOwnerMap

·        endpoints

·        accountName

·        userManager

·        approvers

·        arsTasks/task

·        managerAccount

·        password

·        requestid

·        response

·        connection

·        userAccount

·        requestAccessAttributes/reqAttrs

·        businessJustification

·        user

Yes

EnableAccountJSON

Specify this parameter to Enable an account in the target application.

Use the following format to update accounts using the Talend application:

  

{  
"call": \[  
{  
"name": "call1",  
"connection": "userAuth",  
"url": "[https://hostname/api/v2/tenants/msp\_1123/users/${account.accountID}/ACTIVATE]("https://hostname/api/v2/tenants/msp_1123/users/${account.accountID}/ACTIVATE")",  
"httpMethod": "POST",  
"httpHeaders": {  
"Authorization": "${access\_token}"  
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

·        ServiceAccountOwnerMap

·        endpoints

·        accountName

·        userManager

·        approvers

·        arsTasks/task

·        managerAccount

·        password

·        requestid

·        response

·        connection

·        userAccount

·        requestAccessAttributes/reqAttrs

·        businessJustification

·        user

Yes

DisableAccountJSON

Specify this parameter to Disable an account in the target application.

Use the following format to update accounts using the Talend application:

  

{  
"call": \[  
{  
"name": "call1",  
"connection": "userAuth",  
"url": "[https://hostname/api/v2/tenants/msp\_1123/users/${account.accountID}/DEACTIVATE]("https://hostname/api/v2/tenants/msp_1123/users/${account.accountID}/DEACTIVATE")",  
"httpMethod": "POST",  
"httpParams": "{\\"deactivateReason\\": \\"${user.customproperty7}\\"}",  
"httpHeaders": {  
"Authorization": "${access\_token}"  
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

·        ServiceAccountOwnerMap

·        endpoints

·        accountName

·        userManager

·        approvers

·        arsTasks/task

·        managerAccount

·        password

·        requestid

·        response

·        connection

·        userAccount

·        requestAccessAttributes/reqAttrs

·        businessJustification

·        user

Yes

RemoveAccountJSON

Specify this parameter to remove an account. 

Use the following format to remove an account using the OpsRamp application:

{  
"call": \[  
{  
"name": "call1",  
"connection": "userAuth",  
"url": "[https://hostname/api/v2/tenants/msp\_1123/users/${account.accountID}/DEACTIVATE]("https://hostname/api/v2/tenants/msp_1123/users/${account.accountID}/DEACTIVATE")",  
"httpMethod": "POST",  
"httpParams": "{\\"deactivateReason\\": \\"${user.customproperty7}\\"}",  
"httpHeaders": {  
"Authorization": "${access\_token}"  
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

·        ServiceAccountOwnerMap

·        endpoints

·        accountName

·        userManager

·        approvers

·        arsTasks/task

·        managerAccount

·        password

·        requestid

·        response

·        connection

·        userAccount

·        requestAccessAttributes/reqAttrs

·        businessJustification

·        user

Yes

###   
Importing Connection Package

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out-of-the-box connection templates available. Here are the steps to import the OpsRamp connection package.

*   Download the [connection package]("https://saviynt.freshdesk.com/helpdesk/attachments/152012999429" ""https://saviynt.freshdesk.com/helpdesk/attachments/152012999429"").
*   Navigate to Admin → Transport → select Import Package.
*   Browse the downloaded package and Import.
*   Navigate to Admin → Connections → Select “OpsRamp ” Connection.
*   Edit the connection with your OpsRamp tenant details.

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x").

Using the OpsRamp Integration
=============================

You can use the OpsRamp integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run the account import before running the access import.
*   Map all OpsRamp attributes to EIC account attributes using **ImportAccountEntJSON**.

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.

Configuring Import Operations
-----------------------------

*   **Full account import:** When configuring the connection for the first time, first perform the full import to import all existing accounts from the target application to EIC. To perform a full import, the invoke API gets the response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
*   **Full Access import:** When configuring the connection for the first time, first perform the full import to import all existing access from the target application to EIC. To perform a full import, the invoke API gets a response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.

The import jobs are automatically created in EIC after you create a connection for the OpsRamp integration. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x").

### **Importing Accounts and Accesses**

You must import accounts after the users are available in EIC.

**To import accounts:** 

1.  Specify the connection and import parameters. For more information, see [Account]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Accounts.htm") and [Access]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Access.htm") import.  
    **Note:** Ensure that the connection type is selected as **REST**.
2.  Configure the **Application Data Import (Single Threaded)** job to import accounts and access. For more information, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x").

Configuring Provisioning and Deprovisioning
-------------------------------------------

Provisioning is automatically enabled when a connection is configured. For detailed information about performing provisioning tasks, see [Access Request System]("https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x").

**To provision objects to the target application:**

1.  Specify the connection and provisioning parameters. For more information, see [Configuration Parameters for Provisioning]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Provisioning-and-Deprovisioning.htm").  
    **Note:** Ensure that the connection type is selected as **REST**.
2.  Configure the **Provisioning** job **(WSRETRY)**. For more information, see [Provisioning Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x").

When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the connector.

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x").

To troubleshoot common problems or obtain answers for frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm").

**Note:** Ensure that you record the token expiry duration during the initial token generation. The connection may fail if the token is not refreshed.