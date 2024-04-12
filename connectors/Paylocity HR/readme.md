**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework.

*   [Preface]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
*   [Audience]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=EIC)%20and%20Paylocity.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=EIC)%20and%20Paylocity.-,Audience,-This%20guide%20is"")
*   [Introduction]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=users%20from%20Paylocity.-,Introduction,-Paylocity%20provides%20cloud" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=users%20from%20Paylocity.-,Introduction,-Paylocity%20provides%20cloud"")
    *   [Supported Features]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Paylocity%20integration" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Paylocity%20integration"")
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=or%20Remove%20Access-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=or%20Remove%20Access-,Supported%20Software%20Versions,-Software"")
*   [Understanding the Integration between EIC and Paylocity]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Paylocity,-You%20must%20create" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Paylocity,-You%20must%20create"")
    *   [Integration Architecture]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=the%20Paylocity%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=the%20Paylocity%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
    *   [Configuring a Connection]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=Paylocity%20Integration%20Architecture-,Configuring%20a%20Connection,-Prerequisites" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=Paylocity%20Integration%20Architecture-,Configuring%20a%20Connection,-Prerequisites"")
        *   [Prerequisites]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=Configuring%20a%20Connection-,Prerequisites,-Paylocity%20will%20provide" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=Configuring%20a%20Connection-,Prerequisites,-Paylocity%20will%20provide"")
        *   [Creating a Connection]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=this%20link.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=this%20link.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            *   [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=a%20Connection.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=a%20Connection.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a"")
            *   [Configuration Parameters for User Import]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=the%20target%20application.-,Configuration%20Parameters%20for%20User%20Import,-The%20connector%20uses" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=the%20target%20application.-,Configuration%20Parameters%20for%20User%20Import,-The%20connector%20uses"")
                *   [Connection Parameters]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=the%20target%20application%3A-,Connection%C2%A0Parameters,-Parameter"")
                *   [Import and Provisioning Parameters]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=Yes-,Import%20and%20provisioning%20Parameters,-Parameter" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=Yes-,Import%20and%20provisioning%20Parameters,-Parameter"")
*   [Using the Paylocity Integration]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=Yes-,Using%20the%20Paylocity%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=Yes-,Using%20the%20Paylocity%20Integration,-You%20can%20use"")
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import"")
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=UserImport%20JSON.-,Configuring%20Import%20Operations,-Full%20User%20import" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=UserImport%20JSON.-,Configuring%20Import%20Operations,-Full%20User%20import"")
*   [Troubleshooting]("https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=Data%20Jobs.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/integration-drafts/paylocity-hr-integration-guide/ta-p/37055#:~:text=Data%20Jobs.-,Troubleshooting,-To%20troubleshoot%20common"")

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Paylocity.

Audience
========

This guide is intended for administrators and target system integration teams responsible for integrating and importing users from Paylocity.

Introduction
============

**Paylocity** provides cloud-based payroll and human capital management (HCM) software solutions for businesses of all sizes. Their software platform is designed to streamline and automate various aspects of HR and payroll processes, helping organizations manage their workforce more efficiently.

The **REST** connector enables you to create an integration with Paylocity for importing users to Saviynt EIC as an HR Identity source. For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the Paylocity (REST-based) connector for performing operations listed in the Supported Features.

Supported Features
------------------

The Paylocity integration supports the following features:

**Full Import****Incremental Import****Update user****Add or Remove Access**  

### **Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Paylocity
=======================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import tasks. The following components are involved in the integration:

*   **Paylocity** is the target application that is integrated with the EIC through the REST connector to import the users.
    
*   The REST connector enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing users through the REST APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import operations from EIC. For more information about the jobs used by the connector in the Paylocity integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Paylocity for importing users. The REST connection uses the REST protocol to communicate with the REST interface of Paylocity. 

The following diagram illustrates the connector architecture and communication with the target application.

Figure: Paylocity Integration Architecture

Configuring a Connection
------------------------

### **Prerequisites**

Paylocity will provide the secure client credentials and set up the scope (type of requests and allowed company numbers). You will receive the unique client id, secret, and Paylocity public key for the data encryption. The secret will expire in 365 days.

*   Paylocity will send you an e-mail 10 days prior to the expiration date for the current secret. If not renewed, the second e-mail notification will be sent 5 days prior to the secret's expiration. Each email will contain the code necessary to renew the client secret.
    
*   You can obtain the new secret by calling the API endpoint using your current not yet expired credentials and the code that was sent with the notification email. For details on the API endpoint, please see the Client Credentials section.
    
*   Both the current secret value and the new secret value will be recognized during the transition period. After the current secret expires, you must use the new secret.
    
*   If you were unable to renew the secret via the API endpoint, you can still contact Service and they will email you a new secret via secure email.
    

*   For more information check this [link]("https://prod.cdn.paylocity.com/developer/index.html#section/Overview" ""https://prod.cdn.paylocity.com/developer/index.html#section/Overview"").
    

### **Creating a Connection**

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").

#### **Understanding the Configuration Parameters**

While creating a connection, you must specify connection parameters that the connector uses to connect with the target application, define the type of operations to perform, the target application objects against which those operations are performed, and the frequency of performing them. In addition, you can view and edit attribute mappings between EIC and the target application.

#### **Configuration Parameters for User Import**

The connector uses the following parameters for creating a connection and for importing users from the target application:

#### **Connection Parameters**

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

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/29/1/Paylocity.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/29/1/Paylocity.zip"") 

Yes

#### **Import and provisioning Parameters**

**Parameter**

**Description**

  
  

**Recommended Configuration**

**Mandatory?**

UserImport JSON

Specify this parameter to import the users.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/29/1/Paylocity.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/29/1/Paylocity.zip"") 

Yes

UpdateUserJSON

Specify this parameter to update the users.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/29/1/Paylocity.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/29/1/Paylocity.zip"") 

Yes

Using the Paylocity Integration
===============================

You can use the Paylocity integration for performing user import after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

To configure import, map all Paylocity attributes to EIC user attributes using **UserImport JSON**.

Configuring Import Operations
-----------------------------

**Full User import:** When configuring the connection for the first time, first perform the full import to import all existing Users from the target application to EIC. To perform the full import, the invoke API gets the response from the target application and maps the attributes in the target application with attributes in EIC.

The import jobs are automatically created in EIC after you create a connection for the Paylocity integration.

**To import users:** 

1.  Specify the connection and import parameters.  
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **User Import via a Connection (UserImportJob)** to import users. For more information about creating jobs, see [Data Jobs]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter10-Job-Control-Panel/Job-Categories-for-Flat-Job-Control-Panel.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter10-Job-Control-Panel/Job-Categories-for-Flat-Job-Control-Panel.htm"").
    

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers to frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm"").