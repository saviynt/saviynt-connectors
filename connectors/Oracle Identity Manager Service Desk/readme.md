### **Disclaimer**

The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework. 

*   [Preface]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Troubleshooting-,Preface,-This%20guide%20describes"")
    
*   [Audience]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Oracle%20Identity%20Manager.-,Audience,-This%20guide%20is" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Oracle%20Identity%20Manager.-,Audience,-This%20guide%20is"")
    
*   [Introduction]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=v4.5%20and%20later-,Introduction,-Oracle%20Identity%20Manager" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=v4.5%20and%20later-,Introduction,-Oracle%20Identity%20Manager"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Oracle%20Identity%20Manager.-,Supported%20Features,-The%20Oracle%20Identity" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Oracle%20Identity%20Manager.-,Supported%20Features,-The%20Oracle%20Identity"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software"")
            
    *   [Integration Architecture]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Cloud%20Connectors.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Cloud%20Connectors.-,Integration%20Architecture,-EIC%C2%A0uses%20a"")
        
    *   [Setting Up the Integration]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-Prerequisites" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-Prerequisites"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Up%20the%20Integration-,Prerequisites,-To%20establish%20a" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Up%20the%20Integration-,Prerequisites,-To%20establish%20a"")
            
    *   [Creating a connection]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Creating%20a%20Connection" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Creating%20a%20Connection"")
        *   [Connection parameters]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Connection%20Parameters" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Connection%20Parameters"")
        *   [Procedure to create a ticket]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=the%C2%A0Connection%20Package-,Procedure%20to%20create%20a%20ticket,-The%20following%20steps" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=the%C2%A0Connection%20Package-,Procedure%20to%20create%20a%20ticket,-The%20following%20steps"")
            
        *   [Importing Connection Package]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=EIC%20are%20completed.-,Importing%20Connection%20Package,-connection%20package%20helps" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=EIC%20are%20completed.-,Importing%20Connection%20Package,-connection%20package%20helps"")
            
        *   [Creating a Security System]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Manager%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Manager%20tenant%20details.-,Creating%20a%20Security%20System,-The%20security%20system"")
            
        *   [Creating an Endpoint for the Security System]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Security%20System.-,Creating%20an%20Endpoint%20for%20the%20Security%20System,-Endpoint%20refers%20to"")
            
