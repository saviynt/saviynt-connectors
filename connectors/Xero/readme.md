**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework. 

**Note: Contributor** \- [Vedanth B.K]("https://www.linkedin.com/in/vedanthbk" ""https://www.linkedin.com/in/vedanthbk"")

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
    
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=EIC)%20and%20Xero.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=EIC)%20and%20Xero.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=users%20from%20Xeros.-,Introduction,-Xero%20is%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=users%20from%20Xeros.-,Introduction,-Xero%20is%20a"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Xero%20integration" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Xero%20integration"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
            
*   [Understanding the Integration between EIC and]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Xero,-You%20must%20create" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Xero,-You%20must%20create"") Xero
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=the%20Xero%20integration%2C-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=the%20Xero%20integration%2C-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Configuring a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=Xero%20Integration%20Architecture-,Configuring%20a%20Connection,-Prerequisites" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=Xero%20Integration%20Architecture-,Configuring%20a%20Connection,-Prerequisites"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=Configuring%20a%20Connection-,Prerequisites,-After%20a%20user" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=Configuring%20a%20Connection-,Prerequisites,-After%20a%20user"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=Importing%20Connection%20Package" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=Importing%20Connection%20Package"")
            
*   [Using the Xero Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=Xero%20tenant%20details.-,Using%20the%20Xero%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=Xero%20tenant%20details.-,Using%20the%20Xero%20Integration,-You%20can%20use"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import"")
        
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=Configuring%20Provisioning" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=Configuring%20Provisioning"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/community-sourced-integrations/xero-integration-guide/ta-p/43417#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common"")
    

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Xero.

Audience
========

This guide is intended for administrators and target system integration teams responsible for integrating and importing users from Xeros.

Introduction
============

Xero is a cloud-based accounting software platform designed for small and medium-sized businesses. It provides a range of financial tools and features to help businesses manage their accounting, bookkeeping, and financial processes more efficiently. Here are some key functions and features of Xero:

1.  Bookkeeping and Accounting: Xero allows businesses to track and reconcile their income and expenses, manage invoices and bills, and generate financial reports such as balance sheets and profit and loss statements.
    
2.  Bank Reconciliation: The platform integrates with banks and financial institutions, enabling automatic bank feeds that help reconcile transactions quickly and accurately.
    
3.  Invoicing and Payments: Xero enables businesses to create and send professional invoices to clients, track payment statuses, and accept online payments.
    
4.  Expense Management: Users can capture and categorize business expenses, track receipts, and manage expense claims.
    
5.  Payroll: Xero offers payroll functionality, allowing businesses to manage employee details, calculate wages, and automate tax filings.
    

For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the Xero (REST-based) connector for performing operations listed in the Supported Features.

Supported Features
------------------

The Xero integration supports the following features:

**Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Xero
==================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import tasks. The following components are involved in the integration:

**·**        **Connector** is a software component that enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing users through the REST APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").

**·**        **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import operations from EIC. For more information about the jobs used by the connector in the Xero integration,

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Xero for importing users. The REST connection uses the REST protocol to communicate with the REST interface of Xero. 

The following diagram illustrates the connector architecture and communication with the target application.   
  

Figure: Xero Integration Architecture

Configuring a Connection
------------------------

### **Prerequisites**

After a user has successfully authenticated on Xero, they will be redirected back to your application, this is a perfect time to map a user’s chart of accounts. You are free to lay out your configuration screen in a way that makes sense for your application, here are a few dos and don’ts.

*   Don’t display a text field and ask the user to type in account codes. This is both error-prone and a bit annoying for the customer.
    
*   Do use drop-down controls populated with the user's chart of accounts available from the accounts endpoint.
    
*   Do set defaults for users – for example: if you are mapping sales revenue,  check to see if a “Sales” account exists and make it the default selection.
    
*   Do offer to create new accounts unique for your application. If no relevant chart of accounts exists, you can prompt the user to create it in Xero for them.
    
*   Don’t just create new accounts and not allow the user to choose.
    
*   Do filter and show appropriate account types. For example, if the mapping requires a revenue account, only show those types of accounts.
    

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

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/61/1/Xero.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/61/1/Xero.zip"") 

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatory?**

UserImport JSON

Specify this parameter to import the users.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/61/1/Xero.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/61/1/Xero.zip"") 

Yes

##### **Configuration Parameter for Provisioning**

**Parameter**

**Description**

**Recommended Configuration**

**Support for Binding Variables?**

**Support for Java Ternary Operations?**

UpdateUserJSON

Specify this parameter to Update a user in the target application.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/61/1/Xero.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/61/1/Xero.zip"") 

The bindings supported are:

*   user
    
*   response
    
*   userAccount
    
*   userManager
    
*   connection
    
*   account
    
*   arsTasks
    

Yes

### Importing Connection Package

The connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out-of-the-box connection templates available. Here are the steps to import the Xero connection package.

*   [Download the connection package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/61/1/Xero.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/61/1/Xero.zip"").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “Xero” Connection.
    
*   Edit the connection with your Xero tenant details.
    

Using the Xero Integration
==========================

You can use the Xero integration for performing user import after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

To configure import, map all Xero attributes to EIC user attributes using **UserImport JSON**.

Configuring Import Operations
-----------------------------

**Full User import:** When configuring the connection for the first time, first perform full import to import all existing Users from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC.

The import jobs are automatically created in EIC after you create a connection for the Xero integration.

**To import users:** 

1.  Specify the connection and import parameters. For more information, see [Configuration Parameters for User Import]("https://docs.saviyntcloud.com/bundle/TPAG-Guide-v23x/page/Content/Importing-Users-Using-the-User-Import-Job.htm" ""https://docs.saviyntcloud.com/bundle/TPAG-Guide-v23x/page/Content/Importing-Users-Using-the-User-Import-Job.htm"").  
    **Note:** Ensure that the connection type is selected as **REST**.
    

1.  Configure the **User Import via a Connection (UserImportJob)** to import users. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").
    

Configuring Provisioning
------------------------

Provisioning is automatically enabled when a connection is configured. For detailed information about performing provisioning tasks, see [Access Request System]("https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x"").

**To provision objects to the target application:**

1.  Specify the connection and provisioning parameters.   
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **Provisioning** job **(WSRETRY)**. For more information, see [Provisioning Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").
    

When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the connector.

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers to frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2021x/page/Content/About-this-Guide.htm"").

**Note:** Ensure you record the token expiry duration during the initial token generation. The connection may fail if the token is not refreshed.