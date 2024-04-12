**Disclaimer**

The integration was created by Saviynt community users.. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework.

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=ForgeRock%20%2D%20CIAM.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=ForgeRock%20%2D%20CIAM.-,Audience,-This%20guide%20is"")
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=ForgeRock%20%2D%20CIAM.-,Introduction,-ForgeRock%20Customer%20Identity" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=ForgeRock%20%2D%20CIAM.-,Introduction,-ForgeRock%20Customer%20Identity"")
*   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Connectors%20Documentation.-,Supported%20Features,-The%20ForgeRock%20%2D%20CIAM" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Connectors%20Documentation.-,Supported%20Features,-The%20ForgeRock%20%2D%20CIAM"")
*   [Understanding the Integration between EIC and ForgeRock - CIAM]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=the%20following%C2%A0features%3A-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0ForgeRock%20%2D%20CIAM,-You%20must%20create" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=the%20following%C2%A0features%3A-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0ForgeRock%20%2D%20CIAM,-You%20must%20create"")
*   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=ForgeRock%20%2D%20CIAM%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=ForgeRock%20%2D%20CIAM%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
    *   [Account reconciliation]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=the%20REST%20endpoint.-,Account%20reconciliation,-%3A" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=the%20REST%20endpoint.-,Account%20reconciliation,-%3A"")
    *   [Access reconciliation]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=accountStatus-,Access%20reconciliation,-Saviynt%20is%20importing" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=accountStatus-,Access%20reconciliation,-Saviynt%20is%20importing"")
*   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=%C2%A0description-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=%C2%A0description-,Creating%20a%20Connection,-Connection%20refers%20to"")
    *   [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Creating%20Connections.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Creating%20Connections.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a"")
    *   [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=and%20import%20jobs.-,Importing%20Connection%20Package,-The%20Connection%20Package" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=and%20import%20jobs.-,Importing%20Connection%20Package,-The%20Connection%20Package"")
    *   [Connection JSON]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=ForgeRock%20%2D%20CIAMTenant%20Details.-,Connection%20JSON,-The%20connection%20JSON" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=ForgeRock%20%2D%20CIAMTenant%20Details.-,Connection%20JSON,-The%20connection%20JSON"")
    *   [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=%7D%0A%7D%0A%7D-,Creating%20a%20Security%20System,-The%20security%20system" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=%7D%0A%7D%0A%7D-,Creating%20a%20Security%20System,-The%20security%20system"")
    *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to"")
*   [Using the]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Creating%20Endpoints..-,Using%20the%20ForgeRock%20%2D%20CIAM%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Creating%20Endpoints..-,Using%20the%20ForgeRock%20%2D%20CIAM%20Integration,-You%20can%20use"") [ForgeRock - CIAM]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Creating%20Endpoints..-,Using%20the%20ForgeRock%20%2D%20CIAM%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Creating%20Endpoints..-,Using%20the%20ForgeRock%20%2D%20CIAM%20Integration,-You%20can%20use"") [Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Creating%20Endpoints..-,Using%20the%20ForgeRock%20%2D%20CIAM%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Creating%20Endpoints..-,Using%20the%20ForgeRock%20%2D%20CIAM%20Integration,-You%20can%20use"")
*   *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply"")
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import"")
    *   [Importing Accounts]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Data%20Jobs.-,Importing%20Accounts,-You%20must%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Data%20Jobs.-,Importing%20Accounts,-You%20must%20import"")
    *   [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically"")
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/community-sourced-integrations/forgerock-ciam-integration-guide/ta-p/75472#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common"")

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and **ForgeRock - CIAM**.

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with **ForgeRock - CIAM**.

Introduction
============

ForgeRock Customer Identity and Access Management (CIAM) enables you to give your customers a frictionless and highly personalized online experience. With advanced security, consent management, privacy protections, and self-service, ForgeRock CIAM helps you acquire customers faster, improve retention, and protect customer data.

