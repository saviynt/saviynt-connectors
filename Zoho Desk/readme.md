### **Disclaimer**

The integration was either created by Saviynt or by Saviynt community users . The integration is available “as is” and fall under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework. 

**Note: Contributor** \- [Manju Kumari]("http://linkedin.com/in/manju-royal-ab4931258" ""http://linkedin.com/in/manju-royal-ab4931258"")

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
    
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=and%20Zoho%20Desk.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=and%20Zoho%20Desk.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Desk%20for%20RPA.-,Introduction,-Zoho%20Desk%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Desk%20for%20RPA.-,Introduction,-Zoho%20Desk%20is"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Connectors%20Documentation.-,Supported%20Features,-The%20Zoho%20Desk" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Connectors%20Documentation.-,Supported%20Features,-The%20Zoho%20Desk"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
            
*   [Understanding the Integration between EIC and]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Zoho%20Desk,-You%20must%20create" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Zoho%20Desk,-You%20must%20create"") Zoho Desk
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Zoho%20Desk%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Zoho%20Desk%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Setting Up the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-Prerequisites" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-Prerequisites"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Up%20the%20Integration-,Prerequisites,-Authentication%20to%20Zoho" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Up%20the%20Integration-,Prerequisites,-Authentication%20to%20Zoho"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=DeskAPIDocument%23OauthTokens%20.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=DeskAPIDocument%23OauthTokens%20.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=the%C2%A0Connection%20Package-,Importing%20Connection%20Package,-connection%20package%20helps" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=the%C2%A0Connection%20Package-,Importing%20Connection%20Package,-connection%20package%20helps"")
            
        *   [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Desk%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Desk%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system"")
            
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to"")
            
