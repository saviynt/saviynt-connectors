**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users . The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework.

**Note: Contributor** \- [Manju Kumari]("http://linkedin.com/in/manju-royal-ab4931258" ""http://linkedin.com/in/manju-royal-ab4931258"")

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
    
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=EIC)%20and%20Connecteam.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=EIC)%20and%20Connecteam.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=users%20from%20Connecteam.-,Introduction,-Connecteam%20is%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=users%20from%20Connecteam.-,Introduction,-Connecteam%20is%20a"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Connecteam%20integration" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Connecteam%20integration"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=or%20Remove%20Access-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=or%20Remove%20Access-,Supported%20Software%20Versions,-Software"")
            
*   [Understanding the Integration between EIC and]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Connecteam,-You%20must%20create" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Connecteam,-You%20must%20create"") Connecteam
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=the%20Connecteam%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=the%20Connecteam%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Configuring a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=Connecteam%20Integration%20Architecture-,Configuring%20a%20Connection,-Prerequisites" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=Connecteam%20Integration%20Architecture-,Configuring%20a%20Connection,-Prerequisites"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=Configuring%20a%20Connection-,Prerequisites,-Tokens%20can%20be" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=Configuring%20a%20Connection-,Prerequisites,-Tokens%20can%20be"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=this%20link.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=this%20link.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            
            *   [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=a%20Connection.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=a%20Connection.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a"")
                
            *   [Configuration Parameters for User Import]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=the%20target%20application.-,Configuration%20Parameters%20for%20User%20Import,-The%20connector%20uses" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=the%20target%20application.-,Configuration%20Parameters%20for%20User%20Import,-The%20connector%20uses"")
                
                *   [Connection Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter"")
                    
                *   [Import Parameters]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=Yes-,Import%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=Yes-,Import%C2%A0Parameters,-Parameter"")
                    
*   [Using the Connecteam Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=Yes-,Using%20the%20Connecteam%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=Yes-,Using%20the%20Connecteam%20Integration,-You%20can%20use"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import"")
        
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=UserImport%20JSON.-,Configuring%20Import%20Operations,-Full%20User%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=UserImport%20JSON.-,Configuring%20Import%20Operations,-Full%20User%20import"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=Data%20Jobs.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/community-sourced-integrations/connecteam-hr-integration-guide/ta-p/55821#:~:text=Data%20Jobs.-,Troubleshooting,-To%20troubleshoot%20common"")
    

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Connecteam.

Audience
========

This guide is intended for administrators and target system integration teams responsible for integrating and importing users from Connecteam.

Introduction
============

**Connecteam** is a workforce management and communication platform designed for businesses with remote or deskless employees. It provides a suite of tools and features to help organizations streamline their operations, improve communication, and manage their workforce more effectively. Some key features and capabilities of Connecteam include:

1.  Employee Communication: Connecteam enables businesses to communicate with their employees through chat, messaging, and announcement features. This helps in keeping employees informed and connected, especially if they work in different locations or shifts.
    
2.  Task and Project Management: Users can create and assign tasks, projects, and checklists to employees. This feature helps in tracking work progress and ensuring that tasks are completed on time.
    
3.  Time Tracking: Connecteam offers time tracking and attendance management tools. Employees can clock in and out using the mobile app, and managers can monitor working hours and attendance.
    
4.  Employee Scheduling: Businesses can create and manage work schedules for their employees, making it easier to assign shifts and track availability.
    
5.  Training and Onboarding: The platform allows businesses to create and deliver training materials, quizzes, and onboarding processes for new employees.
    
6.  Forms and Checklists: Users can create custom forms and checklists for various purposes, such as inspections, safety checks, and data collection.
    
7.  Employee Directory: Connecteam provides a centralized employee directory, making it easy to access contact information and organizational charts.
    
8.  Performance Tracking: Users can set performance goals, track progress, and conduct employee evaluations within the platform.
    
9.  Reporting and Analytics: Connecteam offers reporting and analytics tools to help businesses gain insights into their workforce and operations.
    
10.  Integration: The platform integrates with other business tools and software, such as payroll systems, to streamline processes and data flow.
    

Connecteam is suitable for a wide range of industries, including retail, construction, healthcare, hospitality, and more. It aims to improve efficiency, communication, and overall management of a mobile or remote workforce.

The **REST** connector enables you to create an integration with Connecteam for importing users to Saviynt EIC as an HR Identity source. For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the Connecteam (REST-based) connector for performing operations listed in the Supported Features.

Supported Features
------------------

The Connecteam integration supports the following features:

**Full Import****Incremental Import****Update user****Add or Remove Access**

### **Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Connecteam
========================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import tasks. The following components are involved in the integration:

*   **Connecteam** is the target application that is integrated with the EIC through the REST connector to import the users.
    
*   The REST connector enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing users through the REST APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import operations from EIC. For more information about the jobs used by the connector in the Connecteam integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Connecteam for importing users. The REST connection uses the REST protocol to communicate with the REST interface of Connecteam. 

The following diagram illustrates the connector architecture and communication with the target application.

                       Figure: Connecteam Integration Architecture

Configuring a Connection
------------------------

### **Prerequisites**

*   Tokens can be purchased in the Connecteam platform. This makes it easy for you to ensure you always have enough tokens when needed.
    
    To buy tokens simply press the **purchase tokens** button and select the relevant bundle. Purchased Tokens never expire and can always be refunded if needed!
    

*   For more information check this [link]("https://help.connecteam.com/en/articles/5956739-starting-guide-to-rewards" ""https://help.connecteam.com/en/articles/5956739-starting-guide-to-rewards"").
    

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

Use the following format to connect to the Connecteam application:

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/81/1/Connecteam.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/81/1/Connecteam.zip"")

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatory?**

UserImport JSON

Specify this parameter to import the users.

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/81/1/Connecteam.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/81/1/Connecteam.zip"")

Yes

UpdateUserJSON

Specify this parameter to update the users.

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/81/1/Connecteam.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/81/1/Connecteam.zip"")

Yes

Using the Connecteam Integration
================================

You can use the Connecteam integration for performing user import after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

To configure import, map all Connecteam attributes to EIC user attributes using **UserImport JSON**.

Configuring Import Operations
-----------------------------

**Full User import:** When configuring the connection for the first time, first perform the full import to import all existing Users from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC.

The import jobs are automatically created in EIC after you create a connection for the Connecteam integration.

**To import users:** 

1.  Specify the connection and import parameters.  
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **User Import via a Connection (UserImportJob)** to import users. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter10-Job-Control-Panel/Job-Categories-for-Flat-Job-Control-Panel.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter10-Job-Control-Panel/Job-Categories-for-Flat-Job-Control-Panel.htm"").
    

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers to frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm"").