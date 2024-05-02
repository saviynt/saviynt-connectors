**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework. 

*   [Preface]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
    
*   [Audience]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=EIC)%20and%20inContact.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=EIC)%20and%20inContact.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=service%20with%20inContact.-,Introduction,-inContact%20is%20a" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=service%20with%20inContact.-,Introduction,-inContact%20is%20a"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Cloud%20Connectors.-,Supported%20Features,-The%20inContact%20integration" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Cloud%20Connectors.-,Supported%20Features,-The%20inContact%20integration"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
            
*   [Understanding the Integration between EIC and  inContact]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0inContact,-You%20must%20create" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0inContact,-You%20must%20create"")
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=the%20inContact%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=the%20inContact%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Setting Up the Integration]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=the%20target%20application-,Setting%20Up%20the%20Integration,-Prerequisites" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=the%20target%20application-,Setting%20Up%20the%20Integration,-Prerequisites"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Up%20the%20Integration-,Prerequisites,-Application%20Registration%2DYou" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Up%20the%20Integration-,Prerequisites,-Application%20Registration%2DYou"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=out%20CXoneAuthenticationGettingStarted.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=out%20CXoneAuthenticationGettingStarted.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=user-,Importing%20Connection%20Package,-connection%20package%20helps" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=user-,Importing%20Connection%20Package,-connection%20package%20helps"")
            
        *   [Creating a Security System]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=inContact%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=inContact%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system"")
            
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to"")
            
*   [Using the inContact Integration]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Creating%20Endpoints.-,Using%20the%20inContact%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Creating%20Endpoints.-,Using%20the%20inContact%20Integration,-You%20can%20use"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply"")
        
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import"")
        
        *   [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import"")
            
    *   [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/integration-drafts/incontact-integration-guide/ta-p/42230#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common"")
    

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and inContact.

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with inContact.

Introduction
============

**inContact** is a cloud-based customer experience (CX) platform that provides contact center solutions for businesses. It offers a comprehensive suite of tools and services to help organizations manage their customer interactions efficiently and effectively.

The **inContact** connector enables you to seamlessly integrate with inContact to manage user lifecycle and govern access to their Teams.

For more information about different connectors in EIC, see  [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Supported Features**
----------------------

The inContact integration supports the following features:

  

### **Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and inContact
=======================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and de-provisioning tasks. The following components are involved in the integration:

*   The Complete Service Management platform inContact combines ITSM with ESM and SIAM capabilities, enabling all internal departments, such as IT, HR, and Facilities, as well as external service providers and customers, to collaborate securely and seamlessly on one complete platform, reducing complexity and improving productivity.
    
*   **Objects** are imported as entitlement types into EIC.
    
*   **Security System** represents the connection between EIC and the target application.
    
    *   It comprises an endpoint, which is the target application for which you want EIC to manage the identity repository.
        
    *   It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm"").
        
*   **Endpoint** is an instance of an application within the context of a security system.
    
    *   It is the target application or application from which the connector imports the data and performs provisioning or de-provisioning of identity objects, such as users, accounts, and entitlements.
        
    *   It is mandatory to create an endpoint after creating the security system.  
        You can associate a single security system with multiple endpoints if the deployment involves modeling of multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see [Creating an Endpoint for the Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm"").
        
*   **Connector** is a software component that enables the communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing, provisioning accounts, and access through the SCIM APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import or provisioning operations from EIC.  
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the inContact integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with inContact for importing data and for performing provisioning and deprovisioning tasks.

The following diagram illustrates the integration architecture and communication with the target application

Setting Up the Integration
--------------------------

### **Prerequisites**

*   **Application Registration**\-You must register your app to authenticate against CXone. Review the information on this page then complete the [CXone Application Registration]("https://forms.microsoft.com/r/L2NDziQfrq" ""https://forms.microsoft.com/r/L2NDziQfrq"") Microsoft form.
    
*   **Application Configuration**\-The information required for these application types shares some things in common but differs for other things.
    
*   **Common Application Configuration**\-
    

1.  An application identifier, referred to in standards as the **client\_id**. This is assigned by the CXone platform. For ease of implementation, the same client\_id can be used across multiple systems.
    
2.  A name and description for the application.
    
3.  A list of technical contacts. If there are issues with the application and how it is using CXone APIs, these contacts will be used.
    
4.  The type of application, either **back-end, confidential,** or **public**.
    
5.  If necessary, there is a **scope** configuration for Central and the User Hub ACD application.
    

   
**Note:** For more information check out [CXoneAuthenticationGettingStarted]("https://developer.niceincontact.com/Documentation/CXoneAuthenticationGettingStarted" ""https://developer.niceincontact.com/Documentation/CXoneAuthenticationGettingStarted"").

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

*   Select the connection type as “inContact (REST)”
    
*   If the “inContact (REST) connection type is not present in your tenant then import the connection package using T2P
    
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

**Note:** Update Refresh token  

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip"") 

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatory?**

AccountEntImport JSON

Specify this parameter to reconcile the accounts and entitlements

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip"") 

Yes

###### **Configuration Parameter for Provisioning**

**Parameter**

**Description**

**Recommended Configuration**

**Support for Binding Variables?**

**Support for Java Ternary Operations?**

CreateAccountJSON

Specify this parameter to create an account in the target application.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip"") 

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

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip"") 

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

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip"") 

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

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip"") 

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

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip"") 

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

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip"") 

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
    

###   
Importing Connection Package

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out-of-the-box connection templates available. Here are the steps to import the inContact connection package.

*   Download the [connection package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/39/1/INCONTACT.zip"").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “inContact ” Connection.
    
*   Edit the connection with your inContact tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the inContact Integration
===============================

You can use the inContact integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run account import before running the access import.
    
*   Map all inContact attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Configuring Import Operations
-----------------------------

*   **Full account import:** When configuring the connection for the first time, first perform full import to import all existing accounts from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
    
*   **Full Access import:** When configuring the connection for the first time, first perform full import to import all existing access from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.
    

The import jobs are automatically created in EIC after you create a connection for the inContact integration. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").

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