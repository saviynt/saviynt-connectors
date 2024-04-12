**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework.

**Contents**

*   1 [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=6%20Troubleshooting-,Preface,-This%20guide%20describes")
*   2 [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=EIC)%20and%20Statuspage.-,Audience,-This%20guide%20is")
*   3 [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=service%20with%20Statuspage.-,Introduction,-Statuspage%20is%20an")
    *   3.1 [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=The%20Statuspage%20integration%20supports%20the%20following%C2%A0features%3A")
*   4 [Understanding the Integration between EIC and Statuspage]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Statuspage,-You%20must%20create")
    *   4.1 [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=the%20Statuspage%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a")
    *   4.2 [Setting Up the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=Statuspage%20Integration%20Architecture-,Setting%20Up%20the%20Integration,-Prerequisites")
        *   4.2.1 [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=Up%20the%20Integration-,Prerequisites,-Statuspage%20uses%20API")
        *   4.2.2 [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=as%20shown%20below-,Creating%20a%20Connection,-Connection%20refers%20to")
            *   4.2.2.1 [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=Creating%20Connections.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a")
                *   4.2.2.1.1 [Configuration Parameters for Account and Access Import]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=and%20import%20jobs.-,Configuration%20Parameters%20for%20Account%20and%20Access%20Import,-The%20connector%20uses")
                    *   4.2.2.1.1.1 [Connection Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter")
                    *   4.2.2.1.1.2 [Import Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=Yes-,Import%C2%A0Parameters,-Parameter")
                *   4.2.2.1.2 [Configuration Parameter for Provisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=Yes-,Configuration%20Parameter%20for%20Provisioning,-Parameter")
        *   4.2.3 [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=Yes-,Importing%20Connection%20Package,-The%20connection%20package")
        *   4.2.4 [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=Statuspage%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system")
        *   4.2.5 [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to")
*   5 [Using the Statuspage Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=Creating%20Endpoints.-,Using%20the%20Statuspage%20Integration,-You%20can%20use")
    *   5.1 [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply")
    *   5.2 [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import")
        *   5.2.1 [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=the%20Statuspage%20integration.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import")
    *   5.3 [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically")
*   6 [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/statuspage-integration-guide/ta-p/29667#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common")

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Statuspage.

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with Statuspage.

Introduction
============

Statuspage is an industry-leading platform for easily communicating the real-time status of products and services to your users. This brings companies and customers together during downtime with best-in-class incident communication.

For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the Statuspage(REST) connector for performing operations listed in the Supported Features

**The Statuspage integration supports the following features:**

**Full Import****Incremental Import****Lifecycle Management****Add or Remove Access**

### Supported Software Versions

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Statuspage
========================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and de-provisioning tasks. The following components are involved in the integration:

*   **Statuspage** is the target application for which EIC manages the identity lifecycle. Statuspage integrates with EIC through the connector to manage accounts.
    
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
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the Statuspage integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Statuspage for importing data and for performing provisioning and de-provisioning tasks. The REST connection uses the REST protocol to communicate with the REST interface of Statuspage. 

The following diagram illustrates the integration architecture and communication with the target application.  

Figure: Statuspage Integration Architecture

Setting Up the Integration
--------------------------

### Prerequisites

Statuspage uses API keys for integrating with Statuspage. Perform the following steps to generate a Cloud API key.

1.  Log in to the Statuspage Admin portal using administrator credentials.
    
2.  Select **Your profile and settings** \> **API Info**
    

Figure: Administration Configuration

3\. Click **Create key**

4\. Copy the generated key.

**Note**: the Organization\_ID will be available in the URL as shown below  
  

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

Use the following format to connect to the Statuspage application:

{  
"authentications": {  
"acctAuth": {  
"authType": "oauth2",  
"url": "[https://api.statuspage.io]("https://api.statuspage.io")",  
"httpMethod": "POST",  
"httpParams": {},  
"httpContentType": "application/json",  
"httpHeaders": {  
"Accept": "application/json"  
},  
"errorPath": "error",  
"maxRefreshTryCount": 5,  
"retryFailureStatusCode": \[  
401  
\],  
"authError": \[  
"Authentication Required"  
\],  
"tokenResponsePath": "",  
"accessToken": "@@API\_KEY@@"  
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

Use the following format to reconcile accounts and entitlements using the Statuspage application:  

{  
"accountParams": {  
"connection": "acctAuth",  
"processingType": "SequentialAndIterative",  
"call": {  
"call1": {  
"callOrder": 0,  
"stageNumber": 0,  
"http": {  
"url": "[https://api.statuspage.io/v1/organizations/@@ORGANIZATION\_ID@@/users]("https://api.statuspage.io/v1/organizations/@@ORGANIZATION_ID@@/users")",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"Accept": "application/json"  
},  
"httpContentType": "application/json",  
"httpMethod": "GET"  
},  
"listField": "",  
"keyField": "accountID",  
"colsToPropsMap": {  
"accountID": "id~#~char",  
"name": "email~#~char",  
"displayName": "email~#~char",  
"customproperty1": "first\_name~#~char",  
"customproperty2": "last\_name~#~char",  
"customproperty3": "created\_at~#~char",  
"customproperty4": "updated\_at~#~char",  
"customproperty5": "organization\_id~#~char"  
}  
}  
}  
},  
"entitlementParams": {  
"connection": "acctAuth",  
"processingType": "SequentialAndIterative",  
"entTypes": {  
"Page": {  
"entTypeOrder": 0,  
"call": {  
"call1": {  
"callOrder": 0,  
"stageNumber": 0,  
"http": {  
"url": "[https://api.statuspage.io/v1/pages]("https://api.statuspage.io/v1/pages")",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"Accept": "application/json"  
},  
"httpContentType": "application/json",  
"httpMethod": "GET"  
},  
"listField": "",  
"keyField": "entitlementID",  
"colsToPropsMap": {  
"entitlementID": "id~#~char",  
"entitlement\_value": "name~#~char",  
"customproperty1": "created\_at~#~char",  
"customproperty3": "page\_description~#~char",  
"customproperty2": "updated\_at~#~char",  
"customproperty5": "subdomain~#~char"  
},  
"disableDeletedEntitlements": false  
}  
}  
}  
}  
},  
"acctEntParams": {  
"entTypes": {  
"Page": {  
"call": {  
"call1": {  
"callOrder": 0,  
"stageNumber": 0,  
"connection": "acctAuth",  
"processingType": "httpAcctToEnt",  
"http": {  
"httpHeaders": {  
"Authorization": "${access\_token}"  
},  
"url": "[https://api.statuspage.io/v1/organizations/@@ORGANIZATION\_ID@@/permissions/${id]("https://api.statuspage.io/v1/organizations/@@ORGANIZATION_ID@@/permissions/${id")}",  
"httpContentType": "application/json",  
"httpMethod": "GET"  
},  
"listField": "pages",  
"entKeyField": "entitlementID",  
"entIdPath": "page\_id",  
"acctKeyField": "accountID"  
}  
}  
}  
}  
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

Use the following format to create accounts using the Statuspage application:

{  
"accountIdPath": "call1.message.id",  
"dateFormat": "yyyy-MM-dd'T'HH:mm:ssXXX",  
"responseColsToPropsMap": {  
"displayName": "call1.message.email~#~char"  
},  
"call": \[  
{  
"name": "call1",  
"connection": "acctAuth",  
"url": "[https://api.statuspage.io/v1/organizations/@@ORGANIZATION\_ID@@/users]("https://api.statuspage.io/v1/organizations/@@ORGANIZATION_ID@@/users")",  
"httpMethod": "POST",  
"httpParams": "{\\"user\\":{\\"email\\":\\"${user.email}\\",\\"password\\":\\"${password}\\",\\"first\_name\\":\\"${user.firstname}\\",\\"last\_name\\":\\"${user.lastname}\\"}}",  
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

RemoveAccountJSON

Specify this parameter to remove an account. 

Use the following format to remove an account using the Statuspage application:

{  
"call": \[  
{  
"name": "call1",  
"connection": "acctAuth",  
"url": "[https://api.statuspage.io/v1/organizations/@@ORGANIZATION\_ID@@/users/${account.accountID]("https://api.statuspage.io/v1/organizations/@@ORGANIZATION_ID@@/users/${account.accountID")}",  
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

The connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out-of-the-box connection templates available. Here are the steps to import the Statuspage connection package.

*   [Download the connection package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/8/1/statuspage.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/8/1/statuspage.zip"").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “Statuspage” Connection.
    
*   Edit the connection with your Statuspage tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the Statuspage Integration
================================

You can use the Statuspage integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run account import before running the access import.
    
*   Map all Statuspage attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Configuring Import Operations
-----------------------------

*   **Full account import:** When configuring the connection for the first time, first perform full import to import all existing accounts from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
    
*   **Full Access import:** When configuring the connection for the first time, first perform full import to import all existing access from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.
    

The import jobs are automatically created in EIC after you create a connection for the Statuspage integration.

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

**Note:** Ensure that you record the token expiry duration during the initial token generation. The connection may fail if the token is not refreshed.