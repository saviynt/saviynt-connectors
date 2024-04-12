**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users and verified by Saviynt. The integration is available “as is” and fall under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework. 

**Note: Contributor** - [Manju Kumari]("http://linkedin.com/in/manju-royal-ab4931258" ""http://linkedin.com/in/manju-royal-ab4931258"")

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Preface"")
    
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=EIC)%20and%20DigiCert.-,Audience,-This%20guide%20is" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Audience"")
    
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=service%20with%20DigiCert.-,Introduction,-DigiCert%20is%20provider" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Introduction"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20DigiCert%20integration" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Supported-Features"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Supported-Software-Versions"")
            
*   [Understanding the Integration between EIC and]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0DigiCert,-You%20must%20create" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Understanding-the-Integration-between-EIC-and-Databricks"") DigiCert
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=the%20DigiCert%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Integration-Architecture"")
        
    *   [Setting Up the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=the%20target%20application-,Setting%20Up%20the%20Integration,-Prerequisites" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Setting-Up-the-Integration"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Up%20the%20Integration-,Prerequisites,-Perform%20the%20following" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Prerequisites"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=DigiCert%20user%20interface.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Creating-a-Connection"")
            
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Yes-,Importing%20Connection%20Package,-connection%20package%20helps" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/4287660092"")
            
        *   [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=DigiCert%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Creating-a-Security-System"")
            
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Creating-an-Endpoint-for-the-Security-System"")
            
*   [Using the DigiCert Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Creating%20Endpoints.-,Using%20the%20DigiCert%20Integration,-You%20can%20use" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Using-the-Databricks-Integration"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Guidelines-for-Using-the-Integration"")
        
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Configuring-Import-Operations"")
        
        *   [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Importing-Accounts-and-Accesses"")
            
    *   [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Configuring-Provisioning-and-Deprovisioning"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/3660087335/Databricks+Integration+Guide#Troubleshooting"")
    

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and DigiCert.

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with DigiCert.

Introduction
============

**DigiCert** is provider of scalable TLS/ SSL, IoT and PKI solutions for identity and encryption. The company is recognized for its enterprise- grade certificate management platform, fast and knowledgeable customer support, and market-leading security solutions.These certificates are used to verify and authenticate the identities of organizations and domains and to protect the privacy and data integrity of users' digital interactions with web browsers, email clients, documents, software programs, apps, networks and connected IoT devices.

The **DigiCert** connector enables you to seamlessly integrate with DigiCert to manage user lifecycle.

For more information about different connectors in EIC, see  [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the DigiCert REST connector using REST API for performing operations listed in the Supported Features.

**Supported Features**
----------------------

The DigiCert integration supports the following features:

### **Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and DigiCert
======================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and deprovisioning tasks. The following components are involved in the integration:

*   The Complete Service Management platform DigiCert combines ITSM with ESM and SIAM capabilities, enabling all internal departments, such as IT, HR, and Facilities, as well as external service providers and customers, to collaborate securely and seamlessly on one complete platform, reducing complexity and improving productivity.
    
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
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the DigiCert integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with DigiCert for importing data and for performing provisioning and deprovisioning tasks.

The following diagram illustrates the integration architecture and communication with the target application

Setting Up the Integration
==========================

### **Prerequisites**

Perform the following steps to Generate & Setup token authentication

1.  Log in to the DigiCert portal using administrator credentials.
    
2.  In DigiCert ONE, in the top menu on the right, select the person icon -> My Profile.
    
3.  Profile setting → Api key->add Api key
    

5.  You can revoke the tokens at any time from the DigiCert user interface.

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

*   Select the connection type as “DigiCert(REST)”
    
*   If the “DigiCert(REST) connection type is not present in your tenant then import the connection package using T2P
    
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

Use the following format to connect to the DigiCert application:

Refer [Connection T2P Package]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Download%20the%20connection%20package.") 

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatory?**

AccountEntImport JSON

Specify this parameter to reconcile the accounts and entitlements

Use the following format to import accounts and entitlements using the DigiCert application:

Refer to the  [Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Download%20the%20connection%20package.") 

###### **Configuration Parameter for Provisioning**

**Parameter**

**Description**

**Recommended Configuration**

**Support for Binding Variables?**

**Support for Java Ternary Operations?**

CreateAccountJSON

Specify this parameter to create an account in the target application.

Refer to the [Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Download%20the%20connection%20package.") 

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

Refer to the  [Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Download%20the%20connection%20package.") 

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

EnableAccountJSON

Specify this parameter to Enable an account in the target application.

Refer to the  [Connection  Package]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Download%20the%20connection%20package.") 

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

DisableAccountJSON

Specify this parameter to Disable an account in the target application.

Refer to the [Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Download%20the%20connection%20package.") 

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

Refer to the  [Connection  Package]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Download%20the%20connection%20package.") 

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

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out of the box connection templates available. Here are the steps to import the DigiCert connection package.

*   Download the [connection package]("https://forums.saviynt.com/t5/community-sourced-integrations/digicert-integration-guide/ta-p/34542#:~:text=Add%20tags-,Digicert.zip,-1%20KUDO").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “DigiCert” Connection.
    
*   Edit the connection with your DigiCert tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the DigiCert Integration
==============================

You can use the DigiCert integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run account import before running the access import.
    
*   Map all DigiCert attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Configuring Import Operations
-----------------------------

*   **Full account import:** When configuring the connection for the first time, first perform full import to import all existing accounts from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
    
*   **Full Access import:** When configuring the connection for the first time, first perform full import to import all existing access from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.
    

The import jobs are automatically created in EIC after you create a connection for the DigiCert integration. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").

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