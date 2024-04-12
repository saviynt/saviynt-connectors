### **Disclaimer**

The integration was either created by Saviynt or by Saviynt community users . The integration is available “as is” and fall under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar and Saviynt Connector Framework. 

**Note: Contributor** \- [Manju Kumari]("http://linkedin.com/in/manju-royal-ab4931258" ""http://linkedin.com/in/manju-royal-ab4931258"")

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
    
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=and%20kaseya%20vsa.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=and%20kaseya%20vsa.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=vsa%20for%20RPA.-,Introduction,-Kaseya%20VSA%20(Virtual" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=vsa%20for%20RPA.-,Introduction,-Kaseya%20VSA%20(Virtual"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=Connectors%20Documentation.-,Supported%20Features,-The%20kaseya%20vsa" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=Connectors%20Documentation.-,Supported%20Features,-The%20kaseya%20vsa"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
            
*   [Understanding the Integration between EIC and]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0kaseya%20vsa,-You%20must%20create" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0kaseya%20vsa,-You%20must%20create"") kaseya vsa
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=kaseya%20vsa%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=kaseya%20vsa%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Setting Up the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-Prerequisites" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-Prerequisites"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=Up%20the%20Integration-,Prerequisites,-Authentication%20to%20kaseya" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=Up%20the%20Integration-,Prerequisites,-Authentication%20to%20kaseya"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=the%20generated%20token.-,Creating%20a%20Connection,-Connection%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=the%20generated%20token.-,Creating%20a%20Connection,-Connection%20refers%20to"")
            
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=the%C2%A0Connection%20Package-,Importing%20Connection%20Package,-connection%20package%20helps" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=the%C2%A0Connection%20Package-,Importing%20Connection%20Package,-connection%20package%20helps"")
            
        *   [Creating a Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=vsa%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=vsa%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system"")
            
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to"")
            
*   [Using the kaseya vsa Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=Creating%20Endpoints.-,Using%20the%20kaseya%20vsa%20Integration,-You%20can%20use" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=Creating%20Endpoints.-,Using%20the%20kaseya%20vsa%20Integration,-You%20can%20use"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-You%20must%20apply"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=JSON%20for%20provisioning.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/community-sourced-integrations/kaseya-vsa-integration-guide/ta-p/52717#:~:text=JSON%20for%20provisioning.-,Troubleshooting,-To%20troubleshoot%20common"")
    

### Preface

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and kaseya vsa.

### Audience

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with kaseya vsa for RPA.

### **Introduction**

**Kaseya VSA** (Virtual System Administrator) is a remote monitoring and management (RMM) software platform designed for IT service providers and managed service providers (MSPs). It allows IT professionals to remotely monitor and manage a wide range of IT systems, including servers, workstations, and network devices. 

Here are some key features and aspects of Kaseya VSA as of 2021:

1.  **Remote Monitoring and Management:** Kaseya VSA allowed IT professionals to remotely monitor and manage servers, workstations, and other network devices. This included tasks like software patch management, software deployment, and remote control.
    
2.  **Automation:** It offered automation capabilities to streamline IT tasks and workflows. This could include scripting and policy-based automation to perform routine tasks automatically.
    
3.  **Patch Management:** The platform provided patch management features to keep software and systems up-to-date with the latest security patches and updates.
    
4.  **Security:** Kaseya VSA included security features to help IT professionals protect their clients' networks and systems, including antivirus management and endpoint security.
    
5.  **Inventory Management:** It allowed users to keep track of hardware and software assets within their network, helping with asset management and planning.
    
6.  **Reporting and Analytics:** The platform offered reporting and analytics tools to help MSPs and IT administrators gain insights into their network performance, security, and compliance.
    
7.  **Ticketing and Helpdesk:** Kaseya VSA often integrated with helpdesk and ticketing systems, enabling IT professionals to efficiently manage and respond to support requests.
    
8.  **Multi-Tenant Support:** MSPs could use Kaseya VSA to manage multiple client environments from a single dashboard, making it a valuable tool for IT service providers serving multiple clients.
    

For more information about different connectors in EIC, see [Connectors Documentation]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

Supported Features
------------------

**The kaseya vsa integration supports the following features:**

Supported Software Versions
---------------------------

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and kaseya vsa
========================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and deprovisioning tasks. The following components are involved in the integration:

*   The Complete Service Management platform kaseya vsa combines ITSM with ESM and SIAM capabilities, enabling all internal departments, such as IT, HR, and Facilities, as well as external service providers and customers, to collaborate securely and seamlessly on one complete platform, reducing complexity and improving productivity.
    
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
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the kaseya vsa integration.
    

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with kaseya vsa for performing provisioning items in kaseya vsa Queue. The REST connection uses the REST protocol to communicate with the REST interface of kaseya vsa. 

The following diagram illustrates the integration architecture and communication with the target application.  

Setting Up the Integration
--------------------------

**Prerequisites**

Authentication to kaseya vsa is through an Access Token please follow below steps.

1.  In VSA, Navigate to  **System > User Security > Users > User > Access Tokens.**  
    **Important Note:** Make sure you choose the user who is integrated with IT Glue and not the user who is logged into VSA.
    
2.  Click **New** and create a token for your account.
    

1.  In the Scopes Assigned section, from the two options at the bottom, click to select **REST API (Read, Write)**.  
    **Data Warehouse API:** This option will let you execute API calls to data warehouses endpoints using the generated token. This is not applicable to IT Glue-VSA integration.  
    **REST API:** This option will let you have access to the REST APIs using the generated token.
    

1.  **Note**: IP whitelist does apply to PAT. You need to include the IP that the integration comes from, or leave it empty to allow access from any IP.
    
2.  Click **Save**.
    
3.  Copy the generated token.
    

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

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/75/1/Kaseya_vsa.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/75/1/Kaseya_vsa.zip"")

### Provisioning Parameters for Creating Queue and Fetching Queue Status

To create Queue in kaseya vsa, poll and fetch the status of Queue when WSRETRY job is run, specify the below mentioned parameters. 

**Parameter**

**Description**

CREATETICKETJSON

Specify this parameter to create Queue in kaseya vsa.

When you run the WSRETRY job using the CREATETICKETJSON parameter, it creates Queue in kaseya vsa. The possible status of Queue in kaseya vsaare: Open, Closed, or Pending. The ticket remains in Open status in kaseya vsa it is automatically or manually completed in kaseya vsa.

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/75/1/Kaseya_vsa.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/75/1/Kaseya_vsa.zip"")

Ticket Status JSON

Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/75/1/Kaseya_vsa.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/75/1/Kaseya_vsa.zip"")

### Importing Connection Package

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out of the box connection templates available. Here are the steps to import the kaseya vsa connection package.

*   Download the [connection package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/75/1/Kaseya_vsa.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-community-integration/75/1/Kaseya_vsa.zip"").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “kaseya vsa ” Connection.
    
*   Edit the connection with your kaseya vsa tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Using the kaseya vsa Integration
================================

You can use the kaseya vsa integration for performing import and provisioning operations after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

You must apply the following guidelines for configuring import: 

*   Run account import before running the access import.
    
*   Map all kaseya vsa attributes to EIC account attributes using **ImportAccountEntJSON**.
    

You must apply the following guidelines for configuring provisioning:

*   Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.
    

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers for frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm"").

**Note:** Ensure that you record the token expiry duration during the initial token generation. The connection may fail, if the token is not refreshed.