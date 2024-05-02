### **Disclaimer**

The integration was either created by Saviynt or by Saviynt community users . The integration is available “as is” and fall under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework. 

**Note: Contributor** \- [Manju Kumari]("http://linkedin.com/in/manju-royal-ab4931258" ""http://linkedin.com/in/manju-royal-ab4931258"")

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
    
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=EIC)%20and%20NinjaOne.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=EIC)%20and%20NinjaOne.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=NinjaOne%20for%20RPA.-,Introduction,-NinjaOne%20is%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=NinjaOne%20for%20RPA.-,Introduction,-NinjaOne%20is%20a"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=Connectors%20Documentation.-,Supported%20Features,-The%20NinjaOne%20integration" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=Connectors%20Documentation.-,Supported%20Features,-The%20NinjaOne%20integration"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
            
*   [Understanding the Integration between EIC and]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0NinjaOne,-You%20must%20create" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0NinjaOne,-You%20must%20create"") NinjaOne
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=the%20NinjaOne%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=the%20NinjaOne%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Setting Up the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-Prerequisites" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-Prerequisites"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=Up%20the%20Integration-,Prerequisites,-Authentication%20to%20NinjaOne" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=Up%20the%20Integration-,Prerequisites,-Authentication%20to%20NinjaOne"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=Body-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=Body-,Creating%20a%20Connection,-Connection%20refers%20to"")
            
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=the%C2%A0Connection%20Package-,Importing%20Connection%20Package,-connection%20package%20helps" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=the%C2%A0Connection%20Package-,Importing%20Connection%20Package,-connection%20package%20helps"")
            
        *   [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=NinjaOne%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=NinjaOne%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system"")
            
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to"")
            
*   [Using the NinjaOne Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=Creating%20Endpoints.-,Using%20the%20NinjaOne%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=Creating%20Endpoints.-,Using%20the%20NinjaOne%20Integration,-You%20can%20use"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=JSON%20for%20provisioning.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/community-sourced-integrations/ninjaone-integration-guide/ta-p/53191#:~:text=JSON%20for%20provisioning.-,Troubleshooting,-To%20troubleshoot%20common"")
    

### Preface

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and NinjaOne.

### Audience

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with NinjaOne for RPA.

### **Introduction**

**NinjaOne** is a leading unified IT management software company that simplifies how IT teams work. MSPs and IT departments can automate, manage, and remediate all their device management tasks within one fast, modern, intuitive platform, improving technician efficiency and user satisfaction.

"NinjaOne" is a cybersecurity platform and product developed by the cybersecurity company NinjaRMM. NinjaRMM specializes in providing remote monitoring and management (RMM) solutions for IT professionals and managed service providers (MSPs).

Ticketing System: Users can create and manage support tickets to track customer issues and requests. Tickets can be assigned to specific agents or teams for resolution.

For more information about different connectors in EIC, see [Connectors Documentation]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

Supported Features
------------------

**The NinjaOne integration supports the following features:**

Supported Software Versions
---------------------------

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and NinjaOne
======================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and deprovisioning tasks. The following components are involved in the integration:

*   The Complete Service Management platform NinjaOne combines ITSM with ESM and SIAM capabilities, enabling all internal departments, such as IT, HR, and Facilities, as well as external service providers and customers, to collaborate securely and seamlessly on one complete platform, reducing complexity and improving productivity.
    
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
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the NinjaOne integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with NinjaOne for performing provisioning items in NinjaOne Queue. The REST connection uses the REST protocol to communicate with the REST interface of NinjaOne. 

The following diagram illustrates the integration architecture and communication with the target application.  

Setting Up the Integration
--------------------------

**Prerequisites**

Authentication to NinjaOne is through an Access Token please follow below steps.

1.  **Refresh Tokens**
    

A refresh token is a special kind of token used to obtain a renewed **access token**. You can request new access tokens until the refresh token expires. Applications must store refresh tokens securely because they essentially allow a user to remain authenticated forever.

 2. **Get Refresh Tokens**

When registering an application sure your application's Grant Types include **Refresh Token**. Then you must include the offline\_access scope when you initiate an authentication request through the /oauth/authorize endpoint.

**3.Use Refresh Token**

You should only ask for a new token if the access token has expired. It's bad practice to call the endpoint to get a new access token every time you call an API.

To exchange the refresh token you received during authorization for a new access token, make a POST request to the /oauth/token endpoint, using grant\_type=refresh\_token.

POST

[https://app.ninjarmm.com/ws/oauth/token]("https://app.ninjarmm.com/ws/oauth/token" ""https://app.ninjarmm.com/ws/oauth/token"")

Body

Creating a Connection
---------------------

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").

#### **Understanding the Configuration Parameters**

While creating a connection, you must specify connection parameters that the connector uses to connect with the target application, define the type of operations to perform, the target application objects against which those operations are performed, and the frequency of performing them. In addition, you can view and edit attribute mappings between EIC and the target application, predefined correlation rules, and provisioning jobs and import jobs.

##### **Configuration Parameters for Account and Access Import**

The connector uses the following parameters for creating a connection and for importing account and access from the target application:

### Connection Parameters

Parameters

Description

Connection Name \*

Provides a unique name for the connection.

Connection Description \*

Provides the description for the new connection being created.

Connection Type \*

Select the connection type as REST.

Save Template

Allows you to save the connection template with the specified parameter values.

Click **Save Template** and specify the template name.

Email Template

Provides the email template applicable for notifications.

Email notifications provides immediate trigger of emails to respective user based on actions performed. Emails acts as one of the notifications to user informing which action has been performed and if critical, needs immediate action from the user.

Default SAV Role

Provides the SAV role for which you want to assign access to the newly created connection.

The SAV role is a EIC Role used to give specific access to a User. For example, if ROLE\_User is selected then user(s) assigned the ROLE\_User are given access to this connection. 

Connection JSON

Specify this parameter to establish a REST connection with NinjaOneapplication.

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/76/1/Ninjaone.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/76/1/Ninjaone.zip"")

### Provisioning Parameters for Creating Queue and Fetching Queue Status

To create Queue in NinjaOne, poll and fetch the status of Queue when WSRETRY job is run, specify the below mentioned parameters. 

**Parameter**

**Description**

CREATETICKETJSON

Specify this parameter to create Queue in NinjaOne.

When you run the WSRETRY job using the CREATETICKETJSON parameter, it creates Queue in NinjaOne. The possible status of Queue in NinjaOneare: Open, Closed, or Pending. The ticket remains in Open status in NinjaOne it is automatically or manually completed in NinjaOne.

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/76/1/Ninjaone.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/76/1/Ninjaone.zip"")  

### Importing Connection Package

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out of the box connection templates available. Here are the steps to import the NinjaOne connection package.

*   Download the [connection package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/76/1/Ninjaone.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/76/1/Ninjaone.zip"").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “NinjaOne ” Connection.
    
*   Edit the connection with your NinjaOne tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the NinjaOne Integration
==============================

You can use the NinjaOne integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run account import before running the access import.
    
*   Map all NinjaOne attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers for frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm"").

**Note:** Ensure that you record the token expiry duration during the initial token generation. The connection may fail, if the token is not refreshed.