**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connector support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework. 

*   [Preface]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Troubleshooting-,Preface,-This%20guide%20describes")
*   [Audience]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=EIC)%20and%20OTRS.-,Audience,-This%20guide%20is")
*   [Introduction]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=service%20with%20OTRS.-,Introduction,-OTRS%C2%A0(originally%C2%A0Open")

*   [Supported Features]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20OTRS%20integration")
*   [Supported Software Versions]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Yes-,Supported%20Software%20Versions,-Software")

*   [Understanding the Integration between EIC and OTRS]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=X%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0OTRS,-You%20must%20create")

*   [Integration Architecture]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=the%20OTRS%20integration.-,Integration%20Architecture,-EIC%C2%A0uses%20a")

*   [Setting Up the Integration]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=the%20target%20application.-,Setting%20Up%20the%20Integration,-Prerequisites")

*   [Prerequisites]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Up%20the%20Integration-,Prerequisites,-Generate%20%26%20set%20up") 

*   [Creating a Connection]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=ID%2C%20and%20password.-,Creating%20a%20Connection,-Connection%20refers%20to")
*   [Understanding the Configuration Parameters]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=a%20Connection.-,Understanding%20the%20Configuration%20Parameters,-While%20creating%20a")

*   [Configuration Parameter for Establishing Connection]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Configuration%20Parameters%20for%20Establishing%20Connection")
*   [Configuration Parameter for Ticket Creation]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=%C2%A0Yes-,Configuration%20Parameter%20for%20Ticket%20Creation,-Parameter")
*   [Configuration Parameter for Get Ticket Status]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Configuration%20Parameter%20for%20Get%20Ticket%20Status%C2%A0")

*   [Importing Connection Package]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Yes-,Importing%20Connection%20Package,-connection%20package%20helps")
*   [Configuring Ticket Creation and Get Ticket Status]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Configuring%20Ticket%20Creation%20and%20Get%20Ticket%20Status")
*   [Procedure]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=through%20the%20connector.-,Procedure,-The%20following%20steps")
*   [Troubleshooting]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=EIC%20are%20completed.-,Troubleshooting,-To%20troubleshoot%20common")

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and OTRS.

Audience
========

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with OTRS.

 Introduction
=============

**OTRS** (originally Open-Source Ticket Request System) is a service management suite. The suite contains an agent portal, admin dashboard, and customer portal. In the **“agent portal”**, teams process tickets and requests from customers (internal or external), and the **“admin dashboard”**, allows system administrators to manage the system. The **“customer portal”** is much like a customizable webpage where information can be shared with customers and requests can be tracked on the customer side.

The **REST** **API**\-based **OTRS** connector enables you to seamlessly integrate with OTRS ServiceDesk to manage the third-party application for which you want to create Tickets in OTRS when a task is created in EIC. You can use EIC for requests such as creating an account, adding access, removing access, and so on. 

From EIC, when a user requests access to a third-party application, using the **CreateTicketJSON**, EIC creates a ticket for the third-party application access in the OTRS system with ‘Open’ status.

The OTRS admin checks the open tickets and performs the closure action to complete the request in the respective third-party applications. Using the **TicketStatusJSON**, EIC polls the OTRS for status such as 'Closed', 'Open', or 'Pending'. Once the status is 'Closed' in OTRS, it fetches the status and updates the status of the Task to 'Completed' in EIC too.

For more information about different connectors in EIC, see  [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the OTRS REST connector using REST API for performing operations listed in the Supported Features.

 **Supported Features**
-----------------------

The OTRS integration supports the following features:

**Connector Fields**

**Features**

**Mandatory**

ConnectionJSON

Supports for creating the session with OTRS

Yes

CreateTicketJSON

Support for creating a new ticket for third-party application in OTRS system

Yes

TicketStatusJSON

Support for updating/closing existing ticket status in OTRS system

Yes

### **Supported Software Versions**

**Software**

**Version**

EIC

Release v22.X and later

 Understanding the Integration between EIC and OTRS
===================================================

You must create an integration between EIC and the OTRS for managing the third-party target application access to perform ticket creation and ticket update tasks. The following components are involved in the integration:

*      The OTRS ServiceDesk, a third-party application for access requests, and EIC platform using which you can request for the third-party application which is managed by OTRS.
    
*     The **Security System** represents the connection between EIC and the target application.
    

1.  It comprises an endpoint, which is the target application for which you want EIC to manage the identity repository.
    
2.    It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see [Creating a Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v2022x/page/Content/Chapter02-Identity-Repository/Creating-a-Security-System.htm"").
    

*   **Endpoint** is an instance of an application within the context of a security system.
    

1.    It is the target application or application from which the connector imports the data and performs provisioning or deprovisioning of identity objects, such as users, accounts, and entitlements.
    
2.  It is mandatory to create an endpoint after creating the security system.
    
3.  You can associate a single security system with multiple endpoints if the deployment involves modeling of multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see [Creating an Endpoint for the Security System]("https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Admin-v23x/page/Content/Chapter02-Identity-Repository/Creating-Endpoints.htm"").
    

*   **Connector** is a software component that enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing, provisioning accounts, and access through the SCIM APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").
    
*   **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import or provisioning operations from EIC.  
    When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the **Instant Provisioning Tasks** global configuration. For more information about the jobs used by the connectors in the OTRS integration.
    

 Integration Architecture
-------------------------

EIC uses a **REST** connection for integrating with OTRS for creating the session, importing the ticket data and performing create/update ticket tasks into the OTRS ServiceDesk. 

The following diagram illustrates the integration architecture and communication with the target application.

**Setting Up the Integration**

**Prerequisites**
-----------------

Generate & set up token authentication.

*   Use your client ID and authentication credentials to obtain an access token using
    

[https://<HOSTNAME>/otrs/nph-genericinterface.pl/Webservice/SaviyntTicketConnector/SessionCreate?UserLogin=<USER> &Password=<PASSWORD>]("https://hostname/otrs/nph-genericinterface.pl/Webservice/SaviyntTicketConnector/SessionCreate?UserLogin=%3cUSER%3e%20&Password=%3cPASSWORD%3e" ""https://hostname/otrs/nph-genericinterface.pl/Webservice/SaviyntTicketConnector/SessionCreate?UserLogin=%3cUSER%3e%20&Password=%3cPASSWORD%3e"")

*   Once you have obtained the token you do not need to use the authentication credentials and access token in
    

**ConnectionJSON**.

*   You can now authorize requests using the access token, user ID, and password.  
    

###  **Creating a Connection**

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").

####  **Understanding the Configuration Parameters**

While creating a connection, you must specify connection parameters that the connector uses to connect with the target application, define the type of operations to perform, the target application objects against which those operations are performed, and the frequency of performing them. In addition, you can view and edit attribute mappings between EIC and the target application, predefined correlation rules, and provision jobs and import jobs.

#### **Configuration Parameters for Ticket Creation and Get Ticket status**

The connector uses the following parameters for establishing a connection and for creating/updating a ticket for third-party application access from the Saviynt application:

###### **Configuration Parameters for Establishing Connection**

**Parameter**

**Description**

**Example Configuration**

**Mandatory?**

Connection Name 

Specify the name to identify the connection.

*   OTRS ServiceDesk
    

Yes

Connection Description

Specify the description for the connection.

\-

No

Connection Type

·        Select the connection type as (REST)”

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

**Note:** Update TOKEN as per your OTRS details.

Use the following format to connect to the OTRS application:

Refer to the [Connection Package]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Add%20tags-,OTRS.zip,-0%20KUDOS" ""https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Add%20tags-,OTRS.zip,-0%20KUDOS"")

 Yes

###### **Configuration Parameter for Ticket Creation**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatrory**

CreateTicketJSON

Specify this parameter to create ticket in the OTRS for third-party access request

Use the following format to create a ticket into the OTRS application:

Refer to the [Connection Package]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Add%20tags-,OTRS.zip,-0%20KUDOS" ""https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Add%20tags-,OTRS.zip,-0%20KUDOS"")

Yes

######  **Configuration Parameter for Get Ticket Status** 

**Parameter**

**Description**

**Recommended Configuration**

**Mandatrory**

TicketStatusJSON

Specify this parameter to reconcile the ticket status

Use the following format to update an existing ticket into the OTRS application:

Refer to the [Connection Package]("https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Add%20tags-,OTRS.zip,-0%20KUDOS" ""https://forums.saviynt.com/t5/integration-drafts/otrs-as-a-ticketing-system/ta-p/54435#:~:text=Add%20tags-,OTRS.zip,-0%20KUDOS"")

Yes

### Importing Connection Package

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out of the box connection templates available. Here are the steps to import the OTRS connection package.

*   Download the [connection package]("https://saviynt.freshdesk.com/helpdesk/attachments/152013309863" ""https://saviynt.freshdesk.com/helpdesk/attachments/152013309863"").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “OTRS ” Connection.
    
*   Edit the connection with your OTRS tenant details.
    

Configuring Ticket Creation and Get Ticket Status
-------------------------------------------------

Ticket creation and updating are automatically enabled when a connection is configured. For detailed information about performing provisioning tasks, see [Access Request System]("https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x"").provisioning tasks, see [Access Request System]("https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=ars-mang-ur-accs&pubname=EIC-User-v2022x"").

**To create a ticket for the target application:**

1.  Specify the connection and provisioning parameters. For more information, see Configuration Parameters for Ticket Create and Ticket Update  
    **Note:** Ensure that the connection type is selected as **REST**.
    
2.  Configure the **Provisioning** job **(WSRETRY)**. For more information, see [Provisioning Jobs]("https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Job-Categories-for-Flat-Job-Control-Panel&pubname=EIC-Admin-v2022x"").
    

When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the connector.

 **Procedure**

1.  The following steps provide the entire workflow of how a request is created and closed in EIC after the ticket is closed in OTRS.
    
2.  Log in to EIC.
    
3.  Go to ARS and submit the type of request (create account, remove account, or add access, remove access).
    
4.  Approve the request in EIC.
    
5.  Run the WSRETRY job. The ticket is created in OTRS using the CreateTicket JSON.
    
6.  The admin logs in to the OTRS Ticketing system and checks the open tickets.
    
7.  Based on the OTRS managed application to which the access is requested, the admin completes the request in that application and closes the ticket in OTRS.
    
8.  The connector polls OTRS using the TicketStatus JSON to check the status of the ticket.
    
9.  When the ticket is closed, the connector obtains the status of the ticket and updates it in EIC.
    
10.  The tasks in EIC are completed.

Troubleshooting
===============

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see [Common Troubleshooting Guide for Connectors]("https://saviynt.freshdesk.com/support/solutions/articles/43000633382-common-troubleshooting-guide-for-connectors" ""https://saviynt.freshdesk.com/support/solutions/articles/43000633382-common-troubleshooting-guide-for-connectors"").

To troubleshoot common problems or obtain answers for frequently asked questions for REST connectors, see the  [REST Connector guide]("https://saviynt.freshdesk.com/en/support/solutions/articles/43000521736-rest-connector-guide" ""https://saviynt.freshdesk.com/en/support/solutions/articles/43000521736-rest-connector-guide"").

**Note:** Ensure that you record the token expiry duration during the initial token generation. The connection may fail, if the token is not refreshed.