*   [Using the Zoho Desk Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Creating%20Endpoints.-,Using%20the%20Zoho%20Desk%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=Creating%20Endpoints.-,Using%20the%20Zoho%20Desk%20Integration,-You%20can%20use"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=JSON%20for%20provisioning.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/community-sourced-integrations/zoho-desk-integration-guide/ta-p/52182#:~:text=JSON%20for%20provisioning.-,Troubleshooting,-To%20troubleshoot%20common"")
    

### Preface

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Zoho Desk.

### Audience

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with Zoho Desk for RPA.

### **Introduction**

**Zoho Desk** is a cloud-based customer support and help desk software developed by Zoho Corporation. It is designed to help businesses manage their customer service operations efficiently by providing tools and features for ticketing, automation, self-service, and reporting. Here are some key features and functionalities of Zoho Desk:

1.  Multi-Channel Support: Zoho Desk allows businesses to consolidate customer inquiries from various communication channels, including email, chat, social media, and web forms, into a single interface.
    
2.  Ticketing System: Users can create and manage support tickets to track customer issues and requests. Tickets can be assigned to specific agents or teams for resolution.
    
3.  Automation: Zoho Desk offers workflow automation tools that enable businesses to automate repetitive tasks and processes. This can include automated ticket assignment, routing, and responses.
    
4.  Self-Service Portal: It provides a self-service knowledge base where businesses can publish FAQs, articles, and other resources to help customers find answers to common questions without the need for agent intervention.
    
5.  Multi-Department Support: Zoho Desk allows companies to set up and manage different departments or teams within their support organization, each with its own set of rules and workflows.
    
6.  Reporting and Analytics: Users can generate reports and analyze data to gain insights into support operations, agent performance, and customer satisfaction.
    
7.  Integration: Zoho Desk integrates with other Zoho applications and third-party software, allowing businesses to connect it with their existing tools and systems for a seamless workflow.
    
8.  Customer Portal: Customers can access a dedicated portal to submit tickets, check the status of their requests, and interact with support agents.
    
9.  Multi-Language Support: It offers support for multiple languages, enabling businesses to provide customer support to a global audience.
    
10.  Mobile Accessibility: Zoho Desk is accessible via mobile apps, making it convenient for agents to provide support while on the go.
    

Zoho Desk is part of the larger Zoho suite of cloud-based business software solutions, which includes CRM, marketing automation, project management, and more. It is designed to help businesses improve their customer service operations, streamline communication, and enhance customer satisfaction.

For more information about different connectors in EIC, see [Connectors Documentation]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

Supported Features
------------------

**The Zoho Desk integration supports the following features:**

Supported Software Versions
---------------------------

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Zoho Desk
=======================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and deprovisioning tasks. The following components are involved in the integration:

*   The Complete Service Management platform Zoho Desk combines ITSM with ESM and SIAM capabilities, enabling all internal departments, such as IT, HR, and Facilities, as well as external service providers and customers, to collaborate securely and seamlessly on one complete platform, reducing complexity and improving productivity.
    
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
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the Zoho Desk integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Zoho Desk for performing provisioning items in Zoho Desk Queue. The REST connection uses the REST protocol to communicate with the REST interface of Zoho Desk. 

The following diagram illustrates the integration architecture and communication with the target application.  

Setting Up the Integration
--------------------------

**Prerequisites**

Authentication to Zoho Desk is through an Access Token please follow below steps.

1.  **Generating Tokens:**
    

Invoke a URL in the following format to exchange the authorization code (obtained at the end of the previous step) with an OAuthToken.

After invoking the URL, you will be presented with an access token, which you must include in all API calls.

**NOTE :**Each access token is valid for **only an hour** and used only for the operations defined in the scope.Refresh token does not expire. Use it to refresh access tokens when they expire.You can only generate a maximum of **five** refresh tokens in a minute.

**2.Refreshing your Access Tokens**

Access tokens generally expire in one hour, which means a new access token has to be generated to keep the process going. You can eliminate the need to perform the entire procedure to generate access tokens, by using refresh tokens. Once the access token expires, the refresh token can be used to generate a new access token.

Refresh token can be obtained only when access\_type is set to offline while creating the access token.

Refer to the example to understand how an access token can be obtained using the refresh token.

**NOTE:**

*   A "User" in an organization can have a maximum of 20 refresh tokens. And each refresh token can have a maximum of 30 active access tokens (non expired).
    
*   When a user creates a 31st access token, the system deletes the first created access token. Similarly, when the user creates the 21st refresh token, the system deletes the first created refresh token.
    
*   You can only generate a maximum of **five** refresh tokens in a minute.
    
*   We have provided with a sample test OAuth in all the examples, so that you can test any example on your own. You can replace the sample OAuth Token with your actual token to test requests from your Desk account.
    

 For more information please follow [https://desk.zoho.com/DeskAPIDocument#OauthTokens]("https://desk.zoho.com/DeskAPIDocument#OauthTokens") .

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

Specify this parameter to establish a REST connection with Zoho Deskapplication.

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/74/1/Zoho_Desk.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/74/1/Zoho_Desk.zip"")

### Provisioning Parameters for Creating Queue and Fetching Queue Status

To create Queue in Zoho Desk, poll and fetch the status of Queue when WSRETRY job is run, specify the below mentioned parameters. 

**Parameter**

**Description**

CREATETICKETJSON

Specify this parameter to create Queue in Zoho Desk.

When you run the WSRETRY job using the CREATETICKETJSON parameter, it creates Queue in Zoho Desk. The possible status of Queue in Zoho Deskare: Open, Closed, or Pending. The ticket remains in Open status in Zoho Desk it is automatically or manually completed in Zoho Desk.

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/74/1/Zoho_Desk.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/74/1/Zoho_Desk.zip"")

Ticket Status JSON

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/74/1/Zoho_Desk.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/74/1/Zoho_Desk.zip"")

### Importing Connection Package

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out of the box connection templates available. Here are the steps to import the Zoho Desk connection package.

*   Download the [connection package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/74/1/Zoho_Desk.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/74/1/Zoho_Desk.zip"").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “Zoho Desk ” Connection.
    
*   Edit the connection with your Zoho Desk tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the Zoho Desk Integration
===============================

You can use the Zoho Desk integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run account import before running the access import.
    
*   Map all Zoho Desk attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers for frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm"").

**Note:** Ensure that you record the token expiry duration during the initial token generation. The connection may fail, if the token is not refreshed.