*   [Troubleshooting]("https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Creating%20Endpoints.-,Troubleshooting,-To%20troubleshoot%20common" ""https://forums.saviynt.com/t5/integration-drafts/oracle-identity-manager-service-desk-integration-guide/ta-p/40332#:~:text=Creating%20Endpoints.-,Troubleshooting,-To%20troubleshoot%20common"")
    

### Preface

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Oracle Identity Manager.

### Audience

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with Oracle Identity Manager.

 **Introduction**

Oracle Identity Manager (OIM) is a comprehensive identity management solution provided by Oracle Corporation. It is designed to simplify and automate the management of user identities, access rights, and security policies within an organization. OIM helps organizations enhance their security, streamline administrative processes, and comply with regulatory requirements.

The primary goal of Oracle Identity Manager is to ensure that the right people have the right level of access to the right resources at the right time. It provides a centralized platform for managing user identities, roles, and entitlements across various enterprise systems, applications, and services.

For more information about different connectors in EIC, see  [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

Supported Features
------------------

**The Oracle Identity Manager integration supports the following features:**

Supported Software Versions
---------------------------

**Software**

**Version**

EIC

Release v4.5 and later

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Oracle Identity Manager for performing provisioning items in Oracle Identity Manager Queue. The REST connection uses the REST protocol to communicate with the REST interface of Oracle Identity Manager. 

The following diagram illustrates the integration architecture and communication with the target application.  

Setting Up the Integration
--------------------------

**Prerequisites**

To establish a connection with Oracle Identity Manager (OIM), there are several prerequisites that need to be in place. These prerequisites include:

1.  Oracle Identity Manager Installation: Ensure that Oracle Identity Manager is properly installed and configured in your environment. Follow the installation and configuration documentation provided by Oracle to set up OIM correctly.
    
2.  Database Configuration: Oracle Identity Manager requires a supported database for storing its configuration data. Ensure that the appropriate database is installed and configured as per the requirements specified by Oracle. OIM typically supports databases like Oracle Database, Microsoft SQL Server, or IBM DB2.
    
3.  System Requirements: Review the system requirements provided by Oracle to ensure that your environment meets the necessary hardware, software, and network prerequisites for running Oracle Identity Manager. This includes aspects such as operating system version, CPU, memory, disk space, and network connectivity.
    
4.  Oracle WebLogic Server: Oracle Identity Manager is typically deployed on Oracle WebLogic Server, which serves as the application server. Ensure that you have a supported version of WebLogic Server installed and configured properly.
    
5.  User and Roles: Ensure that you have the necessary administrative access to Oracle Identity Manager. You will need appropriate user credentials with administrative privileges to connect to and manage OIM.
    
6.  Network Connectivity: Ensure that the network connectivity between the client machine and the Oracle Identity Manager server is established. This includes verifying that firewalls, proxies, or any other network infrastructure components are properly configured to allow communication between the client and the OIM server.
    
7.  Credentials and URLs: Collect the required connection information such as the URL for accessing the Oracle Identity Manager console, database connection details, and any other relevant credentials or URLs needed to establish a connection to OIM.
    

For more details please check the [Oracle Identity Manager documentation]("https://docs.oracle.com/en/middleware/idm/identity-governance/12.2.1.3/oimss/quick-start.html" ""https://docs.oracle.com/en/middleware/idm/identity-governance/12.2.1.3/oimss/quick-start.html"")

**Note:** One connection of Oracle Identity Manager can be used to onboard multiple applications.

Creating a Connection
---------------------

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see [Creating Connections]("https://saviynt.freshdesk.com/support/solutions/articles/43000431233-creating-connections" ""https://saviynt.freshdesk.com/support/solutions/articles/43000431233-creating-connections"").

### Connection Parameters

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

The SAV role is an EIC Role used to give specific access to a User. For example, if ROLE\_User is selected then the user(s) assigned the ROLE\_User are given access to this connection. 

Connection JSON

Specify this parameter to establish a REST connection with Oracle Identity Manager application.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/35/1/OIM_TicketingSystem.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/35/1/OIM_TicketingSystem.zip"") 

### Provisioning Parameters for Creating Queue and Fetching Queue Status

To create Queue in Oracle Identity Manager, poll and fetch the status of Queue when the WSRETRY job is run, specify the below-mentioned parameters. 

CREATETICKETJSON

Specify this parameter to create Queue in Oracle Identity Manager.

When you run the WSRETRY job using the CREATETICKETJSON parameter, it creates Queue in Oracle Identity Manager. The possible status of Queue in Oracle Identity Manager are Open, Request Completed, or Pending. The ticket remains in Open status in Oracle Identity Manager it is automatically or manually completed in Oracle Identity Manager.

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/35/1/OIM_TicketingSystem.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/35/1/OIM_TicketingSystem.zip"") 

Ticket Status JSON

*   Refer to the [Connection Package]("https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/35/1/OIM_TicketingSystem.zip" ""https://forums.saviynt.com/wtgqs47532/attachments/wtgqs47532/se-wip/35/1/OIM_TicketingSystem.zip"") 

### Procedure to create a ticket

The following steps provide the entire workflow of how a request is created and closed in EIC after the ticket is closed in Oracle Identity Manager.

1.  Log in to EIC.
    
2.  Go to ARS and submit the type of request (create an account, remove an account, or add access, remove access).
    
3.  Approve the request in EIC.
    
4.  Define the service desk connection with the connection you created for this integration purpose.
    
5.  Run the WSRETRY job. The item is added to a queue in Oracle Identity Manager using the CreateTicket JSON.
    
6.  The admin logs in to the Oracle Identity Manager RPA system and checks the open Queue.
    
7.  Based on the managed application to which the task is created, the admin completes the request in that application and closes the Item from the Queue in Oracle Identity Manager. 
    
8.  The tasks in EIC are completed.
    

### Importing Connection Package

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out-of-the-box connection templates available. Here are the steps to import the Oracle Identity Manager connection package.

*   Download the connection package.
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “Oracle Identity Manager” Connection.
    
*   Edit the connection with your Oracle Identity Manager tenant details.
    

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Security-System&pubname=EIC-Admin-v2022x"")**.**

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see [Creating Endpoints]("https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-Endpoints&pubname=EIC-Admin-v2022x"").

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Common-Troubleshooting-Guide-for-Connectors&pubname=Common-Troubleshooting-v2022x"").

To troubleshoot common problems or obtain answers to frequently asked questions for REST connectors, see the [REST Connector Guide]("https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm" ""https://docs.saviyntcloud.com/bundle/REST-v2020x/page/Content/Appendix.htm"").