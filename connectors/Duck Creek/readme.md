**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework. 

**Contributor** -[Manju Kumari]("http://linkedin.com/in/manju-royal-ab4931258" ""http://linkedin.com/in/manju-royal-ab4931258"") ,Tim Chengappa

**Contents**

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
    
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=and%20Duck%20Creek.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=and%20Duck%20Creek.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=with%20Duck%20Creek.-,Introduction,-Duck%20Creek%20Technologies" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=with%20Duck%20Creek.-,Introduction,-Duck%20Creek%20Technologies"")
    
    *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
        
*   [Understanding the Integration between EIC and]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Duck%20Creek,-You%20must%20create" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Duck%20Creek,-You%20must%20create"") Duck Creek
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Duck%20Creek%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Duck%20Creek%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Setting Up the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Creek%20Integration%20Architecture-,Setting%20Up%20the%20Integration,-Prerequisites" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Creek%20Integration%20Architecture-,Setting%20Up%20the%20Integration,-Prerequisites"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Up%20the%20Integration-,Prerequisites,-Ensure%20that%20the" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Up%20the%20Integration-,Prerequisites,-Ensure%20that%20the"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Creek%20Documentation.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Creek%20Documentation.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            
            *   [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Creating%20Connections.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Creating%20Connections.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a"")
                
                *   [Configuration Parameters for Account and Access Import]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=and%20import%20jobs.-,Configuration%20Parameters%20for%20Account%20and%20Access%20Import,-The%20connector%20uses" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=and%20import%20jobs.-,Configuration%20Parameters%20for%20Account%20and%20Access%20Import,-The%20connector%20uses"")
                    
                    *   [Connection Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter"")
                        
                    *   [Import Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Yes-,Import%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Yes-,Import%C2%A0Parameters,-Parameter"")
                        
                *   [Configuration Parameter for Provisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=the%C2%A0Connection%20Package-,Configuration%20Parameter%20for%20Provisioning,-Parameter" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=the%C2%A0Connection%20Package-,Configuration%20Parameter%20for%20Provisioning,-Parameter"")
                    
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Yes-,Importing%20Connection%20Package,-Transporting%20Packages%20aka" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Yes-,Importing%20Connection%20Package,-Transporting%20Packages%20aka"")
            
        *   [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Creek%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Creek%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system"")
            
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to"")
            
*   [Using the Duck Creek Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Creating%20Endpoints.-,Using%20the%20Duck%20Creek%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Creating%20Endpoints.-,Using%20the%20Duck%20Creek%20Integration,-You%20can%20use"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply"")
        
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import"")
        
        *   [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=connection%20an%20integration.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=connection%20an%20integration.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import"")
            
    *   [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/community-sourced-integrations/duck-creek-integration-guide/ta-p/50863#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common"")
    

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Duck Creek.

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with Duck Creek.

Introduction
============

**Duck Creek Technologies** is a software company that specializes in providing solutions for the insurance industry. The company offers a range of software products and services designed to help insurance companies streamline their operations, improve customer experiences, and adapt to changing market conditions.Duck Creek Technologies aims to help insurance companies become more agile, competitive, and responsive to the evolving needs of the industry and its customers.

The **SOAP** connector enables you to seamlessly integrate with Duck Creek to manage user lifecycle and govern access to their Entity, Role and Privilege.

For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/csh?topicname=Saviynt-Enterprise-Identity-Cloud-Connectors&pubname=Connectors-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Saviynt-Enterprise-Identity-Cloud-Connectors&pubname=Connectors-v2022x"").

**Note:** This guide provides information about using the Duck Creek(SOAP) connector for performing operations listed in the Supported Features.

**The Duck Creek integration supports the following features:**

### Supported Software Versions

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Duck Creek
========================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform the import and de-provisioning tasks. The following components are involved in the integration:

*   **Duck Creek** is the target application for which EIC manages the identity lifecycle. Duck Creek integrates with EIC through the connector to manage accounts and access.
    
*   **Objects** are imported as entitlement types into EIC.
    
*   **Security System** represents the connection between EIC and the target application.
    
    *   It comprises an endpoint, which is the target application for which you want EIC to manage the identity repository.
        
    *   It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"").
        
