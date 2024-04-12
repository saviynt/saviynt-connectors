**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework. 

**Contents**

*   [Preface]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
*   [Audience]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=SAP%20Enterprise%20Portal.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=SAP%20Enterprise%20Portal.-,Audience,-This%20guide%20is"")
*   [Introduction]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=SAP%20Enterprise%20Portal.-,Introduction,-SAP%20Enterprise%20Portal" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=SAP%20Enterprise%20Portal.-,Introduction,-SAP%20Enterprise%20Portal"")
    *   [Supported Software Versions]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
*   [Understanding the Integration between EIC and SAP Enterprise Portal]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0SAP%20Enterprise%20Portal,-You%20must%20create" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0SAP%20Enterprise%20Portal,-You%20must%20create"")
    *   [Integration Architecture]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Enterprise%20Portal%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Enterprise%20Portal%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
    *   [Setting Up the Integration]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Portal%20Integration%20Architecture-,Setting%20Up%20the%20Integration,-Prerequisites" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Portal%20Integration%20Architecture-,Setting%20Up%20the%20Integration,-Prerequisites"")
        *   [Prerequisites]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Up%20the%20Integration-,Prerequisites,-Ensure%20that%20the" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Up%20the%20Integration-,Prerequisites,-Ensure%20that%20the"")
        *   [Creating a Connection]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=the%20link.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=the%20link.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            *   [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Creating%20Connections.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Creating%20Connections.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a"")
                *   [Configuration Parameters for Account and Access Import]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=and%20import%20jobs.-,Configuration%20Parameters%20for%20Account%20and%20Access%20Import,-The%20connector%20uses" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=and%20import%20jobs.-,Configuration%20Parameters%20for%20Account%20and%20Access%20Import,-The%20connector%20uses"")
                    *   [Connection Parameters]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter"")
                    *   [Import Parameters]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Yes-,Import%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Yes-,Import%C2%A0Parameters,-Parameter"")
                *   [Configuration Parameter for Provisioning]("http://Configuration ""Configuration")
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Yes-,Importing%20Connection%20Package,-Transporting%20Packages%20aka" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Yes-,Importing%20Connection%20Package,-Transporting%20Packages%20aka"")
        *   [Creating a Security System]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Portal%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Portal%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system"")
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to"")
*   [Using the SAP Enterprise Portal Integration]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Creating%20Endpoints.-,Using%20the%20SAP%20Enterprise%20Portal%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Creating%20Endpoints.-,Using%20the%20SAP%20Enterprise%20Portal%20Integration,-You%20can%20use"")
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply"")
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-Full%20account%20import"")
        *   [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=connection%20an%20integration.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=connection%20an%20integration.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import"")
    *   [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically"")
*   [Troubleshooting]("https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/integration-drafts/sap-enterprise-portal-integration-guide/ta-p/38003#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common"")

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and SAP Enterprise Portal.

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with SAP Enterprise Portal.

Introduction
============

**SAP Enterprise Portal** allows you to create attractive corporate portals that leverage the responsive SAP Fiori launchpad experience. The portal is the Web front-end component for SAP NetWeaver - the comprehensive integration and application platform that facilitates the alignment of people, information, and business processes across organizational and technical boundaries.

The portal offers a single point of access to SAP and non-SAP information sources, enterprise applications, information repositories, databases, and services, in and outside your organization. You can access the portal from desktops and from mobile devices, such as smartphones or tablets.  
The portal provides you with the tools to manage and analyze its information resources and to share and collaborate. With its role-based content and personalization features, the portal enables users - from employees and customers to partners and suppliers - to focus exclusively on data relevant to daily decision-making processes. The technology and architecture of the portal ensure it is built for the enterprise, providing a secure and scalable environment.

The **SOAP** connector enables you to seamlessly integrate with SAP Enterprise Portal to manage user lifecycle and govern access to their Group and Role.

For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/csh?topicname=Saviynt-Enterprise-Identity-Cloud-Connectors&pubname=Connectors-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Saviynt-Enterprise-Identity-Cloud-Connectors&pubname=Connectors-v2022x"").

**Note:** This guide provides information about using the SAP Enterprise Portal(SOAP) connector for performing operations listed in the Supported Features.

**The SAP Enterprise Portal integration supports the following features:**

  

### Supported Software Versions

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and SAP Enterprise Portal
===================================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform the import and de-provisioning tasks. The following components are involved in the integration:

*   **SAP Enterprise Portal** is the target application for which EIC manages the identity lifecycle. SAP Enterprise Portal integrates with EIC through the connector to manage accounts and access.
    
*   **Objects** are imported as entitlement types into EIC.
    
*   **Security System** represents the connection between EIC and the target application.
    
    *   It comprises an endpoint, which is the target application for which you want EIC to manage the identity repository.
        
    *   It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"").
        