This enables the business to deliver a great experience to customers and to protect their user data.

Business wants to integrate ForgeRock - CIAM with Saviynt for automated user creation/management in ForgeRock - CIAM.

The **ForgeRock - CIAM** connector enables you to seamlessly integrate with **ForgeRock - CIAM** to manage the user lifecycle and govern access to their accounts and workspaces.

For more information about different connectors in EIC, see [Connectors Documentation]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm").

Supported Features
==================

**The ForgeRock - CIAM integration supports the following features:**

Understanding the Integration between EIC and ForgeRock - CIAM
==============================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and de-provisioning tasks. The following components are involved in the integration:

*   **Objects** are imported as entitlement types into EIC.
*   **Security System** represents the connection between EIC and the target application.
    *   It comprises an endpoint, which is the target application for which you want EIC to manage the identity repository.
    *   It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm").
*   **Endpoint** is an instance of an application within the context of a security system.
    *   It is the target application or application from which the connector imports the data and performs provisioning or de-provisioning of identity objects, such as users, accounts, and entitlements.
    *   It is mandatory to create an endpoint after creating the security system.  
        You can associate a single security system with multiple endpoints if the deployment involves modeling multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see [Creating an Endpoint for the Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm").
*   **The connector** is a software component that enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing, provisioning accounts, and accessing through the REST APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x").
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import or provisioning operations from EIC.  
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the ForgeRock - CIAM integration.

Integration Architecture
========================

EIC uses a **REST** connection for integrating with ForgeRock - CIAM for importing data and for performing provisioning and de-provisioning tasks.

The following diagram illustrates the integration architecture and communication with the target application.

  

*   Standard REST connector using SCIM protocol is used to connect ForgeRock - CIAM application to Saviynt.
*   REST API calls are made through REST connector to execute multiple operations (i.e. Import accounts / Import Access /Create Account/ Update Account / Disable Account / Add Access /Remove Access / Enable account)
*   The REST integration enables you to gain visibility, manage user life cycle, and govern access for the data available in the REST endpoint.

**Account reconciliation:**
---------------------------

*   Saviynt is importing all the user accounts from ForgeRock - CIAM.  
    Below are the account attributes details which are getting imported from ForgeRock - CIAM.

**ForgeRock CIAM AccountAttribute**

**SaviyntAccountAttribute**

**accountID**

\_id

**name**

mail 

**displayName**

mail 

**customproperty1**

sn 

**customproperty2**

givenName 

**customproperty3**

mail 

**status**

accountStatus 

**customproperty4**

frIndexedString3 

**customproperty5**

\_id 

**customproperty6**

frUnindexedString3 

**customproperty7**

accountStatus 

**Access reconciliation**
-------------------------

*   Saviynt is importing all Groups (entitlements) from ForgeRock - CIAM.  
    Below are the entitlement attribute details which are imported from ForgeRock - CIAMinto Saviynt.

**ForgeRock CIAM Entitlement Attribute**

**Saviynt Entitlement Attribute**

**entitlementID**

 \_id 

**entitlement\_value**

 name 

**displayname**

 name 

**customproperty1**

 \_id 

**customproperty2**

 \_rev 

**description**

 description 

Creating a Connection
=====================

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see [Creating Connections]("https://saviynt.freshdesk.com/support/solutions/articles/43000431233-creating-connections").

**Understanding the Configuration Parameters**
----------------------------------------------

While creating a connection, you must specify connection parameters that the connector uses to connect with the target application, define the type of operations to perform, the target application objects against which those operations are performed, and the frequency of performing them. In addition, you can view and edit attribute mappings between EIC and the target application, predefined correlation rules, and provisioning jobs and import jobs.

**Importing Connection Package**
--------------------------------

The Connection Package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out of the box connection templates available. Here are the steps to import the ForgeRock - CIAM connection package.

*   Download the connection package.
*   Navigate to Admin → Transport → select Import Package.
*   Browse the downloaded package and Import.
*   Navigate to Admin → Connections → Select “ForgeRock - CIAM ” Connection.
*   Edit the connection with your ForgeRock - CIAMTenant Details.

**Connection JSON**
-------------------

The connection JSON cannot be embedded in the Connection Package. Hence attaching the Connection JSON separately

  

{    
"authentications": {  
"userAuth": {  
"authType": "oauth2",  
"url": "https://<URL>/am/oauth2/access\_token",  
"httpMethod": "POST",  
"httpParams": {  
"client\_id": "<Client Id>",  
"client\_secret": "<Client Secret>",  
"password": "<Password>",  
"grant\_type": "password",  
"scope": "fr:idm:\*",  
"username": "<Username>"  
},  
"httpHeaders": {  
"Content-Type": "application/x-www-form-urlencoded"  
},  
"httpContentType": "application/x-www-form-urlencoded",  
"expiryError": "ExpiredAuthenticationToken",  
"authError": \[  
"InvalidAuthenticationToken",  
"Missing parameter"  
\],  
"timeOutError": "Read timed out",  
"errorPath": "error.error\_description",  
"maxRefreshTryCount": 5,  
"tokenResponsePath": "access\_token",  
"tokenType": "Bearer",  
"retryFailureStatusCode": \[  
401  
\],  
"accessToken": "Bearer abcd"  
},  
"successResponses": {  
"statusCode": \[  
200,  
201,  
202,  
204  
\]  
},  
"unsuccessResponses": {  
"statusCode": \[  
400,  
403,  
401,  
404,  
409,  
501,  
500  
\]  
}  
}  
}

**Creating a Security System**
------------------------------

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x")**.**

**Creating an Endpoint for the Security System**
------------------------------------------------

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x")..

Using the ForgeRock - CIAM Integration
======================================

You can use the ForgeRock - CIAM integration for performing import and provisioning operations after configuring it to meet your requirements. 

**Guidelines for Using the Integration**
----------------------------------------

You must apply the following guidelines for configuring import: 

*   Run account import before running the access import.
*   Map all ForgeRock - CIAM attributes to EIC account attributes using **ImportAccountEntJSON**.
*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.

**Configuring Import Operations**
---------------------------------

*   **Full account import:** When configuring the connection for the first time, first perform full import to import all existing accounts from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
*   **Full Access import:** When configuring the connection for the first time, first perform full import to import all existing access from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.

The import jobs are automatically created in EIC after you create a connection for the ForgeRock - CIAM integration. For more information about creating jobs, see [Data Jobs]("https://saviynt.freshdesk.com/support/solutions/articles/43000608272-job-categories-for-flat-job-control-panel#JobCategoriesforFlatJobControlPanel-Data").

**Importing Accounts**
----------------------

You must import accounts after the users are available in EIC.

**To import accounts:** 

1.  Specify the connection and import parameters. For more information, see [Account]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Accounts.htm") and [Access]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Access.htm") import.  
    **Note:** Ensure that the connection type is selected as **REST**.
2.  Configure the **Application Data Import (Single Threaded) / Application Data Import (Multi-Threaded)** job to import accounts and access. For more information, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x").

**Configuring Provisioning and Deprovisioning**
-----------------------------------------------

Provisioning is automatically enabled when a connection is configured. For detailed information about performing provisioning tasks, see [Access Request System]("https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x").

**To provision objects to the target application:**

1.  Specify the connection and provisioning parameters. For more information, see [Configuration Parameters for Provisioning]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Provisioning-and-Deprovisioning.htm").  
    **Note:** Ensure that the connection type is selected as **REST**.
2.  Configure the **Provisioning** job **(WSRETRY)**. For more information, see [Provisioning Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x").

When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the connector.

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x").

To troubleshoot common problems or obtain answers for frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm").