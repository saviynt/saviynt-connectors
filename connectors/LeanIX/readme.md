**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connector support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework.  

**Contents**

*   [Preface]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
    
*   [Audience]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=EIC)%20and%20LeanIX.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=EIC)%20and%20LeanIX.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=service%20with%20LeanIX.-,Introduction,-LeanIX%20is%20an" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=service%20with%20LeanIX.-,Introduction,-LeanIX%20is%20an"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20LeanIX%20integration" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20LeanIX%20integration"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
            
*   [Understanding the Integration between EIC and  LeanIX]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0LeanIX,-You%20must%20create" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0LeanIX,-You%20must%20create"")
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=the%20LeanIX%20Integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=the%20LeanIX%20Integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Setting Up the Integration]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-API%20Overview" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-API%20Overview"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=create%20API%20Tokens.-,Prerequisites,-Create%20an%20API" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=create%20API%20Tokens.-,Prerequisites,-Create%20an%20API"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=of%20the%20token.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=of%20the%20token.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            
            *   [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Creating%20Connections.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Creating%20Connections.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a"")
                
                *   [Configuration Parameters for Account and Access Import]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=and%20import%20jobs.-,Configuration%20Parameters%20for%20Account%20and%20Access%20Import,-The%20connector%20uses" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=and%20import%20jobs.-,Configuration%20Parameters%20for%20Account%20and%20Access%20Import,-The%20connector%20uses"")
                    
                    *   [Connection Parameters]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter"")
                        
                    *   [Import Parameters]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Yes-,Import%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Yes-,Import%C2%A0Parameters,-Parameter"")
                        
                *   [Configuration Parameter for Provisioning]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Yes-,Configuration%20Parameter%20for%20Provisioning,-Parameter" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Yes-,Configuration%20Parameter%20for%20Provisioning,-Parameter"")
                    
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=the%20LeanIX%20application%3A-,Importing%20Connection%20Package,-connection%20package%20helps" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=the%20LeanIX%20application%3A-,Importing%20Connection%20Package,-connection%20package%20helps"")
            
        *   [Creating a Security System]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=LeanIX%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=LeanIX%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system"")
            
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to"")
            
*   [Using the LeanIX Integration]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Creating%20Endpoints.-,Using%20the%20LeanIX%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Creating%20Endpoints.-,Using%20the%20LeanIX%20Integration,-You%20can%20use"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply"")
        
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-%C2%B7%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%20Full%20account" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=JSON%20for%20provisioning.-,Configuring%20Import%20Operations,-%C2%B7%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%C2%A0%20Full%20account"")
        
        *   [Importing Accounts and Accesses]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Data%20Jobs.-,Importing%20Accounts%20and%20Accesses,-You%20must%20import"")
            
    *   [Configuring Provisioning and Deprovisioning]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=Data%20Jobs.-,Configuring%20Provisioning%20and%20Deprovisioning,-Provisioning%20is%20automatically"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/integration-drafts/leanix-integration-guide/ta-p/46837#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common"")
    

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and LeanIX.

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with LeanIX.

Introduction
============

LeanIX is an enterprise architecture management tool. In general, enterprise architecture is a comprehensive practice, and this tool can be used for many aspects of the practice. Primarily, the tool manages Business Capabilities, applications, technology, and Data catalogs and linkages between them.

The **LeanIX** connector enables you to seamlessly integrate with LeanIX EAM to manage the user lifecycle and govern access to their accounts and workspaces.

For more information about different connectors in EIC, see [Connectors Documentation]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:**

*   This guide provides information about using the LeanIX (REST) connector for performing operations listed in the Supported Features.
    
*   The Tenant ID is a Saviynt term for the Account ID in the LeanIX APIs.
    

Supported Features
------------------

**The LeanIX integration supports the following features:**

  

### Supported Software Versions

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and LeanIX
====================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and deprovisioning tasks. The following components are involved in the integration:

*   LeanIX is the target application for which EIC manages the identity lifecycle. LeanIX integrates with EIC through the connector to manage accounts and access.
    
*   **Objects** are imported as entitlement types into EIC.
    
*   **Security System** represents the connection between EIC and the target application.
    

1.  It comprises an endpoint, which is the target application for which you want EIC to manage the identity repository.
    
2.  It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm"").
    

*   **Endpoint** is an instance of an application within the context of a security system.
    

1.  It is the target application or application from which the connector performs provisioning or deprovisioning of identity objects, such as users, accounts, and entitlements.
    
2.  It is mandatory to create an endpoint after creating the security system.  
    You can associate a single security system with multiple endpoints if the deployment involves modeling multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see [Creating an Endpoint for the Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm"").
    

*   **Connector** is a software component that enables communication between EIC and the target application. It provides a simplified integration mechanism where, in some instances, you only need to create a connection with minimal connectivity information for your target application. The (REST-based) Connector is used for provisioning accounts and accessing them through the REST APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform provisioning operations from EIC.  
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and in the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the LeanIX integration, see Using the LeanIX Integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with LeanIX for importing data and for performing provisioning and deprovisioning tasks. The REST connection uses the REST protocol to communicate with the REST interface of LeanIX.

The following diagram illustrates the integration architecture and communication with the target application.

Setting Up the Integration
--------------------------

### API Overview