*   **Endpoint** is an instance of an application within the context of a security system.
    
    *   It is the target application or application from which the connector performs provisioning or de-provisioning of identity objects, such as users, accounts, and entitlements.
        
    *   It is mandatory to create an endpoint after creating the security system.  
        You can associate a single security system with multiple endpoints if the deployment involves modeling of multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see [Creating an Endpoint for the Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").
        
*   **Connector** is a software component that enables the communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The (SOAP-based) Connector is used for provisioning accounts and access through the SOAP APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform provisioning operations from EIC.  
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the Duck Creek integration.
    

Integration Architecture
------------------------

EIC uses a **SOAP** connection for integrating with Duck Creek for importing data and for performing provisioning and de-provisioning tasks. The SOAP connection uses the SOAP protocol to communicate with the SOAP interface of Duck Creek. 

The following diagram illustrates the integration architecture and communication with the target application.  

Figure: Duck Creek Integration Architecture

Setting Up the Integration
--------------------------

### Prerequisites

Ensure that the following prerequisites are met:

1.  SOAP API credentials are provided.
    
2.  The SOAP APIs are validated and checked in an API tool such as SOAPUI before the WSDLs are configured.
    
3.  For more information about the application, See the [Duck Creek Documentation]("https://www.duckcreek.com/product/anywhere-integration/" ""https://www.duckcreek.com/product/anywhere-integration/"").
    

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

Select the connection type as **SOAP**.

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

SOAP\_ENDPOINT

Specify this parameter to create a connection.

<SOAP\_ENDPOINT>

Yes

Username

Specify this parameter to create a connection.

@USERNAME@@

Yes

Password

Specify this parameter to create a connection.

@PASSWORD@@

Yes

SOAP\_OR\_XML

Specify the type of Endpoint - SOAP or XML based.  
Default is SOAP

SOAP

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatrory**

ACCOUNTS\_IMPORT\_JSON

Specify this parameter to reconcile the accounts and entitlements .

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/71/1/Duck_Creek.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/71/1/Duck_Creek.zip"")

 

##### **Configuration Parameter for Provisioning**

**Parameter**

**Description**

**Recommended Configuration**

**Support for Binding Variables?**

**Support for Java Ternary Operations?**

DISABLEACCOUNTJSON

Specify this parameter to Disable an account. 

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/71/1/Duck_Creek.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/71/1/Duck_Creek.zip"")

 

Yes

ENABLEACCOUNTJSON

Specify this parameter to Enable an account. 

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/71/1/Duck_Creek.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/71/1/Duck_Creek.zip"")

 

Yes

### Importing Connection Package

[Transporting Packages aka T2P]("https://docs.saviyntcloud.com/csh?topicname=Transporting-Packages&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Transporting-Packages&pubname=EIC-Admin-v2022x"") connection packages help you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out-of-the-box connection templates available. Here are the steps to import the Duck Creek connection package.

*   Download the connection package.
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “Duck Creek ” Connection.
    
*   Edit the connection with your Duck Creek tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the Duck Creek Integration
================================

You can use the Duck Creek integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run the account import before running the access import.
    
*   Map all Duck Creek attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Configuring Import Operations
-----------------------------

*   **Full account import:** When configuring the connection for the first time, first perform the full import to import all existing accounts from the target application to EIC. To perform the full import, the invoke API gets a response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
    
*   **Full Access import:** When configuring the connection for the first time, first perform the full import to import all existing access from the target application to EIC. To perform the full import, the invoke API gets a response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.
    

The import jobs are automatically created in EIC after you create a connection an integration.

### **Importing Accounts and Accesses**

You must import accounts after the users are available in EIC.

**To import accounts:** 

1.  Specify the connection and import parameters.  
    **Note:** Ensure that the connection type is selected as **SOAP**.
    
2.  Configure the **Application Data Import (Single Threaded)** job to import accounts and access. For more information, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").
    

Configuring Provisioning and Deprovisioning
-------------------------------------------

Provisioning is automatically enabled when a connection is configured. For detailed information about performing provisioning tasks, see [Access Request System]("https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x"").

**To provision objects to the target application:**

1.  Specify the connection and provisioning parameters. For more information, see [Configuration Parameters for Provisioning]("https://saviynt.freshdesk.com/support/solutions/articles/43000659655-pingone-integration-guide#PingOneIntegrationGuide-ConfigurationParameterforProvisioning" ""https://saviynt.freshdesk.com/support/solutions/articles/43000659655-pingone-integration-guide#PingOneIntegrationGuide-ConfigurationParameterforProvisioning"").  
    **Note:** Ensure that the connection type is selected as **SOAP**.
    
2.  Configure the **Provisioning** job **(WSRETRY)**. For more information, see [Provisioning Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").
    

When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the connector.

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers to frequently asked questions for SOAP connectors, see the  [SOAP Connector guide]("https://docs.saviyntcloud.com/bundle/SOAP-v2020x/page/Content/About-This-Guide.htm" ""https://docs.saviyntcloud.com/bundle/SOAP-v2020x/page/Content/About-This-Guide.htm"").

**Note:** Ensure that you record the token expiry duration during the initial token generation. The connection may fail if the token is not refreshed.