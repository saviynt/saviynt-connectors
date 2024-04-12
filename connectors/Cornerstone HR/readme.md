**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework.

 **Contributor** \- [Vedanth B.K]("https://www.linkedin.com/in/vedanthbk" ""https://www.linkedin.com/in/vedanthbk"")

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=EIC)%20and%20Cornerstone.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=EIC)%20and%20Cornerstone.-,Audience,-This%20guide%20is"")
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=users%20from%20Cornerstone.-,Introduction,-Cornerstone%20provides%20cloud" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=users%20from%20Cornerstone.-,Introduction,-Cornerstone%20provides%20cloud"")
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Cornerstone%20integration" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Cornerstone%20integration"")
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
*   [Understanding the Integration between EIC and Cornerstone]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Cornerstone,-You%20must%20create" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Cornerstone,-You%20must%20create"")
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=the%20Cornerstone%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=the%20Cornerstone%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
    *   [Configuring a Connection]("https://forums.saviynt.com/t5/tkb/articleeditorpage/tkb-id/se-wip/html-template-id/6#:~:text=the%20target%20application.-,Configuring%20a%20Connection,-Prerequisites")
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=Configuring%20a%20Connection-,Prerequisites,-If%20you%20are")
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=this%20link.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=this%20link.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            *   [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=a%20Connection.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=a%20Connection.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a"")
            *   [Configuration Parameters for User Import]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=the%20target%20application.-,Configuration%20Parameters%20for%20User%20Import,-The%20connector%20uses" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=the%20target%20application.-,Configuration%20Parameters%20for%20User%20Import,-The%20connector%20uses"")
*   [Using the Cornerstone Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=Yes-,Using%20the%20Cornerstone%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=Yes-,Using%20the%20Cornerstone%20Integration,-You%20can%20use"")
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import"")
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=UserImport%20JSON.-,Configuring%20Import%20Operations,-Full%20User%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=UserImport%20JSON.-,Configuring%20Import%20Operations,-Full%20User%20import"")
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=Data%20Jobs.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/community-sourced-integrations/cornerstone-hr-integration-guide/ta-p/35352#:~:text=Data%20Jobs.-,Troubleshooting,-To%20troubleshoot%20common"")

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Cornerstone.

Audience
========

This guide is intended for administrators and target system integration teams responsible for integrating and importing users from Cornerstone.

Introduction
============

**Cornerstone** provides cloud-based software solutions for human capital management (HCM) and talent management. Their software platform, known as Cornerstone OnDemand, offers a range of tools and modules to help organizations manage various aspects of their workforce, such as recruiting, onboarding, performance management, learning and development, and succession planning. Cornerstone OnDemand aims to support organizations in optimizing their workforce, improving employee engagement, and enhancing talent development.

The **REST** connector enables you to create an integration with Cornerstone for importing users to Saviynt EIC as an HR Identity source. For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the Cornerstone (REST-based) connector for performing operations listed in the Supported Features.

Supported Features
------------------

The Cornerstone integration supports the following features:

### **Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Cornerstone
=========================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import tasks. The following components are involved in the integration:

*   **Cornerstone** is the target application that is integrated with the EIC through the REST connector to import the users.
    
*   The REST connector enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing users through the REST APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import operations from EIC. For more information about the jobs used by the connector in the Cornerstone integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Cornerstone for importing users. The REST connection uses the REST protocol to communicate with the REST interface of Cornerstone. 

The following diagram illustrates the connector architecture and communication with the target application.

**Configuring a Connection**

### **Prerequisites**

*   If you are a Cornerstone client and would like to use APIs to build integrations for your organization, please submit a purchase inquiry through the Edge Marketplace. To do this, login to your Cornerstone portal and navigate to Admin > Tools > Edge > Marketplace > Search for 'Cornerstone API' > Click on the tile for 'Cornerstone API' > Click 'Purchase Inquiry' > Complete the form and hit 'Submit'. If you need access to the Reporting API, perform the same steps, however, instead of 'Cornerstone API', search for and click on 'Reporting API' in the Edge Marketplace. Note that you must have the 'Edge Marketplace - Manage' security permission to perform these actions.
    