*   **Endpoint** is an instance of an application within the context of a security system.
    
    *   It is the target application or application from which the connector performs provisioning or de-provisioning of identity objects, such as users, accounts, and entitlements.
        
    *   It is mandatory to create an endpoint after creating the security system.  
        You can associate a single security system with multiple endpoints if the deployment involves modeling of multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see [Creating an Endpoint for the Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").
        
*   **The connector** is a software component that enables the communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The (SOAP-based) Connector is used for provisioning accounts and access through the SOAP APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform provisioning operations from EIC.  
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the SAP Enterprise Portal integration.
    

Integration Architecture
------------------------

EIC uses a **SOAP** connection for integrating with SAP Enterprise Portal for importing data and for performing provisioning and de-provisioning tasks. The SOAP connection uses the SOAP protocol to communicate with the SOAP interface of the SAP Enterprise Portal. 

The following diagram illustrates the integration architecture and communication with the target application.  

Figure: SAP Enterprise Portal Integration Architecture

Setting Up the Integration
--------------------------

### Prerequisites

Ensure that the following prerequisites are met:

*   You have completed the portal installation.
    
*   You have an understanding of the preconfigured roles supplied with the portal.
    
*   For more information, see [Understanding Preconfigured Portal Roles]("https://help.sap.com/doc/saphelp_nw75/7.5.5/en-US/49/75d0aea4bb6a50e10000000a42189c/content.htm" ""https://help.sap.com/doc/saphelp_nw75/7.5.5/en-US/49/75d0aea4bb6a50e10000000a42189c/content.htm"").
    
*   For more information on Configuring the Portal for Initial Use, see the [link]("https://help.sap.com/doc/saphelp_nw75/7.5.5/en-US/68/c6e6a6c00149f7b438910658fb39cc/content.htm" ""https://help.sap.com/doc/saphelp_nw75/7.5.5/en-US/68/c6e6a6c00149f7b438910658fb39cc/content.htm"").  
      
    

### Creating a Connection

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see [Creating Connections]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").

#### Understanding the Configuration Parameters

While creating a connection, you must specify connection parameters that the connector uses to connect with the target application, define the type of operations to perform, the target application objects against which those operations are performed, and the frequency of performing them. In addition, you can view and edit attribute mappings between EIC and the target application, predefined correlation rules, and provisioning jobs and import jobs.

#### Configuration Parameters for Account and Access Import

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

ConnectionJSON

Specify this parameter to create a connection.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip"") 

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

Specify this parameter to reconcile the accounts and entitlements.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip"") 

Yes

##### **Configuration Parameter for Provisioning**

**Parameter**

**Description**

**Recommended Configuration**

**Support for Binding Variables?**

**Support for Java Ternary Operations?**

CREATEACCOUNTJSON

Specify this parameter to Create an account. 

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip"") 

The bindings supported are:

*   task
    
*   user
    
*   dynamicattributename
    
*   manager
    
*   requestor
    
*   approverMap
    
*   taskowner
    
*   endpointowner
    
*   endpoint
    
*   accountName
    
*   randomPassword
    

Yes

UPDATEACCOUNTJSON

Specify this parameter to Update an account. 

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip"") 

*   task
    
*   user
    
*   dynamicattributename
    
*   manager
    
*   requestor
    
*   approverMap
    
*   taskowner
    
*   endpointowner
    
*   endpoint
    
*   accountName
    
*   randomPassword
    
*   account
    

Yes

DELETECCOUNTJSON

Specify this parameter to Delete an account. 

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip"") 

*   task
    
*   user
    
*   dynamicattributename
    
*   manager
    
*   requestor
    
*   approverMap
    
*   taskowner
    
*   endpointowner
    
*   endpoint
    
*   accountName
    
*   randomPassword
    
*   account
    

Yes

ENABLEACCOUNTJSON

Specify this parameter to Enable an account. 

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip"") 

*   task
    
*   user
    
*   dynamicattributename
    
*   manager
    
*   requestor
    
*   approverMap
    
*   taskowner
    
*   endpointowner
    
*   endpoint
    
*   accountName
    
*   randomPassword
    
*   account
    

Yes

GRANTACCESSJSON

Specify this parameter to add access to an account.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip"") 

*   task
    
*   user
    
*   dynamicattributename
    
*   manager
    
*   requestor
    
*   approverMap
    
*   taskowner
    
*   endpointowner
    
*   endpoint
    
*   accountName
    
*   randomPassword
    
*   entitlement
    
*   account
    
*   role
    
*   entTask
    
*   entitlementSet
    
*   newEntitlementMap
    
*   allEntitlementMap
    
*   rolesSet
    

Yes

REVOKEACCESSJSON

Specify this parameter to remove access to an account.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/42/1/SAP_Enterprise_Portal.zip"") 

*   task
    
*   user
    
*   dynamicattributename
    
*   manager
    
*   requestor
    
*   approverMap
    
*   taskowner
    
*   endpointowner
    
*   endpoint
    
*   accountName
    
*   randomPassword
    
*   entitlement
    
*   account
    
*   role
    
*   entTask
    
*   entitlementSet
    
*   newEntitlementMap
    
*   allEntitlementMap
    
*   rolesSet
    

Yes

### Importing Connection Package

[Transporting Packages aka T2P]("https://docs.saviyntcloud.com/csh?topicname=Transporting-Packages&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Transporting-Packages&pubname=EIC-Admin-v2022x"") connection packages help you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out-of-the-box connection templates available. Here are the steps to import the SAP Enterprise Portal connection package.

*   Download the connection package.
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “SAP Enterprise Portal ” Connection.
    
*   Edit the connection with your SAP Enterprise Portal tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the SAP Enterprise Portal Integration
===========================================

You can use the SAP Enterprise Portal integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run the account import before running the access import.
    
*   Map all SAP Enterprise Portal attributes to EIC account attributes using **ImportAccountEntJSON**.
    

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

1.  Specify the connection and provisioning parameters. For more information, see [Configuration Parameters for Provisioning]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Provisioning-and-Deprovisioning.htm" ""https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Provisioning-and-Deprovisioning.htm"").  
    **Note:** Ensure that the connection type is selected as **SOAP**.
    
2.  Configure the **Provisioning** job **(WSRETRY)**. For more information, see [Provisioning Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").
    

When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the connector.

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers to frequently asked questions for SOAP connectors, see the  [SOAP Connector guide]("https://docs.saviyntcloud.com/bundle/SOAP-v2020x/page/Content/About-This-Guide.htm" ""https://docs.saviyntcloud.com/bundle/SOAP-v2020x/page/Content/About-This-Guide.htm"").