LeanIX uses [OAuth2]("http://oauth.net/2/" ""http://oauth.net/2/"") to authenticate users for all [available APIs]("https://docs.leanix.net/docs/integration-api" ""https://docs.leanix.net/docs/integration-api""). The following flow describes how an API Token is used to retrieve an Access Token. Administrators can generate one or more API Tokens in the Administration of LeanIX, which have an expiry date until they can be used. Follow the below steps to create API Tokens.

**Prerequisites  
**Create an API Token

*   Only admins can create or edit API Token. After entering Workspace as an Administrator go to API Tokens in the Developers section.
    

*   When creating a new API Token you are asked to set a name and an expiration date for the Token.
    

*   After saving your settings, the Token ID will be shown once. Please make sure that you save the ID as you will not be able to see it again in full-length.
    

*   You can now use the API Token to communicate via the defined API Endpoints.
    

#### Manage an API Token

*   If your API Tokens expire, you either have the chance to set up a new Token following the steps above or extend the expiration date of the Token in place. To do so click on the right Token from your list.
    

*   Afterward, you will be able to adapt the name and expiration date of the token.
    

### Creating a Connection

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see [Creating Connections]("https://saviynt.freshdesk.com/support/solutions/articles/43000431233-creating-connections" ""https://saviynt.freshdesk.com/support/solutions/articles/43000431233-creating-connections"").

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

Specify this parameter to assign the SAV role to the connection.

The SAV role is a role in EIC that assigns specific access to users.

This parameter is valid only for importing users.

**Sample value:** The user assigned with the **ROLE\_ADMIN** role, has access to all the sections of EIC.

\-

No

Email Template

Specify this parameter to select an email template for sending notifications.

Email templates provide an immediate trigger of emails to a user based on actions performed. Email informs the user about the action performed and, if critical, needs immediate action from the user.

\-

No

ConnectionJSON

Specify this parameter to create a connection.

Use the following format to connect to the LeanIX application:  
  

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip"") 

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatory**

AccountEntImport JSON

Specify this parameter to reconcile the accounts and entitlements

Use the following format to reconcile accounts and entitlements using the LeanIX application:    
  

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip"") 

Yes

##### **Configuration Parameter for Provisioning**

**Parameter**

**Description**

**Recommended Configuration**

**Notes**

**Support for Binding Variables?**

CreateAccountJSON

Specify this parameter to create an account in the target application.

Use the following format to create accounts using the LeanIX application:  
  

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip"") 

*   Following are the permissions that could be associated to an account for a particular workspace in LeanIX:
    

1.  Viewer
    
2.  Member
    
3.  Admin
    

*   It is mandatory to assign permission to a new account for the workspace that it is created in
    

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
    

Enable Account JSON

Specify this parameter to Enable an account in the target application.

Use the following format to enable the accounts in the LeanIX application:

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip"") 

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
    

AddAccessJSON

Specify this parameter to add access to an account.

Use the following format to add a permission in the LeanIX application:  
  

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip"") 

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
    

RemoveAccessJSON

Specify this parameter to remove access from an account.

Use the following format to remove a permission using the LeanIX application:  
  

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip"") 

*   Since it is mandatory for a LeanIX account to have a permission always associated with it, the removal of a permission would mean replacing it with a basic viewer permission.
    
*   At any point of time a LeanIX user could only be associated with one permission.
    

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
    

RemoveAccountJSON

Specify this parameter to remove an account. 

Use the following format to remove an account using the LeanIX application:  
  

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/44/1/LeanIX.zip"") 

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
    

### Importing Connection Package

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out of the box connection templates available. Here are the steps to import the LeanIX connection package.

*   Download the connection package .
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “LeanIX ” Connection.
    
*   Edit the connection with your LeanIX tenant details.
    

###  Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the LeanIX Integration
============================

You can use the LeanIX integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

·        Run account import before running the access import.

·        Map all LeanIX attributes to EIC account attributes using **ImportAccountEntJSON**.

You must apply the following guidelines for configuring provisioning:

·        Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.

Configuring Import Operations
-----------------------------

·        **Full account import:** When configuring the connection for the first time, first perform full import to import all existing accounts from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.

·        **Full Access import:** When configuring the connection for the first time, first perform full import to import all existing access from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.

The import jobs are automatically created in EIC after you create a connection for the LeanIX integration. For more information about creating jobs, see [Data Jobs]("https://saviynt.freshdesk.com/support/solutions/articles/43000608272-job-categories-for-flat-job-control-panel#JobCategoriesforFlatJobControlPanel-Data" ""https://saviynt.freshdesk.com/support/solutions/articles/43000608272-job-categories-for-flat-job-control-panel#JobCategoriesforFlatJobControlPanel-Data"").

### **Importing Accounts and Accesses**

You must import accounts after the users are available in EIC.

**To import accounts:** 

1.  Specify the connection and import parameters. For more information, see [Account]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Accounts.htm" ""https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Accounts.htm"") and [Access]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Access.htm" ""https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Importing-Access.htm"") import.  
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **Application Data Import (Single Threaded)** job to import accounts and access. For more information, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").
    

Configuring Provisioning and Deprovisioning
-------------------------------------------

Provisioning is automatically enabled when a connection is configured. For detailed information about performing provisioning tasks, see [Access Request System]("https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x"").

**To provision objects to the target application:**

1.  Specify the connection and provisioning parameters. For more information, see [Configuration Parameters for Provisioning]("https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Provisioning-and-Deprovisioning.htm" ""https://docs.saviyntcloud.com/bundle/SF-v2020x/page/Content/Configuring-the-Integration-for-Provisioning-and-Deprovisioning.htm"").  
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **Provisioning** job **(WSRETRY)**. For more information, see [Provisioning Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").
    

When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the connector.

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers for frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm"").

**Note:** Ensure that you record the token expiry duration during the initial token generation. The connection may fail, if the token is not refreshed.