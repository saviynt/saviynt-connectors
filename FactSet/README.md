**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users . The integration is available “as is” and fall under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework. 

**Note: Contributor** - [Manju Kumari]("http://linkedin.com/in/manju-royal-ab4931258" ""http://linkedin.com/in/manju-royal-ab4931258"")

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
    
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=EIC)%20and%20FactSet%20.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=EIC)%20and%20FactSet%20.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=service%20with%20FactSet%20.-,Introduction,-FactSet%20is%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=service%20with%20FactSet%20.-,Introduction,-FactSet%20is%20a"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20FactSet%20integration" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20FactSet%20integration"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
            
*   [Understanding the Integration between EIC and]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0FactSet,-You%20must%20create" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0FactSet,-You%20must%20create"") FactSet
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=the%20FactSet%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=the%20FactSet%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Setting Up the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=the%20target%20application-,Setting%20Up%20the%20Integration,-Prerequisites" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=the%20target%20application-,Setting%20Up%20the%20Integration,-Prerequisites"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Up%20the%20Integration-,Prerequisites,-Perform%20the%20following" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Up%20the%20Integration-,Prerequisites,-Perform%20the%20following"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=the%20%22Close%22%20button.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=the%20%22Close%22%20button.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Yes-,Importing%20Connection%20Package,-connection%20package%20helps" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Yes-,Importing%20Connection%20Package,-connection%20package%20helps"")
            
        *   [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=FactSet%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=FactSet%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system"")
            
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to"")
            
*   [Using the FactSet Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Creating%20Endpoints.-,Using%20the%20FactSet%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Creating%20Endpoints.-,Using%20the%20FactSet%20Integration,-You%20can%20use"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply"")
        
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import"")
        
        *   [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import"")
            
    *   [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/community-sourced-integrations/factset-integration-guide/ta-p/49337#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common"")
    

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and FactSet .

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with FactSet .

Introduction
============

**FactSet** is a financial data and software company that provides information, analytics, and services to financial professionals. The company's main focus is on delivering data and insights to investment professionals, including portfolio managers, analysts, researchers, and other financial experts.FactSet Research Systems provides computer-based financial data and analysis for financial professionals, including investment managers, hedge funds, and investment bankers. It consolidates data on global markets, public and private companies, and equity and fixed-income portfolios.

FactSet offers a wide range of products and services, including:

1.  **Data Feeds:** FactSet provides a comprehensive collection of financial data, including market data, company financials, economic indicators, and more. This data is used by financial professionals to make informed investment decisions.
    
2.  **Analytics:** FactSet offers various analytical tools and platforms that allow users to perform complex financial analysis, risk assessment, portfolio optimization, and more.
    
3.  **Portfolio Management:** FactSet's portfolio management solutions help professionals manage and monitor investment portfolios. These tools often include performance measurement, attribution analysis, and risk management features.
    
4.  **Research Management:** The company provides tools to help manage and organize research data, enabling teams to collaborate effectively and streamline their research processes.
    
5.  **Quantitative Analysis:** FactSet offers tools and data for quantitative analysts and researchers who develop and test investment strategies based on quantitative models.
    
6.  **Market Insights:** FactSet offers market research reports, news, and insights to keep financial professionals updated on market trends and developments.
    
7.  **Client Services:** FactSet provides training, support, and consulting services to help clients maximize the value of their products and effectively use the provided tools and data.
    
8.  **Data Integration:** FactSet's services often involve integrating its data and analytics into other financial systems and software used by clients.
    

The financial industry relies heavily on accurate and timely data for making informed investment decisions, and FactSet has established itself as a prominent player in providing these services. It competes with other financial data providers like Bloomberg, Refinitiv (formerly Thomson Reuters Financial & Risk), and S&P Global Market Intelligence.

The **FactSet** connector enables you to seamlessly integrate with FactSet to manage user lifecycle and govern access to their Groups.

For more information about different connectors in EIC, see  [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the FactSet REST connector using REST API for performing operations listed in the Supported Features.

**Supported Features**
----------------------

The FactSet integration supports the following features:

### **Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and FactSet
=====================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and deprovisioning tasks. The following components are involved in the integration:

*   The Complete Service Management platform FactSet combines ITSM with ESM and SIAM capabilities, enabling all internal departments, such as IT, HR, and Facilities, as well as external service providers and customers, to collaborate securely and seamlessly on one complete platform, reducing complexity and improving productivity.
    
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
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the FactSet integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with FactSet for importing data and for performing provisioning and deprovisioning tasks.

The following diagram illustrates the integration architecture and communication with the target application

Setting Up the Integration
--------------------------

### **Prerequisites**

Perform the following steps to Generate & Setup token authentication 

FactSet's API key authentication mechanism is implemented following the basic HTTP authentication scheme, where the username is specified as the FactSet username-serial and the password is the API key. These values will be shown when an API key is generated.

The workflow of API key authentication is as follows:

1.  Register with FactSet to obtain FactSet Username and Serial.
    
2.  Generate the API key by following the steps under 'Creating an API Key' section below.
    
3.  Construct the HTTP Authorization header as per the Basic HTTP Authentication Scheme with username-serial as username and API key as the password.
    
4.  Authorization: Basic dXNlcm5hbWUtc2VyaWFsOlhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWA==
    
5.  Encode this value using Base64 encoding into a sequence of US-ASCII characters
    
6.  The Authorization header needs to be included with all API requests
    

### **Creating an API key**

login to the Developer Portal.

* * *

1.  Navigate to the
    

Manage API Keys page (Profile > Manage API Keys)

2.  Click the "Generate new API key" button.

3.Enter the necessary details and then click the "Create" button.

*   **Description** - give your API key a brief description.
    
*   **IP Range** - enter one or more IP address ranges that contain all possible Internet-facing IP addresses for the machines that will initiate requests to FactSet APIs. By default, the From IP text box contains the Internet-facing IP address of the computer using the Developer Portal.
    
    *   Make sure to click the "Add" button to add the IP address range to the list of allowed ranges.
        
    *   An IP address range can be removed from the list of allowed ranges by clicking the red trashcan button in the "Action" column.
        

4.Copy the generated API key somewhere safe, it won't be displayed again. Then click the "Close" button.

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

*   Select the connection type as “FactSet (REST)”
    
*   If the “FactSet (REST) connection type is not present in your tenant then import the connection package using T2P
    
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

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip"")

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatory?**

AccountEntImport JSON

Specify this parameter to reconcile the accounts and entitlements

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip"")

Yes

###### **Configuration Parameter for Provisioning**

**Parameter**

**Description**

**Recommended Configuration**

**Support for Binding Variables?**

**Support for Java Ternary Operations?**

CreateAccountJSON

Specify this parameter to create an account in the target application.

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip"")

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

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip"")

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

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip"")

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

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip"")

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

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip"")

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

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip"")

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

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip"")

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

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out of the box connection templates available. Here are the steps to import the FactSet connection package.

*   Download the [connection package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/69/1/FactSet.zip"").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “FactSet ” Connection.
    
*   Edit the connection with your FactSet tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the FactSet Integration
=============================

You can use the FactSet integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run account import before running the access import.
    
*   Map all FactSet attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Configuring Import Operations
-----------------------------

*   **Full account import:** When configuring the connection for the first time, first perform full import to import all existing accounts from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
    
*   **Full Access import:** When configuring the connection for the first time, first perform full import to import all existing access from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.
    

The import jobs are automatically created in EIC after you create a connection for the FactSet integration. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").

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