**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users and verified by Saviynt. The integration is available “as is” and fall under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework.

**Contents**

*   1 [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=6%20Troubleshooting-,Preface,-This%20guide%20describes")
*   2 [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=and%20Confluent%20Cloud.-,Audience,-This%20guide%20is")
*   3 [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=with%20Confluent%20Cloud.-,Introduction,-Confluent%20Cloud%20is")
    *   3.1 [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=The%20Confluent%20Cloud%20integration%20supports%20the%20following%C2%A0features")
*   4 [Understanding the Integration between EIC and Confluent Cloud]("#Understanding-the-Integration-between-EIC-and-Confluent-Cloud")
    *   4.1 [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Confluent%20Cloud,-You%20must%20create")
    *   4.2 [Setting Up the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-Prerequisites")
        *   4.2.1 [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=Up%20the%20Integration-,Prerequisites,-Confluent%20uses%20API")
        *   4.2.2 [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=Cloud%20documentation.-,Creating%20a%20Connection,-Connection%20refers%20to")
            *   4.2.2.1 [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=Creating%20Connections.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a")
                *   4.2.2.1.1 [Configuration Parameters for Account and Access Import]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=and%20import%20jobs.-,Configuration%20Parameters%20for%20Account%20and%20Access%20Import,-The%20connector%20uses")
                    *   4.2.2.1.1.1 [Connection Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter")
                    *   4.2.2.1.1.2 [Import Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=Yes-,Import%C2%A0Parameters,-Parameter")
                *   4.2.2.1.2 [Configuration Parameter for Provisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=Yes-,Configuration%20Parameter%20for%20Provisioning,-Parameter")
        *   4.2.3 [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=Yes-,Importing%20Connection%20Package,-The%20connection%20package")
        *   4.2.4 [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=Cloud%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system")
        *   4.2.5 [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to")
*   5 [Using the Confluent Cloud Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=Creating%20Endpoints.-,Using%20the%20Confluent%20Cloud%20Integration,-You%20can%20use")
    *   5.1 [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply")
    *   5.2 [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import")
        *   5.2.1 [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=Confluent%20Cloud%20integration.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import")
    *   5.3 [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically")
*   6 [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/confluent-integration-guide/ta-p/29189#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common")

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Confluent Cloud.

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with Confluent Cloud.

Introduction
============

Confluent Cloud is **a resilient, scalable, streaming data service based on Apache Kafka®, delivered as a fully managed service**. Confluent Cloud has a web interface called the Confluent Cloud Console, a local command line interface, and REST APIs.

The **Confluent Cloud** connector enables you to seamlessly integrate with Confluent Cloud to manage the user lifecycle.

For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors.]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the Confluent Cloud(REST) connector for performing operations listed in the Supported Features

**The Confluent Cloud integration supports the following features:**

**Full Import****Incremental Import****Lifecycle Management****Add or Remove Access**  

### Supported Software Versions

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Confluent Cloud
=============================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and de-provisioning tasks. The following components are involved in the integration:

*   **Confluent Cloud** is the target application for which EIC manages the identity lifecycle. Confluent Cloud integrates with EIC through the connector to manage accounts.
    
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
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the Confluent Cloud integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Confluent Cloud for importing data and for performing provisioning and de-provisioning tasks. The REST connection uses the REST protocol to communicate with the REST interface of Confluent Cloud. 

The following diagram illustrates the integration architecture and communication with the target application.  

Setting Up the Integration
--------------------------

### Prerequisites

Confluent uses API keys for integrating with Confluent Cloud. Perform the following steps to generate a Cloud API key.

1.  Log in to the Confluent Admin portal using administrator credentials.
    
2.  Select **Administration** > **Cloud API Keys**.
    

Figure: Administration Configuration

3\. Click **Add key and select the scopes on the next page.**

4\. Copy the generated key and secret and click on download and continue.

**Note:** To use your API key, send it as an Authorization: Basic {key} header. Remember that HTTP Basic authorization requires you to colon-separate and base64 encode your key. For example, if your API Key ID is ABCDEFGH123456789 and the corresponding API Key Secret is XNCIW93I2L1SQPJSJ823K1LSSDS902KLDFMCZPWEO, then the authorization header will be

Authorization: Basic QUJDREVGR0gxMjM0NTY3ODk6WE5DSVc5Msd0kyTDFTUVBKU0o4MjNLMUxTOTAyS0xERk1DWlBXRU8=

For more information, see the [Confluent Cloud documentation]("https://docs.confluent.io/cloud/current/api.html" ""https://docs.confluent.io/cloud/current/api.html"").

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

Use the following format to connect to the Confluent Cloud application:

{  
"authentications": {  
"acctAuth": {  
"authType": "Basic",  
"url": "[https://api.confluent.cloud]("https://api.confluent.cloud")",  
"httpMethod": "POST",  
"properties": {  
"userName": "@@USERNAME@@",  
"password": "@@PASSWORD@@"  
},  
"expiryError": "ExpiredAuthenticationToken",  
"authError": \[  
"InvalidAuthenticationToken",  
"AuthenticationFailed"  
\],  
"timeOutError": "Read timed out",  
"errorPath": "error.code",  
"maxRefreshTryCount": 5,  
"tokenResponsePath": "access\_token",  
"tokenType": "Basic",  
"accessToken": "Basic bmlzaGFyLmJhYnVAc2"  
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

Use the following format to reconcile accounts and entitlements using the Confluent Cloud application:  

{  
"accountParams": {  
"connection": "acctAuth",  
"processingType": "SequentialAndIterative",  
"call": {  
"call1": {  
"callOrder": 0,  
"stageNumber": 0,  
"http": {  
"url": "[https://api.confluent.cloud/iam/v2/users]("https://api.confluent.cloud/iam/v2/users")",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"Accept": "application/json"  
},  
"httpContentType": "application/json",  
"httpMethod": "GET"  
},  
"listField": "data",  
"keyField": "accountID",  
"colsToPropsMap": {  
"accountID": "id~#~char",  
"name": "full\_name~#~char",  
"displayName": "full\_name~#~char",  
"customproperty2": "email~#~char",  
"customproperty3": "kind~#~char"  
}  
},  
"call2": {  
"callOrder": 1,  
"stageNumber": 1,  
"http": {  
"url": "[https://api.confluent.cloud/iam/v2/service-accounts]("https://api.confluent.cloud/iam/v2/service-accounts")",  
"httpHeaders": {  
"Authorization": "${access\_token}"  
},  
"httpContentType": "application/json",  
"httpMethod": "GET"  
},  
"inputParams": {  
"dependentCall": false  
},  
"listField": "data",  
"keyField": "accountID",  
"colsToPropsMap": {  
"accountID": "id~#~char",  
"name": "display\_name~#~char",  
"displayName": "display\_name~#~char",  
"customproperty1": "description~#~char",  
"customproperty3": "kind~#~char",  
"customproperty4": "description~#~char"  
}  
}  
}  
},  
"entitlementParams": {  
"connection": "acctAuth",  
"processingType": "SequentialAndIterative",  
"entTypes": {  
"organization": {  
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
"url": "[https://api.confluent.cloud/org/v2/organizations]("https://api.confluent.cloud/org/v2/organizations")",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"Accept": "application/json"  
},  
"httpContentType": "application/json",  
"httpMethod": "GET"  
},  
"listField": "data",  
"keyField": "entitlementID",  
"colsToPropsMap": {  
"entitlementID": "id~#~char",  
"entitlement\_value": "display\_name~#~char",  
"customproperty1": "kind~#~char"  
},  
"disableDeletedEntitlements": true  
}  
}  
},  
"environment": {  
"entTypeOrder": 1,  
"call": {  
"call1": {  
"callOrder": 0,  
"stageNumber": 0,  
"http": {  
"url": "[https://api.confluent.cloud/org/v2/environments]("https://api.confluent.cloud/org/v2/environments")",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"Accept": "application/json"  
},  
"httpContentType": "application/json",  
"httpMethod": "GET"  
},  
"listField": "data",  
"keyField": "entitlementID",  
"colsToPropsMap": {  
"entitlementID": "id~#~char",  
"entitlement\_value": "display\_name~#~char",  
"customproperty1": "kind~#~char"  
},  
"disableDeletedEntitlements": true  
}  
}  
}  
}  
},  
"acctEntParams": {}  
}

Yes

##### **Configuration Parameter for Provisioning**

**Parameter**

**Description**

**Recommended Configuration**

**Support for Binding Variables?**

**Support for Java Ternary Operations?**

CreateAccountJSON

Specify this parameter to create an service account in the target application.

Use the following format to create accounts using the Confluent Cloud application:

{  
"accountIdPath": "call1.message.id",  
"dateFormat": "yyyy-MM-dd'T'HH:mm:ssXXX",  
"responseColsToPropsMap": {  
"displayName": "call1.message.display\_name~#~char",  
"customproperty3": "call1.message.kind~#~char"  
},  
"call": \[  
{  
"name": "call1",  
"connection": "acctAuth",  
"url": "[https://api.confluent.cloud/iam/v2/service-accounts]("https://api.confluent.cloud/iam/v2/service-accounts")",  
"httpMethod": "POST",  
"httpParams": "{\\"display\_name\\": \\"${user.username}\\",\\"description\\": \\"${user.customproperty4}\\"}",  
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

Specify this parameter to update an account.

Use the following format to update an service account using the Confluent Cloud application:

{  
"dateFormat": "yyyy-MM-dd'T'HH:mm:ssXXX",  
"responseColsToPropsMap": {  
"displayName": "call1.message.display\_name~#~char"  
},  
"call": \[  
{  
"name": "call1",  
"connection": "acctAuth",  
"url": "[https://api.confluent.cloud/iam/v2/service-accounts/${account.accountID]("https://api.confluent.cloud/iam/v2/service-accounts/${account.accountID")}",  
"httpMethod": "PATCH",  
"httpParams": "{\\"description\\": \\"${user.customproperty4}\\"}",  
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
    
*   Account
    

Yes

RemoveAccountJSON

Specify this parameter to remove a service account. 

Use the following format to remove an account using the Confluent Cloud application:

{  
"call": \[  
{  
"name": "call1",  
"connection": "acctAuth",  
"url": "[https://api.confluent.cloud/iam/v2/service-accounts/${account.accountID]("https://api.confluent.cloud/iam/v2/service-accounts/${account.accountID")}",  
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

The connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out of the box connection templates available. Here are the steps to import the Confluent Cloud connection package.

*   [Download the connection package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/7/1/Confluent.zip").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “Confluent Cloud” Connection.
    
*   Edit the connection with your Confluent Cloud tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the Confluent Cloud Integration
=====================================

You can use the Confluent Cloud integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run account import before running the access import.
    
*   Map all Confluent Cloud attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Configuring Import Operations
-----------------------------

*   **Full account import:** When configuring the connection for the first time, first perform full import to import all existing accounts from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
    
*   **Full Access import:** When configuring the connection for the first time, first perform full import to import all existing access from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.
    

The import jobs are automatically created in EIC after you create a connection for the Confluent Cloud integration.

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

To troubleshoot common problems or obtain answers for frequently asked questions for REST connectors, see the  [REST Connector guide]("https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm"").

**Note:** Ensure that you record the token expiry duration during the initial token generation. The connection may fail, if the token is not refreshed.