*   Every application that you intend to integrate using Cornerstone's APIs and OAuth 2.0 must be registered within the API Management page. You can register multiple applications with Cornerstone to get a distinct client ID and secret for each application.
    
    1.  Login to your Cornerstone portal.
        
    2.  Navigate to Admin > Tools > Edge > API Management.
        
    3.  On the Manage Applications tab, click Register New Application.
        
    4.  Enter your Application Name.
        
    5.  Enter the User ID of an active user in your portal.
        
    6.  In the Access Token Validity Period field, enter the period in seconds for which Cornerstone should issue access tokens for this application. Value should be a valid integer between 300 and 86,400. If no value is entered in this field, Cornerstone will issue access tokens that are valid for 3600 seconds by default (1 hour).
        
    7.  In the Scopes section, select the scopes you want to associate with your application. In Cornerstone, scopes function like an access control list. They control the API endpoints your application has access to and the HTTP operations (GET, POST, PUT, PATCH) your application can perform against those endpoints. For example, if your application only needs access to create and retrieve learning object data from Cornerstone, you should select 'training: write' and 'training: read'. To select scopes,
        
        1.  Click on the 'Modify' button for one of the API products. Alternatively, you can select the checkbox next to Cornerstone API and Reporting API to grant your application access to all the endpoints under those products.
            
        2.  In the pop-up window, you can see the scope names and the corresponding HTTP operation and endpoints. Search for and select the scopes you want to associate with your application. You can select multiple scopes for each application.
            
        3.  Click on 'Save'
            
    8.  Click Register Application.
        
    9.  If the User ID entered is valid, the page refreshes and displays a client ID and client secret. Copy both values and add them to your external application or tool.
        
*   For more information check this [link]("https://csod.dev/guides/getting-started/" ""https://csod.dev/guides/getting-started/"").
    

### **Creating a Connection**

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").

#### **Understanding the Configuration Parameters**

While creating a connection, you must specify connection parameters that the connector uses to connect with the target application, define the type of operations to perform, the target application objects against which those operations are performed, and the frequency of performing them. In addition, you can view and edit attribute mappings between EIC and the target application.

#### **Configuration Parameters for User Import**

The connector uses the following parameters for creating a connection and for importing users from the target application:

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

\-

No

Email Template

Specify this parameter to select an email template for sending notifications.

Email templates provide immediate triggers of emails to a user based on actions performed. The email informs the user about the action performed and if critical, needs immediate action from the user.

\-

No

ConnectionJSON

Specify this parameter to create a connection.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/31/1/Cornerstone.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/31/1/Cornerstone.zip"") 

  

Yes

###### **Import Parameters**

**Parameter**

**Description**

  
  

**Recommended Configuration**

**Mandatory?**

UserImport JSON

Specify this parameter to import the users.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/31/1/Cornerstone.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/31/1/Cornerstone.zip"") 

Yes

UpdateUserJSON

Specify this parameter to update the users.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/31/1/Cornerstone.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/31/1/Cornerstone.zip"") 

Yes

Using the Cornerstone Integration
=================================

You can use the Cornerstone integration for performing user import after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

To configure import, map all Cornerstone attributes to EIC user attributes using **UserImport JSON**.

Configuring Import Operations
-----------------------------

**Full User import:** When configuring the connection for the first time, first perform the full import to import all existing Users from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC.

The import jobs are automatically created in EIC after you create a connection for the Cornerstone integration.

**To import users:** 

1.  Specify the connection and import parameters.  
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **User Import via a Connection (UserImportJob)** to import users. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter10-Job-Control-Panel/Job-Categories-for-Flat-Job-Control-Panel.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter10-Job-Control-Panel/Job-Categories-for-Flat-Job-Control-Panel.htm"").
    

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers to frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm"").