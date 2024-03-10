# RingCentral Connector for Saviynt

## Preface

This guide describes the integration between Saviynt Enterprise Identity Cloud (EIC) and RingCentral.

## Audience

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with RingCentral.

## Introduction

RingCentral is a cloud-based communications and collaboration platform that offers a wide range of services, including cloud phone systems, video conferencing, team messaging, and contact center solutions. It is designed to enable businesses of all sizes to communicate and collaborate effectively across various channels, helping to streamline workflows and enhance productivity.

RingCentral aims to be an all-in-one communication and collaboration platform, helping businesses move away from traditional phone systems and on-premises hardware in favor of a more flexible, scalable, and cloud-based solution. It caters to various industries and organizations, from small businesses to large enterprises. However, keep in mind that specific features and offerings may evolve over time, so it's always best to visit their official website for the most up-to-date information.

The RingCentral connector enables you to seamlessly integrate with RingCentral to manage user lifecycle .

For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors](https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm).

Note: This guide provides information about using the RingCentral REST connector using SCIM API for performing operations listed in the Supported Features.

## Supported Features

The RingCentral integration supports the following features:

| RingCentral Object | EIC Object | Full Import | Incremental Import | Lifecycle Management | Access Management |
|-|-|-|-|-|-|
| Users | Accounts | Yes | No | Support for creating, updating, enabling, disabling, and removing accounts | Not applicable |

## Supported Software Versions

| Software | Version |
|-|-|
| EIC | Release v4.5 and later |

## Understanding the Integration between EIC and RingCentral

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and deprovisioning tasks. The following components are involved in the integration:

* The Complete Service Management platform RingCentral combines ITSM with ESM and SIAM capabilities, enabling all internal departments, such as IT, HR, and Facilities, as well as external service providers and customers, to collaborate securely and seamlessly on one complete platform, reducing complexity and improving productivity.
* Objects are imported as entitlement types into EIC.
* Security System represents the connection between EIC and the target application.
    * It comprises of an endpoint, which is the target application for which you want EIC to manage the identity repository.
    * It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see Creating a Security System.
* Endpoint is an instance of an application within the context of a security system.
    * It is the target application or application from which the connector imports the data and performs provisioning or deprovisioning of identity objects, such as users, accounts, and entitlements.
    * It is mandatory to create an endpoint after creating the security system. You can associate a single security system with multiple endpoints if the deployment involves modelling of multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see Creating an Endpoint for the Security System.
* Connector is a software component that enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing, provisioning accounts and access through the SCIM APIs. For more information about creating a connection, see Creating a Connection.
* Job Scheduler is a software component that executes a job based on the configured schedule to perform import or provisioning operations from EIC. When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the configured connector. If you want to instantly provision requests for completing the tasks without running the provisioning job, you must enable Instant Provisioning at the security system level and the Instant Provisioning Tasks global configuration. For more information about the jobs used by the connectors in the RingCentral integration.

## Integration Architecture

EIC uses a REST connection for integrating with RingCentral for importing data and for performing provisioning and deprovisioning tasks.

The following diagram illustrates the integration architecture and communication with the target application.

![](saviynt-ringcentral-diagram.png)

## Setting Up the Integration

### Prerequisites

Perform the following steps to Generate & Setup token authentication

1. Log in to the RingCentral portal using administrator credentials.
1. click on the "Admin" menu located in the top, horizontal menu.
1. Select "API access tokens" towards the bottom of the left hand menu.
1. You should see a list of access tokens if any have been provisioned. Select the token, or click the "+" button to create a new one.
1. Finally, enter a label/description for your token, and select an Agent on which the token will act on behalf of. Make sure the token is "enabled" and click "Save."
1. You can revoke the tokens at any time from the RingCentral user interface.

### Creating a Connection

Connection refers to the configuration setup for connecting EIC to target applications. For more information about the procedure to create a connection, see Creating a Connection.

### Understanding the Configuration Parameters

While creating a connection, you must specify connection parameters that the connector uses to connect with the target application, define the type of operations to perform, the target application objects against which those operations are performed, and the frequency of performing them. In addition, you can view and edit attribute mappings between EIC and the target application, predefined correlation rules, and provisioning jobs and import jobs.

#### Configuration Parameters for Account and Access Import

The connector uses the following parameters for creating a connection and for importing account and access from the target application:

##### Connection Parameters

.....

### Importing Connection Package

connection package helps you build the connection with pre-defined JSONs, this can be used if your tenant does not already have out of the box connection templates available. Here are the steps to import the RingCentral connection package.

1. Download the connection package.
1. Navigate to Admin → Transport → select Import Package.
1. Browse the downloaded package and Import.
1. Navigate to Admin → Connections → Select “RingCentral” Connection.
1. Edit the connection with your RingCentral tenant details.

### Creating a Security System

The security system represents the connection between EIC and the target application. For more information on creating a security system, see Creating a Security System.

### Creating an Endpoint for the Security System

Endpoint refers to the target application used to provision accounts and entitlements (access). For more information on creating an endpoint, see Creating Endpoints.

## Using the RingCentral Integration

You can use the RingCentral integration for performing import and provisioning operations after configuring it to meet your requirements. 

### Guidelines for Using the Integration

You must apply the following guidelines for configuring import: 

* Run account import before running the access import.
* Map all RingCentral attributes to EIC account attributes using ImportAccountEntJSON.

You must apply the following guidelines for configuring provisioning:

* Use Java ternary operators if you want to add conditions in the provisioning parameters. You can use Java operations to tweak any attributes by using if-else conditions, substrings, or operators in the JSON for provisioning.

### Configuring Import Operations

* Full account import: When configuring the connection for the first time, first perform full import to import all existing accounts from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted accounts are also identified and marked as suspended from import service.
* Full Access import: When configuring the connection for the first time, first perform full import to import all existing access from the target application to EIC. To perform full import, the invoke API gets response from the target application and maps the attributes in the target application with attributes in EIC. As part of this process, the deleted entitlements are also identified and marked as inactive.

The import jobs are automatically created in EIC after you create a connection for the RingCentral integration. For more information about creating jobs, see Data Jobs.

### Importing Accounts and Accesses

You must import accounts after the users are available in EIC.

To import accounts: 

1. Specify the connection and import parameters. For more information, see Account and Access import.<br /><br />Note: Ensure that the connection type is selected as REST.
1. Configure the Application Data Import (Single Threaded) job to import accounts and access. For more information, see Data Jobs.

### Configuring Provisioning and Deprovisioning

Provisioning is automatically enabled when a connection is configured. For detailed information about performing provisioning tasks, see Access Request System.

To provision objects to the target application:

1. pecify the connection and provisioning parameters. For more information, see Configuration Parameters for Provisioning.<br /><br />Note: Ensure that the connection type is selected as REST.
1. Configure the Provisioning job (WSRETRY). For more information, see Provisioning Jobs.

When a provisioning job is triggered, it creates provisioning tasks in EIC. When these tasks are completed, the provisioning action is performed on the target application through the connector.

## Troubleshooting

To troubleshoot common problems with connectors, answer frequently asked questions, and provide solutions to a few common issues you might encounter while configuring or working with connectors, see Common Troubleshooting Guide for Connectors.

To troubleshoot common problems or obtain answers for frequently asked questions for REST connectors, see the REST Connector Guide.

Note: Ensure that you record the token expiry duration during the initial token generation. The connection may fail, if the token is not refreshed.