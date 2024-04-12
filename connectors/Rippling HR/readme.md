**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users . The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework.

**Note: Contributor** \- [Manju Kumari]("http://linkedin.com/in/manju-royal-ab4931258" ""http://linkedin.com/in/manju-royal-ab4931258"")

*   [Preface]("https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/4333502465/Cornerstone+HR+Integration+Guide#Preface" ""https://saviyntars.atlassian.net/wiki/spaces/SSMR5/pages/4333502465/Cornerstone+HR+Integration+Guide#Preface"")
    
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=EIC)%20and%20Rippling.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=EIC)%20and%20Rippling.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=users%20from%20Rippling.-,Introduction,-Rippling%20is%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=users%20from%20Rippling.-,Introduction,-Rippling%20is%20a"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Rippling%20integration" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Rippling%20integration"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
            
*   [Understanding the Integration between EIC and]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Rippling,-You%20must%20create" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Rippling,-You%20must%20create"") Rippling
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=the%20Rippling%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=the%20Rippling%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Configuring a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=Rippling%20Integration%20Architecture-,Configuring%20a%20Connection,-Prerequisites" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=Rippling%20Integration%20Architecture-,Configuring%20a%20Connection,-Prerequisites"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=Configuring%20a%20Connection-,Prerequisites,-Rippling%20customers%20access" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=Configuring%20a%20Connection-,Prerequisites,-Rippling%20customers%20access"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=this%20link.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=this%20link.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            
            *   [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=a%20Connection.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=a%20Connection.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a"")
                
            *   [Configuration Parameters for User Import]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=the%20target%20application.-,Configuration%20Parameters%20for%20User%20Import,-The%20connector%20uses" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=the%20target%20application.-,Configuration%20Parameters%20for%20User%20Import,-The%20connector%20uses"")
                
                *   [Connection Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter"")
                    
                *   [Import Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=Yes-,Import%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=Yes-,Import%C2%A0Parameters,-Parameter"")
                    
*   [Using the Rippling Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=Yes-,Using%20the%20Rippling%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=Yes-,Using%20the%20Rippling%20Integration,-You%20can%20use"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import"")
        
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=UserImport%20JSON.-,Configuring%20Import%20Operations,-Full%20User%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=UserImport%20JSON.-,Configuring%20Import%20Operations,-Full%20User%20import"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=Data%20Jobs.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/community-sourced-integrations/rippling-hr-integration-guide/ta-p/56471#:~:text=Data%20Jobs.-,Troubleshooting,-To%20troubleshoot%20common"")
    

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Rippling.

Audience
========

This guide is intended for administrators and target system integration teams responsible for integrating and importing users from Rippling.

Introduction
============

**Rippling is** a software platform that provides a comprehensive solution for managing HR, payroll, benefits, and other employee-related processes. Rippling is designed to streamline and automate various HR functions, making it easier for businesses to manage their workforce.

Key features and capabilities of Rippling's HR system typically include:

1.  **Onboarding:** Rippling allows businesses to efficiently onboard new employees by automating the collection of personal and employment information, setting up accounts and access to necessary tools, and ensuring compliance with employment regulations.
    
2.  **Payroll:** The system facilitates payroll processing, including tax calculations, direct deposit, and compliance with payroll tax laws. It can also integrate with accounting and finance software to streamline financial processes.
    
3.  **Benefits Administration:** Rippling helps manage employee benefits, including health insurance, retirement plans, and other perks. Employees can make benefit selections and changes through the platform.
    
4.  **Time and Attendance Tracking:** The system may include time-tracking features to monitor employee work hours, attendance, and time-off requests.
    
5.  **Employee Self-Service:** Employees can access their own profiles, update personal information, view pay stubs, and make changes to their benefits, reducing administrative work for HR departments.
    
6.  **Compliance and Reporting:** Rippling typically offers tools to help businesses remain compliant with labor laws and regulations, as well as generate reports and analytics related to their workforce.
    
7.  **Integration:** Rippling often integrates with other business software and tools, such as accounting software, customer relationship management (CRM) systems, and other HR-related platforms.
    

Rippling is known for its user-friendly interface and the ability to provide a holistic view of HR and employee management in one system. It's designed to help businesses of various sizes and industries streamline their HR and administrative processes.

The **REST** connector enables you to create an integration with Rippling for importing users to Saviynt EIC as an HR Identity source. For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the Rippling (REST-based) connector for performing operations listed in the Supported Features.

Supported Features
------------------

The Rippling integration supports the following features:

### **Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Rippling
======================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import tasks. The following components are involved in the integration:

*   **Rippling** is the target application that is integrated with the EIC through the REST connector to import the users.
    
*   The REST connector enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing users through the REST APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import operations from EIC. For more information about the jobs used by the connector in the Rippling integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Rippling for importing users. The REST connection uses the REST protocol to communicate with the REST interface of Rippling. 

The following diagram illustrates the connector architecture and communication with the target application.

                                            Figure: Rippling Integration Architecture

Configuring a Connection
------------------------

### **Prerequisites**

*   Rippling customers access the Rippling API to retrieve and update information on their organization's behalf to build integrations with internal systems and applications.
    
    If you are a Rippling customer, you will need to create an Access Token with defined scopes in order to access the Rippling API. The Access Token will only be able to access data that you specifically enable it to during the Access Token creation process. You will need to explicitly grant the Access Token access to data fields on behalf of your organization.
    
    Note, Access Tokens are to be used only for internal integrations and are not meant for sharing to 3rd-parties.
    
    Lastly, customer Access Tokens currently require the Rippling Access Token package. If you'd like to learn more, please reach out to your Rippling Account Representative.
    

*   For more information check this [link]("https://help.rippling.com/s/login/?language=en_US&ec=302&startURL=%2Fs%2Farticle%2F4403858209431" ""https://help.rippling.com/s/login/?language=en_US&ec=302&startURL=%2Fs%2Farticle%2F4403858209431"").
    

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

Use the following format to connect to the Rippling application:

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/82/1/Rippling.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/82/1/Rippling.zip"")

  

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatory?**

UserImport JSON

Specify this parameter to import the users.

Use the following format to import users using the Rippling application:

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/82/1/Rippling.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/82/1/Rippling.zip"")

Yes

Using the Rippling Integration
==============================

You can use the Rippling integration for performing user import after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

To configure import, map all Rippling attributes to EIC user attributes using **UserImport JSON**.

Configuring Import Operations
-----------------------------

**Full User import:** When configuring the connection for the first time, first perform the full import to import all existing Users from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC.

The import jobs are automatically created in EIC after you create a connection for the Rippling integration.

**To import users:** 

1.  Specify the connection and import parameters.  
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **User Import via a Connection (UserImportJob)** to import users. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter10-Job-Control-Panel/Job-Categories-for-Flat-Job-Control-Panel.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter10-Job-Control-Panel/Job-Categories-for-Flat-Job-Control-Panel.htm"").
    

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers to frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm"").