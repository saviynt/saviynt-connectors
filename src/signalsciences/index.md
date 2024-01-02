# Signal Sciences Connector for Saviynt

## Preface

This guide describes the integration between **Saviynt Enterprise Identity Cloud (EIC)** and Signal Sciences .

## Audience

This guide is intended for administrators and target application integration teams responsible for implementing a secure integration service with Signal Sciences .

## Introduction

**Signal Sciences** was a cybersecurity company that specialized in web application and API security. The company provided a cloud-native web application firewall (WAF) and runtime application self-protection (RASP) solution designed to protect web applications and APIs from various threats, including web application attacks and OWASP Top Ten vulnerabilities.

**Signal Sciences** platform offered real-time threat protection, visibility, and security analytics, helping organizations defend against web application attacks, such as SQL injection, cross-site scripting (XSS), and more. The company aimed to provide security teams with the tools and insights needed to protect their applications and APIs in modern, dynamic, and cloud-native environments.

The **Signal Sciences** connector enables you to seamlessly integrate with Signal Sciences to manage user lifecycle and govern access to their Sites.

For more information about different connectors in EIC, see [Saviynt Enterprise Identity Cloud Connectors](https://docs.saviyntcloud.com/bundle/EIC-Connectors/page/Content/Certified-Connectors.htm).

**Note:** This guide provides information about using the Signal Sciences REST connector using REST API for performing operations listed in the Supported Features.

## Supported Features

The Signal Sciences integration supports the following features:

1. Incremental Import
1. Lifecycle Management
1. Add or Remove Access

| Signal Sciences Object | EIC Object | Full Import | Incremental Import | Lifecycle Management | Access Management |
|-|-|-|-|-|-|
| Users | Accounts | Yes | No | Support for creating, updating, and removing accounts | Not applicable |
| Sites | Sites | Yes | No | Not applicable | Support for adding and removing site members |

## Supported Software Versions

| Software | Version |
|-|-|
| EIC | Release v4.5 and later |

## Understanding the Integration between EIC and Signal Sciences

You must create an integration between EIC and the collaboration platform hosted by the target application to perform import, provisioning, and deprovisioning tasks. The following components are involved in the integration:

* The Complete Service Management platform Signal Sciences combines ITSM with ESM and SIAM capabilities, enabling all internal departments, such as IT, HR, and Facilities, as well as external service providers and customers, to collaborate securely and seamlessly on one complete platform, reducing complexity and improving productivity.
* **Objects** are imported as entitlement types into EIC.
* **Security System** represents the connection between EIC and the target application.
    * It comprises of an endpoint, which is the target application for which you want EIC to manage the identity repository.
    * It provides application instance abstraction from connectivity including high-level metadata. For more information about creating a security system, see Creating a Security System.
* **Endpoint** is an instance of an application within the context of a security system.
    * It is the target application or application from which the connector imports the data and performs provisioning or deprovisioning of identity objects, such as users, accounts, and entitlements.
    * It is mandatory to create an endpoint after creating the security system.<br /><br />You can associate a single security system with multiple endpoints if the deployment involves modelling of multiple isolated virtual applications (based on sets of specific entitlements according to certain categories) within a single application instance. For more information about creating an endpoint, see Creating an Endpoint for the Security System.
* **Connector** is a software component that enables communication between EIC and the target application. It provides a simplified integration mechanism where in some instances you only need to create a connection with minimal connectivity information for your target application. The REST connector is used for importing, provisioning accounts and access through the REST APIs. For more information about creating a connection, see Creating a Connection.