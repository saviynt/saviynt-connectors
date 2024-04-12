**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users . The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework.

**Note: Contributor** \- [Manju Kumari]("http://linkedin.com/in/manju-royal-ab4931258" ""http://linkedin.com/in/manju-royal-ab4931258"")

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
    
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=and%20Paychex%20Flex.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=and%20Paychex%20Flex.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=from%20Paychex%20Flex.-,Introduction,-Paychex%20Flex%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=from%20Paychex%20Flex.-,Introduction,-Paychex%20Flex%20is"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Paychex%20Flex" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Paychex%20Flex"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
            
*   [Understanding the Integration between EIC and]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Paychex%20Flex,-You%20must%20create" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Paychex%20Flex,-You%20must%20create"") Paychex Flex
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Paychex%20Flex%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Paychex%20Flex%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Configuring a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Flex%20Integration%20Architecture-,Configuring%20a%20Connection,-Prerequisites" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Flex%20Integration%20Architecture-,Configuring%20a%20Connection,-Prerequisites"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Configuring%20a%20Connection-,Prerequisites,-Your%20application%20will" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Configuring%20a%20Connection-,Prerequisites,-Your%20application%20will"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=of%20your%20request.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=of%20your%20request.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            
            *   [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=a%20Connection.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=a%20Connection.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a"")
                
            *   [Configuration Parameters for User Import]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=the%20target%20application.-,Configuration%20Parameters%20for%20User%20Import,-The%20connector%20uses" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=the%20target%20application.-,Configuration%20Parameters%20for%20User%20Import,-The%20connector%20uses"")
                
                *   [Connection Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter"")
                    
                *   [Import Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Yes-,Import%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Yes-,Import%C2%A0Parameters,-Parameter"")
                    
*   [Using the Paychex Flex Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Yes-,Using%20the%20Paychex%20Flex%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Yes-,Using%20the%20Paychex%20Flex%20Integration,-You%20can%20use"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import"")
        
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=UserImport%20JSON.-,Configuring%20Import%20Operations,-Full%20User%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=UserImport%20JSON.-,Configuring%20Import%20Operations,-Full%20User%20import"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Data%20Jobs.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/community-sourced-integrations/paychex-flex-hr-integration-guide/ta-p/59873#:~:text=Data%20Jobs.-,Troubleshooting,-To%20troubleshoot%20common"")
    

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Paychex Flex.

Audience
========

This guide is intended for administrators and target system integration teams responsible for integrating and importing users from Paychex Flex.

Introduction
============

**Paychex Flex** is a cloud-based human resource management and payroll software platform offered by Paychex, Inc., a company that specializes in providing payroll and human resource services to businesses. Paychex Flex is designed to help businesses manage their payroll, HR, benefits, and other related tasks more efficiently.

Some key features of Paychex Flex include:

1.  Payroll Processing: It allows businesses to process payroll, calculate taxes, and handle direct deposits. It can also generate pay stubs and tax forms.
    
2.  Time and Attendance: Paychex Flex offers time and attendance tracking to monitor employee work hours, paid time off, and scheduling.
    
3.  HR Management: The platform helps with HR functions like employee onboarding, HR compliance, document storage, and reporting.
    
4.  Benefits Administration: It assists in managing employee benefits, such as health insurance and retirement plans.
    
5.  Employee Self-Service: Employees can access their pay stubs, tax forms, and other information through a self-service portal.
    
6.  Reporting and Analytics: It provides various reporting and analytics tools to help businesses gain insights into their HR and payroll data.
    
7.  Mobile Accessibility: Paychex Flex offers a mobile app, making it easy for employees and administrators to access the system on the go.
    

The specific features and capabilities of Paychex Flex may vary depending on the subscription plan and customization options chosen by the business. It's a popular choice among small and medium-sized businesses looking for an integrated solution to manage their payroll and HR needs.

Paychex Flex is known for its user-friendly interface and the ability to provide a holistic view of HR and employee management in one system. It's designed to help businesses of various sizes and industries streamline their HR and administrative processes.

The **REST** connector enables you to create an integration with Paychex Flex for importing users to Saviynt EIC as an HR Identity source. For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the Paychex Flex (REST-based) connector for performing operations listed in the Supported Features.

Supported Features
------------------

The Paychex Flex integration supports the following features:

**Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Paychex Flex
==========================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import tasks. The following components are involved in the integration:

*   **Paychex Flex** is the target application that is integrated with the EIC through the REST connector to import the users.
    
*   The REST connector enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing users through the REST APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import operations from EIC. For more information about the jobs used by the connector in the Paychex Flex integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Paychex Flex for importing users. The REST connection uses the REST protocol to communicate with the REST interface of Paychex Flex. 

The following diagram illustrates the connector architecture and communication with the target application.

                            Figure: Paychex Flex Integration Architecture

Configuring a Connection
------------------------

### **Prerequisites**

Your application will be given an API key and secret which are necessary for the making the authentication call. The authentication call with allow Paychex to authorize consumption of the Flex API. (for clients) the API key will be generated automatically when you create your application within Paychex Flex, Company Settings, Connected Applications.

Using your Key/Secret

*   Your application's key is the like a username and the secret as a password.
    
*   After making the Authorization call using the key/secret, a bearer token will be generated. This is like a session to verify who you are when making requests.
    
*   Your credentials MUST be provided in the 'request body'
    
*   If you have an application that is authorized to multiple client accounts, you can use the same key and secret between them.
    
*   Access tokens have a short life span. By default, access tokens expire in 60 minutes.
    
*   Response headers will let you know how much time you have left on the token. You will need to regenerate using the authentication endpoint to create a new bearer token (no refresh is available).
    

Treat your secret API keys as you would any other password. Grant access only to those who need it. Your client credentials carry many privileges, so be sure to keep them secure!

Using the generated bearer token

When you make a call to a Paychex API resource end point, you need to provide an active bearer token within the 'Body' of your request.

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

Use the following format to connect to the Paychex Flex application:

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/84/1/Paychex.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/84/1/Paychex.zip"")

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatory?**

UserImport JSON

Specify this parameter to import the users.

Use the following format to import users using the Paychex Flex application:

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/84/1/Paychex.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/84/1/Paychex.zip"")

Yes

Using the Paychex Flex Integration
==================================

You can use the Paychex Flex integration for performing user import after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

To configure import, map all Paychex Flex attributes to EIC user attributes using **UserImport JSON**.

Configuring Import Operations
-----------------------------

**Full User import:** When configuring the connection for the first time, first perform the full import to import all existing Users from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC.

The import jobs are automatically created in EIC after you create a connection for the Paychex Flex integration.

**To import users:** 

1.  Specify the connection and import parameters.  
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **User Import via a Connection (UserImportJob)** to import users. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter10-Job-Control-Panel/Job-Categories-for-Flat-Job-Control-Panel.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter10-Job-Control-Panel/Job-Categories-for-Flat-Job-Control-Panel.htm"").
    

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers to frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm"").