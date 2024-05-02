**Disclaimer**

The integration was either created by Saviynt or by Saviynt community users. The integration is available “as is” and falls under standard connectors support for REST, SOAP, JDBC, LDAP, PowerShell, Jar, and Saviynt Connector Framework.

**Note: Contributor** \- [Sai Srungaram]("https://linkedin.com/in/sai-srungaram" ""https://linkedin.com/in/sai-srungaram""), [Vedanth B.K]("https://www.linkedin.com/in/vedanthbk" ""https://www.linkedin.com/in/vedanthbk"")

*   [Preface]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=Troubleshooting-,Preface,-This%20guide%20describes" ""#"")
    
*   [Audience]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=EIC)%20and%20Freshteam.-,Audience,-This%20guide%20is" ""#"")
    
*   [Introduction]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=users%20from%20Freshteams.-,Introduction,-Freshteam%20is%20the" ""#"")
    
    *   [Supported Features]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=the%20Supported%20Features.-,Supported%20Features,-The%20Freshteam%20integration" ""#"")
        
        *   [Supported Software Versions]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=the%20following%C2%A0features%3A-,Supported%20Software%20Versions,-Software" ""#"")
            
*   [Understanding the Integration between EIC and Freshteam]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=v4.5%20and%20later-,Understanding%20the%20Integration%20between%20EIC%20and%C2%A0Freshteam,-You%20must%20create" ""#"")
    
    *   [Integration Architecture]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=the%20Freshteam%20integration%2C.-,Integration%20Architecture,-EIC%C2%A0uses%20a" ""#"")
        
    *   [Configuring a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=Freshteam%20Integration%20Architecture-,Configuring%20a%20Connection,-Prerequisites" ""#"")
        
        *   [Prerequisites]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=Configuring%20a%20Connection-,Prerequisites,-An%20Access%20token" ""#"")
            
        *   [Creating a Connection]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=the%20ConnectionJSON%20parameter.-,Creating%20a%20Connection,-Connection%20refers%20to" ""#"")
            
*   [Using the Freshteam Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=Freshteam%20tenant%20details.-,Using%20the%20Freshteam%20Integration,-You%20can%20use" ""#"")
    
    *   [Guidelines for Using the Integration]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=meet%20your%20requirements.-,Guidelines%20for%20Using%20the%20Integration,-To%20configure%20import" ""#"")
        
    *   [Configuring Import Operations]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=UserImport%20JSON.-,Configuring%20Import%20Operations,-Full%20User%20import" ""#"")
        
*   [Troubleshooting]("https://forums.saviynt.com/t5/community-sourced-integrations/freshteam-hr-integration-guide/ta-p/30904#:~:text=through%20the%20connector.-,Troubleshooting,-To%20troubleshoot%20common" ""#"")
    

Preface
=======

This guide describes the integration between Saviynt **Enterprise Identity Cloud (EIC)** and Freshteam.

Audience
========

This guide is intended for administrators and target system integration teams responsible for integrating and importing users from Freshteams.

Introduction
============

Freshteam is the smart HR software for growing businesses. With Freshteam, you can attract, hire and onboard new hires, offboard exiting employees, manage employee information, and time off - all in one place. The **REST** connector enables you to create an integration with Freshteam for importing users to Saviynt EIC as HR Identity source.

For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors]("https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm" ""https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm"").

**Note:** This guide provides information about using the Freshteam (REST-based) connector for performing operations listed in the Supported Features.

Supported Features
------------------

The Freshteam integration supports the following features:

### **Supported Software Versions**

**Software**

**Version**

EIC

Release v4.5 and later

Understanding the Integration between EIC and Freshteam
=======================================================

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import tasks. The following components are involved in the integration:

·        **Freshteam** is the trusted application that is integrated into the EIC through the connector to import the users.

·        **Connector** is a software component that enables the communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing users through the REST APIs. For more information about creating a connection, see [Creating a Connection]("https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x" ""https://docs.saviyntcloud.com/csh?topicname=Creating-a-Connection&pubname=EIC-Admin-v2022x"").

·        **Job Scheduler** is a software component that executes a job based on the configured schedule to perform import operations from EIC. For more information about the jobs used by the connector in the Freshteam integration,.

Integration Architecture
------------------------

EIC uses a **REST** connection for integrating with Freshteam for importing users. The REST connection uses the REST protocol to communicate with the REST interface of Freshteam. 

The following diagram illustrates the connector architecture and communication with the target application. 

Figure: Freshteam Integration Architecture

Configuring a Connection
------------------------

### **Prerequisites**

An Access token is used in the configuration parameters of the REST connector for importing data.

Perform the following steps to generate an access token for the Freshteam application:

1.  Login to your Freshteam account(admin).
    
2.  In the Profile drop-down list, select **API Key**.
    

3\. The token appears in a pop-up window. Copy the access token. You will use this token while creating a REST connection in the **ConnectionJSON** parameter.

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

Use the following format to connect to the Freshteam application:

{  
"authentications": {  
"userAuth": {  
"authType": "oauth2",  
"url": "@@HOST\_URL@@",  
"authError": \[  
"InvalidAuthenticationToken",  
"invalid\_token",  
"Invalid access token"  
\],  
"httpMethod": "POST",  
"httpContentType": "application/x-www-form-urlencoded",  
"errorPath": "error.code",  
"maxRefreshTryCount": 5,  
"tokenResponsePath": "access\_token",  
"tokenType": "Bearer",  
"accessToken": "@@API\_KEY",  
"retryFailureStatusCode": \[  
401,  
403  
\]  
}  
}  
}

Yes

###### **Import Parameters**

**Parameter**

**Description**

**Recommended Configuration**

**Mandatory?**

UserImport JSON

Specify this parameter to import the users.

Use the following format to import users using the Freshteam application:

{  
"connection": "userAuth",  
"url": "@@HOST\_URL@@/api/employees",  
"httpMethod": "GET",  
"httpHeaders": {  
"contentType": "application/json",  
"Authorization": "${access\_token}"  
},  
"colsToPropsMap": {  
"username": "employee\_id~#~char",  
"statuskey": "status~#~char",  
"lastname": "last\_name~#~char",  
"firstname": "first\_name~#~char",  
"middlename": "middle\_name~#~char",  
"customproperty2": "official\_email~#~char",  
"secondaryemail": "personal\_email~#~char",  
"employeeid": "employee\_id~#~char",  
"employeetype": "employee\_type~#~char",  
"title": "designation~#~char",  
"startdate": "joining\_date~#~char",  
"enddate": "termination\_date~#~char",  
"departmentnumber": "department\_id~#~char",  
"city": "address.city~#~char",  
"customproperty1": "id~#~char"  
},  
"userResponsePath": "",  
"pagination": {  
"nextUrl": {  
"nextUrlPath": "${headers?.toString().contains('link')?headers?.link?.replace('<', '')?.replace('>; rel=\\"next\\"','')?.trim():null}"  
}  
}  
}

Yes

##### **Configuration Parameter for Provisioning**

**Parameter**

**Description**

**Recommended Configuration**

**Support for Binding Variables?**

**Support for Java Ternary Operations?**

UpdateUserJSON

Specify this parameter to Update a user in the target application.

Use the following format to Update a User using the Freshteam application:

{  
"actions": {  
"Update Login": {  
"call": \[  
{  
"name": "Update Login",  
"connection": "userAuth",  
"url": "@@HOST\_URL@@/api/employees/${user.customproperty1}",  
"httpMethod": "PUT",  
"httpParams": "{\\"official\_email\\":\\"${user.email}\\"}",  
"httpHeaders": {  
"Authorization": "${access\_token}",  
"Accept": "application/json"  
},  
"httpContentType": "application/json",  
"successResponses": {  
"statusCode": 200  
}  
}  
\]  
}  
}  
}

**NOTE: To update the back user to the HR source, please create a security System and Endpoint and respective Update rule Policies for Freshteam and run the provisioning Job without any filter in place.**

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

The connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out-of-the-box connection templates available. Here are the steps to import the Freshteam connection package.

*   [Download the connection package]("https://saviynt.freshdesk.com/helpdesk/attachments/152012383159" ""https://saviynt.freshdesk.com/helpdesk/attachments/152012383159"").
    
*   Navigate to Admin → Transport → select Import Package.
    
*   Browse the downloaded package and Import.
    
*   Navigate to Admin → Connections → Select “Freshteam” Connection.
    
*   Edit the connection with your Freshteam tenant details.
    

Using the Freshteam Integration
===============================

You can use the Freshteam integration for performing user import after configuring it to meet your requirements. 

Guidelines for Using the Integration
------------------------------------

To configure import, map all Freshteam attributes to EIC user attributes using **UserImport JSON**.

Configuring Import Operations
-----------------------------

**Full User import:** When configuring the connection for the first time, first perform full import to import all existing Users from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC.

The import jobs are automatically created in EIC after you create a connection for the Freshteam integration.

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

**Note:** Ensure that you record the token expiry duration during the initial token generation. The connection may fail if the token is not refreshed.