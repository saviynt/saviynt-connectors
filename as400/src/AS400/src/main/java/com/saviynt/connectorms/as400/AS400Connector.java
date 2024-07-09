package com.saviynt.connectorms.as400;

import com.saviynt.ssm.abstractConnector.BaseConnectorSpecification;
import com.saviynt.ssm.abstractConnector.ConfigDataVo;
import com.saviynt.ssm.abstractConnector.RepositoryReconService;
import com.saviynt.ssm.abstractConnector.SearchableObject;
import com.saviynt.ssm.abstractConnector.exceptions.ConnectorException;
import com.saviynt.ssm.abstractConnector.exceptions.InvalidAttributeValueException;
import com.saviynt.ssm.abstractConnector.exceptions.InvalidCredentialException;
import com.saviynt.ssm.abstractConnector.exceptions.MissingKeyException;
import com.saviynt.ssm.abstractConnector.exceptions.OperationTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.ErrorCompletingRequestException;
import com.ibm.as400.access.ObjectDoesNotExistException;
import com.ibm.as400.access.RequestNotSupportedException;
import com.ibm.as400.access.User;
import com.ibm.as400.access.UserList;
import com.saviynt.ssm.abstractConnector.utility.GroovyService;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
//import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.saviynt.connectorms.as400.util.Constants;
import java.beans.PropertyVetoException;

/**
 *
 * @author marcozhang
 */
public class AS400Connector extends BaseConnectorSpecification {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Logger object
     */
    //private static final Logger log = Logger.getLogger(AS400Connector.class.getName());
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(AS400Connector.class.getName());

    public static void main(String[] args) {
    }

    /**
     * to retrieve connector display name.
     *
     * @return the string
     */
    @Override
    public String displayName() {

        return "AS400Connector (SCF)";
    }

    /**
     * to retrieve connector version.
     *
     * @return the string
     */
    @Override
    public String version() {

        return "1.0";
    }

    /**
     * to test the connection Example : To test the connection , refer to the
     * below steps step 1 : retrieve connection attributes from configData/Data
     * step 2 : connect to target system using JDBC connection step 3 : return
     * true in Map as given below if connection is successful. Map response =
     * new HashMap(); response.put("status", true);
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return the connectivity status in the Map.
     * @throws ConnectorException the connector exception
     * @throws InvalidCredentialException the invalid credential exception
     * @throws InvalidAttributeValueException the invalid attribute value
     * exception
     * @throws OperationTimeoutException the operation timeout exception
     * @throws MissingKeyException the missing key exception
     */
    @Override
    public Map test(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException,
            InvalidCredentialException, InvalidAttributeValueException, OperationTimeoutException, MissingKeyException {
        //logic to test connection
        //connect to target system using configData
        //write your logic
        //return true or false      
        LOGGER.setLevel(Level.ALL);

        AS400Connection conn = null;
        Map response = new HashMap();
        boolean success = false;
        
        try {
            // Initiate AS400 connection using the configuration data from configData object
            conn = connectToAS400(configData);
            if (conn != null && conn.isConnected()) {
                success = true;
                // Log AS400 version number
                LOGGER.info("AS400 Version: " + conn.getConnection().getVersion() + "." + conn.getConnection().getRelease());
                // Log password level
                conn.determinePasswordLevel();
            }
            // Return connection test result
            response.put("status", success); //true If connection to target is successful otherwise false.
        } catch (AS400SecurityException | IOException ex) {
            LOGGER.error(ex.getMessage());
            throw new ConnectorException(ex.getMessage());
        } catch (ConnectorException ex) {
            LOGGER.error(ex.getMessage());
        } finally {
            // Release connection object
            if (conn != null) {
                conn.close();
            }
        }

        return response;
    }

    /**
     * to set the config with attributes needed for creating a connection to the
     * target system from SSM. The attributes defined in configData in setConfig
     * are the attributes that would dynamically populate on the connection
     * creation UI under SSM to be input. Connection attributes can be added in
     * following way: Example: List<String> connectionAttributes =
     * configData.getConnectionAttributes();
     * connectionAttributes.add("drivername");
     *
     * Connection attributes that need to be encrypted can be added to
     * configData as below: Example : List<String> encryptedConnectionAttributes
     * = configData.getEncryptedConnectionAttributes();
     * encryptedConnectionAttributes.add("Password");
     *
     * Description or details of the format in which the config attributes are
     * supposed to be inputted from the UI can be added in configData as below:
     * JSONObject jsonObject = new JSONObject(connectionAttributesDescription);
     * jsonObject.put("Password", "Provide password to connect with
     * application"); jsonObject.put("CreateUserJSON", "SAMPLE JSON {}");
     * configData.getConnectionAttributesDescription().setConnectionAttributesDescription(jsonObject.toString());
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     */
    @Override
    public void setConfig(ConfigDataVo configData) {
        List<String> connectionAttributes = configData.getConnectionAttributes();

        // Add the config attributes like below: 
        connectionAttributes.add(Constants.HOSTNAME);
        connectionAttributes.add(Constants.USERNAME);
        connectionAttributes.add(Constants.PASSWORD);
        connectionAttributes.add(Constants.USESSL);
        connectionAttributes.add(Constants.ACCOUNT_ATTRIBUTES_JSON);
        connectionAttributes.add(Constants.GROUP_ATTRIBUTES_JSON);
        connectionAttributes.add(Constants.CREATEACCOUNT_JSON);
        connectionAttributes.add(Constants.UPDATEACCOUNT_JSON);
        connectionAttributes.add(Constants.REMOVEACCOUNT_JSON);
        connectionAttributes.add(Constants.ENABLEACCOUNT_JSON);
        connectionAttributes.add(Constants.DISABLEACCOUNT_JSON);
        connectionAttributes.add(Constants.ADDACCESS_JSON);
        connectionAttributes.add(Constants.REMOVEACCESS_JSON);
        connectionAttributes.add(Constants.CHANGECREDENTIAL_JSON);
        connectionAttributes.add(Constants.DYNAMICATTRIBUTES_JSON);
        connectionAttributes.add(Constants.SETRANDOMPASSWORD);
        connectionAttributes.add(Constants.PASSWORDPOLICY_JSON);

        //Set the attributes that need to be encrypted 
        encryptedConnectionAttributes(configData);

        //Set the description of config attributes
        connectionAttributesDescription(configData);

        /*
		set the attributes that are required as below. In example code, making all of our connection attributes as "required"
         */
        List<String> requiredConnectionAttributes = configData.getRequiredConnectionAttributes();
        //example code

        requiredConnectionAttributes.add(Constants.HOSTNAME);
        requiredConnectionAttributes.add(Constants.USERNAME);
        requiredConnectionAttributes.add(Constants.PASSWORD);
        requiredConnectionAttributes.add(Constants.USESSL);
    }

    /**
     * set ConnectionAttributes that need to be encrypted
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     */
    public void encryptedConnectionAttributes(ConfigDataVo configData) {

        List<String> encryptedConnectionAttributes = configData.getEncryptedConnectionAttributes();
        //Add name of config attributes (defined in set  configData's connectionAttributes in setConfig()) that need to be encrypted
        encryptedConnectionAttributes.add(Constants.PASSWORD);
    }

    /**
     * set description of the config attributes to be used in UI for specifying
     * their required format
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     */
    public void connectionAttributesDescription(ConfigDataVo configData) {

        String connectionAttributesDescription = configData.getConnectionAttributesDescription();
        JSONObject jsonObject = new JSONObject(connectionAttributesDescription);

        /**
         * Add description of the config attributes (defined in set configData's
         * connectionAttributes in setConfig()) as below.These will be shown on
         * the UI corresponding to these attributes as the input values format
         * required
         */
        jsonObject.put(Constants.HOSTNAME, "Hostname or IP address of AS400 target system.");
        jsonObject.put(Constants.USERNAME, "Administrator account name.");
        jsonObject.put(Constants.PASSWORD, "Administrator account password.");
        jsonObject.put(Constants.USESSL, "Indicates whether to connect to the host using SSL. The default value is true.");

        jsonObject.put(Constants.ACCOUNT_ATTRIBUTES_JSON, "AS400 user profile attribute mappings");
        jsonObject.put(Constants.GROUP_ATTRIBUTES_JSON, "AS400 group profile attribute mappings");
        jsonObject.put(Constants.CREATEACCOUNT_JSON, "Create user profile configuration");
        jsonObject.put(Constants.UPDATEACCOUNT_JSON, "Update user profile configuration");
        jsonObject.put(Constants.REMOVEACCOUNT_JSON, "Remove user profile configuration");
        jsonObject.put(Constants.ENABLEACCOUNT_JSON, "Enable user profile configuration");
        jsonObject.put(Constants.DISABLEACCOUNT_JSON, "Disable user profile configuration");
        jsonObject.put(Constants.ADDACCESS_JSON, "Access user profile to supplemental group configration");
        jsonObject.put(Constants.REMOVEACCESS_JSON, "Access supplemental group from user profile configration");
        jsonObject.put(Constants.CHANGECREDENTIAL_JSON, "Change user profile password configuration");
        jsonObject.put(Constants.SETRANDOMPASSWORD, "True or False. Whether to generate password in account creation");
        jsonObject.put(Constants.PASSWORDPOLICY_JSON, "Password policy for generating password for user profile creation");

        configData.setConnectionAttributesDescription(jsonObject.toString());
    }

    /**
     * to process reconcile for users and accounts Example : to process
     * reconcile for users and accounts , refer to the below steps step 1 :
     * retrieve connection attributes from configData/Data step 2 : collect the
     * data(Account,Users,Entitlements) from target system step 3 : set the data
     * into the format accepted by connector framework's
     * RepositoryReconService.notify() sample format:
     * finalData=[[{ACCOUNT.CUSTOMPROPERTY2=XXXX, ACCOUNT.CUSTOMPROPERTY1=XXXX,
     * ACCOUNT.NAME=XXXX}, {ENTITLEMENT.NAME=XXXX,
     * ENTITLEMENT.ENTITLEMENTTYPE=XXXX, ENTITLEMENT.ENTITLEMENT_VALUE=XXXX},
     * {ACCOUNT_ATTRIBUTES.ATTRIBUTE_VALUE=XXXX, ACCOUNT_ATTRIBUTES.NAME=XXXX,
     * ACCOUNT_ATTRIBUTES.ATTRIBUTE_NAME=XXXX}, {USERS.USERNAME=XXXX}]] step 4 :
     * call connector framework's RepositoryReconService.notify() with finalData
     * as input param from step 3 for SSM to process recon
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @param formatterClass the formatter class - This is for future
     * implementation hence ignore it for now
     * @throws ConnectorException the connector exception
     */
    @Override
    public void reconcile(Map<String, Object> configData, Map<String, Object> data, String formatterClass) {

        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Importing accounts and entitlements");
        //AS400Utils.printConfigData(configData, "configData");

        // Log the content of data map and mask the value of password field for debug purpose
        AS400Utils.printConfigData(data, "data");

        //"endpointId" is obtianed from ssm and is required in RepositoryReconService.notify() below
        Long endpointId = Long.valueOf(data.get("endpointId").toString());

        //List<List<Map<String, Object>>> finalData = processAccountReconcile(configData, data);
        // Call the method to retrieve AS400 user profiles and group profiles.
        // Return the required format for RepositoryReconService.notify() to write account and entitlement data into the endpoint
        List<List<Map<String, Object>>> finalData = processAccountEntitlementReconcile(configData, data);
        try {
            LOGGER.info("calling RepositoryReconService.notify()");
            // call notify method with finalData prepared above that contains the reconciled data 
            // for reconiliation of accounts in SSM. As explained in the parameter definition, formatterClass
            // can be ignored for now
            //LOGGER.debug("Saving accounts: " + finalData);
            RepositoryReconService.notify(finalData, endpointId, null, data);

            // Release finalData as it can be big
            finalData.clear();
        } catch (Exception e) {
            LOGGER.error("Exception occured in importing data " + e.getMessage());
            LOGGER.error("Stack trace:  " + Arrays.toString(e.getStackTrace()));
        }

    }

    private List<List<Map<String, Object>>> processAccountEntitlementReconcile(Map<String, Object> configData, Map<String, Object> data) {
        /*
        * Write your own logic to pull accounts
        * Write your own logic to pull entitlements 
        * Write your own logic to pull accounts and entitlements relationship
        * Build accountsAllDataMap. Below is the sample data format
            [
                [
                    {}, 
                    {
                        ENTITLEMENT.ENTITLEMENTID=xxx, ENTITLEMENT.ENTITLEMENT_VALUE=xxx, ENTITLEMENT.TYPE=Group, ENTITLEMENT.ENTITLEMENTMAPPINGJSON=, ENTITLEMENT.Description=, ENTITLEMENT.CUSTOMPROPERTY2=xxx, ENTITLEMENT.CUSTOMPROPERTY1=xxx
                    },
                    {}
                ],
                [
                    {
                        ACCOUNT.CUSTOMPROPERTY1=xxx, ACCOUNT.CUSTOMPROPERTY2=xxx, ACCOUNT.DESCRIPTION=xxx, ACCOUNT.NAME=xxx, ACCOUNT.ACCOUNTID=xxx, ACCOUNT.RECONCILIATION_FIELD=ACCOUNTID
                    }, 
                    {
                        ENTITLEMENT.ENTITLEMENTID=xxx, ENTITLEMENT.ENTITLEMENT_VALUE=xxx, ENTITLEMENT.TYPE=Group, ENTITLEMENT.ENTITLEMENTMAPPINGJSON={}, ENTITLEMENT.Description=xxx, ENTITLEMENT.CUSTOMPROPERTY2=xxx, ENTITLEMENT.CUSTOMPROPERTY1=xxx
                    }, 
                    {
                        ACCOUNT_ATTRIBUTES.PRINCIPALSOURCE=xxx, ACCOUNT_ATTRIBUTES.GROUPID=xxx
                    }
                ]
            ]
         */

        // List of list that is used to store entitlements, accounts and account/entitlement assoications. It is returned for 
        // RepositoryReconService.notify() to write back into EIC endpoint
        List<List<Map<String, Object>>> accountsAllDataMap = new ArrayList<>();

        // A variable for storing all retrieved groups to used to verify if the supplmental groups in user profile attribute SUPGRPPRF exist
        Map<String, Map<String, Object>> group_map = new HashMap();

        // User and group are essentially user profile in AS400. For user, GID is 0.
        // Initiate AS400 connection using the credential from configData object map
        AS400Connection conn = connectToAS400(configData);
        if (conn.getConnection() != null) {
            // Call JTOpen UserList method to create the UserList object
            // https://www.ibm.com/docs/en/i/7.5?topic=classes-user-group
            // https://www.ibm.com/docs/en/i/7.5?topic=ssw_ibm_i_75/rzahh/javadoc/com/ibm/as400/access/UserList.htm
            UserList users = new UserList(conn.getConnection());

            // ****************************************************
            // Firstly retrieve and process all groups
            // ****************************************************
            try {
                // Set selection value indicating that the list contains only user profiles that are group profiles.
                users.setUserInfo(UserList.GROUP);
                LOGGER.debug("No. of Groups: " + users.getLength());
                try {
                    // Get the list of all groups
                    Enumeration io = users.getUsers();
                    // Iterate through the list
                    while (io.hasMoreElements()) {
                        // Get AS400 group profile object
                        User object = (User) io.nextElement();

                        /* Initate a map to store one entitlement (group) in the following format
                        * 
                        * {ENTITLEMENT.ENTITLEMENTID=xxx, ENTITLEMENT.ENTITLEMENT_VALUE=xxx, ENTITLEMENT.TYPE=Group, ENTITLEMENT.CUSTOMPROPERTY1=xxx}
                         */
                        Map<String, Object> oneEnt = new HashMap<>();

                        /* GROUP_ATTRIBUTES defines how AS400 group attributes are mapped to EIC entitlement properties
                        * Sample GROUP_ATTRIBUTES format looks like below
                        * propLabels section is not used at the moment. It is only there as a reference for labeling purpose
                            {
                                "propLabels": {
                                    "customproperty1": "User class"
                                },
                                "colsToPropsMap": {
                                    "ENTITLEMENTID": "USRPRF",
                                    "ENTITLEMENT_VALUE": "USRPRF",
                                    "customproperty1": "USRCLS"
                                }
                            }
                        * Convert colsToPropsMap section of GROUP_ATTRIBUTES json configuration into a map for use later
                         */
                        Map<String, Object> attrs_map = AS400Utils.getAttributeMappings(configData, Constants.GROUP_ATTRIBUTES_JSON);

                        // Iterate through defined group properties and get the value of each AS400 group attribute
                        for (Map.Entry<String, Object> group : attrs_map.entrySet()) {
                            // This is the EIC entitlement property name
                            String savPropName = group.getKey();
                            // This is the AS400 group profile attribute name
                            String as400ParamName = (String) group.getValue();
                            // Get the actual value of AS400 group profile attribute
                            Object asValue = AS400Utils.getParamValue(object, as400ParamName);
                            // Save converted entry into entitlement map in oneEnt variable
                            // it will look like:
                            // ENTITLEMENT.ENTITLEMENTID=xxx, ENTITLEMENT.ENTITLEMENT_VALUE=xxx, ENTITLEMENT.CUSTOMPROPERTY1=xxx
                            if (asValue != null && !asValue.toString().isEmpty()) {
                                oneEnt.put(Constants.ENTITLEMENT_PREFIX + savPropName, asValue);
                            }
                        }

                        // ENTITLEMENTID, ENTITLEMENT_VALUE, TYPE are minimum properties required. If they are not defined in GROUP_ATTRIBUTES add them here
                        // If "TYPE": "Group" is not defined in GROUP_ATTRIBUTES json configuration, add it here
                        if (oneEnt.get(Constants.ENTITLEMENT_PREFIX + Constants.SAV_ENTATR_ENTITLEMENTTYPE) == null) {
                            oneEnt.put(Constants.ENTITLEMENT_PREFIX + Constants.SAV_ENTATR_ENTITLEMENTTYPE, Constants.ENTITLEMENT_TYPE_GROUP);
                        }

                        // If "ENTITLEMENTID": "USRPRF" is not defined in GROUP_ATTRIBUTES json configuration, add it here
                        if (oneEnt.get(Constants.ENTITLEMENT_PREFIX + Constants.SAV_ENTATR_ENTITLEMENTID) == null) {
                            oneEnt.put(Constants.ENTITLEMENT_PREFIX + Constants.SAV_ENTATR_ENTITLEMENTID, object.getName());
                        }
                        // If "ENTITLEMENT_VALUE": "USRPRF" is not defined in GROUP_ATTRIBUTES json configuration, add it here
                        if (oneEnt.get(Constants.ENTITLEMENT_PREFIX + Constants.SAV_ENTATR_ENTITLEMENT_VALUE) == null) {
                            oneEnt.put(Constants.ENTITLEMENT_PREFIX + Constants.SAV_ENTATR_ENTITLEMENT_VALUE, object.getName());
                        }

                        // Store entitlement detail for later use
                        // This shouldn't be required if the service account permission is properly given.
                        // In a situation when the service account doesn't have enough permissions to retrieve all the groups, we don't want to 
                        // return those groups appear in user profile attribute SUPGRPPRF but not retrieved by getUser() call to appear in EIC as group entitlement
                        LOGGER.debug("Add group: " + object.getName());
                        group_map.put(object.getName(), oneEnt);

                        /* Construct one complete entitlement (group) entry in the format like below
                        * the first and last empty element are intentional though they aren't needed in fact as this is entitlement not account
                        * As stated in documentation, each inner array includes three maps: accounts data, associated entitlement data, and additional account attribute data in the following format:
                            [{Account1}, {Ent1}, {ACCOUNT_ATTRIBUTES}]
                        * https://docs.saviyntcloud.com/bundle/SCF_v24x/page/Content/Developing-the-Connector.htm
                        * Sample data:
                            [
                                {}, 
                                {
                                    ENTITLEMENT.ENTITLEMENTID=xxx, ENTITLEMENT.ENTITLEMENT_VALUE=xxx, ENTITLEMENT.TYPE=Group, ENTITLEMENT.CUSTOMPROPERTY1=xxx
                                },
                                {}
                            ]
                         */
                        List<Map<String, Object>> entSet = new ArrayList<>();
                        entSet.add(new HashMap<>());
                        entSet.add(oneEnt);
                        entSet.add(new HashMap<>());
                        // Finally, append entitlement details to the list
                        //LOGGER.info("Entitlement data: " + entSet);
                        accountsAllDataMap.add(entSet);
                    }

                } catch (AS400SecurityException | ErrorCompletingRequestException | InterruptedException | IOException | ObjectDoesNotExistException | RequestNotSupportedException ex) {
                    LOGGER.error("Error iterating groups {}", ex.getMessage());
                }
            } catch (PropertyVetoException ex) {
                LOGGER.error("setUserInfo error {}", ex.getMessage());
            }

            // ****************************************************
            // Secondly retrieve and process all users
            // ****************************************************
            try {
                // Set selection value indicating that the list contains only user profiles that are not group profiles.
                users.setUserInfo(UserList.USER);
                LOGGER.debug("No. of Users: " + users.getLength());
                try {
                    // Get the list of all users
                    Enumeration io = users.getUsers();
                    // Iterate through the list
                    while (io.hasMoreElements()) {
                        // Get AS400 user profile object
                        User object = (User) io.nextElement();

                        /* Initate a map to store one user (account) in the following format
                        * {ACCOUNT.CUSTOMPROPERTY1=xxx, ACCOUNT.NAME=xxx, ACCOUNT.ACCOUNTID=xxx, ACCOUNT.RECONCILIATION_FIELD=ACCOUNTID}
                         */
                        Map<String, Object> oneAccount = new HashMap<>();

                        /* ACCOUNT_ATTRIBUTES defines how AS400 user attributes are mapped to EIC account properties
                        * Sample ACCOUNT_ATTRIBUTES format looks like below
                        * propLabels section is not used at the moment. It is only there as a reference for labeling purpose
                            {
                                "propLabels": {
                                    "customproperty1": "User class (CP1)",
                                    "customproperty2": "Assistance level (CP2)"
                                },
                                "colsToPropsMap": {
                                    "RECONCILIATION_FIELD": "ACCOUNTID",
                                    "accountID": "USRPRF",
                                    "name": "USRPRF",
                                    "customproperty1": "USRCLS"
                                }
                            }
                        * Convert colsToPropsMap section of ACCOUNT_ATTRIBUTES json configuration into a map for use later
                         */
                        Map<String, Object> attrs_map = AS400Utils.getAttributeMappings(configData, Constants.ACCOUNT_ATTRIBUTES_JSON);

                        // Iterate through defined account properties and get the value of each AS400 user attribute
                        for (Map.Entry<String, Object> attribute : attrs_map.entrySet()) {
                            // This is the EIC acccount property name
                            String savPropName = attribute.getKey();
                            // This is the AS400 user profile attribute name
                            String as400ParamName = (String) attribute.getValue();
                            // Get the actual value of AS400 user profile attribute
                            Object asValue = AS400Utils.getParamValue(object, as400ParamName);
                            // Save converted entry into account map in oneAccount variable
                            // it will look like:
                            // ACCOUNT.CUSTOMPROPERTY1=xxx, ACCOUNT.NAME=xxx, ACCOUNT.ACCOUNTID=xxx, ACCOUNT.RECONCILIATION_FIELD=ACCOUNTID
                            if (asValue != null && !asValue.toString().isEmpty()) {
                                oneAccount.put(Constants.ACCOUNT_PREFIX + savPropName, asValue);
                            }
                        }

                        // ACCOUNTID, NAME, RECONCILIATION_FIELD are minimum properties required. If they are not defined in ACCOUNT_ATTRIBUTES add them here
                        // If "RECONCILIATION_FIELD": "ACCOUNTID" is not defined in ACCOUNT_ATTRIBUTES json configuration, add it here
                        if (oneAccount.get(Constants.ACCOUNT_PREFIX + Constants.OPT_RECONCILIATION_FIELD) == null) {
                            oneAccount.put(Constants.ACCOUNT_PREFIX + Constants.OPT_RECONCILIATION_FIELD, Constants.OPT_DEFAULT_RECONCILIATION_FIELD);
                        }

                        // If "accountID": "USRPRF" is not defined in ACCOUNT_ATTRIBUTES json configuration, add it here
                        if (oneAccount.get(Constants.ACCOUNT_PREFIX + Constants.SAV_ACCTATTR_ACCOUNTID) == null) {
                            oneAccount.put(Constants.ACCOUNT_PREFIX + Constants.SAV_ACCTATTR_ACCOUNTID, object.getName());
                        }

                        // If "name": "USRPRF" is not defined in ACCOUNT_ATTRIBUTES json configuration, add it here
                        if (oneAccount.get(Constants.ACCOUNT_PREFIX + Constants.SAV_ACCTATTR_NAME) == null) {
                            oneAccount.put(Constants.ACCOUNT_PREFIX + Constants.SAV_ACCTATTR_NAME, object.getName());
                        }

                        /* Construct one complete account entry in the format like below
                        * As stated in documentation, each inner array includes three maps: accounts data, associated entitlement data, and additional account attribute data in the following format:
                            [{Account1}, {Ent1}, {ACCOUNT_ATTRIBUTES}]
                        * https://docs.saviyntcloud.com/bundle/SCF_v24x/page/Content/Developing-the-Connector.htm
                        * Sample data:
                            [
                                {
                                    ACCOUNT.CUSTOMPROPERTY1=xxx, ACCOUNT.NAME=xxx, ACCOUNT.ACCOUNTID=xxx, ACCOUNT.RECONCILIATION_FIELD=ACCOUNTID
                                }, 
                                {
                                    ENTITLEMENT.ENTITLEMENTID=xxx, ENTITLEMENT.ENTITLEMENT_VALUE=xxx, ENTITLEMENT.TYPE=Group, ENTITLEMENT.CUSTOMPROPERTY1=xxx
                                }, 
                                {                                  
                                }
                            ]
                        * We will not handle ACCOUNT_ATTRIBUTES in this implementation
                         */
                        LOGGER.debug("Add user: " + object.getName());
                        // Get list of supplemental groups
                        String[] groupList = object.getSupplementalGroups();
                        List<String> groups = new ArrayList();
                        if (groupList != null) {
                            groups = Arrays.asList(groupList);
                        }
                        // Add associated entitlements into the account set
                        if (groups.isEmpty()) {
                            // If no supplemental group for the user, simply add the following into final return variable
                            /*
                                [
                                    {
                                        ACCOUNT.CUSTOMPROPERTY1=xxx, ACCOUNT.NAME=xxx, ACCOUNT.ACCOUNTID=xxx, ACCOUNT.RECONCILIATION_FIELD=ACCOUNTID
                                    }, 
                                    {}, 
                                    {}
                                ]
                             */
                            LOGGER.debug("No groups for user " + object.getName());
                            List<Map<String, Object>> accountSet = new ArrayList<>();
                            // Add account details
                            accountSet.add(oneAccount);
                            // Add empty group details
                            accountSet.add(new HashMap<>());
                            // Add empty account attribute details
                            accountSet.add(new HashMap<>());
                            // Append account details to the list
                            //LOGGER.info("Account data: " + accountSet);
                            accountsAllDataMap.add(accountSet);
                        } else {
                            // If there are supplemental groups, add them one by one.
                            // If there are 2 supplemental groups, it should add 2 list elements like below
                            /*
                                [
                                    {
                                        ACCOUNT.CUSTOMPROPERTY1=xxx, ACCOUNT.NAME=account1, ACCOUNT.ACCOUNTID=account1, ACCOUNT.RECONCILIATION_FIELD=ACCOUNTID
                                    }, 
                                    {
                                        ENTITLEMENT.ENTITLEMENTID=group1, ENTITLEMENT.ENTITLEMENT_VALUE=group1, ENTITLEMENT.TYPE=Group, ENTITLEMENT.CUSTOMPROPERTY1=xxx
                                    }, 
                                    {                                  
                                    }
                                ],
                                [
                                    {
                                        ACCOUNT.CUSTOMPROPERTY1=xxx, ACCOUNT.NAME=account1, ACCOUNT.ACCOUNTID=account1, ACCOUNT.RECONCILIATION_FIELD=ACCOUNTID
                                    }, 
                                    {
                                        ENTITLEMENT.ENTITLEMENTID=group2, ENTITLEMENT.ENTITLEMENT_VALUE=group2, ENTITLEMENT.TYPE=Group, ENTITLEMENT.CUSTOMPROPERTY1=xxx
                                    }, 
                                    {                                  
                                    }
                                ]
                             */
                            LOGGER.debug("Assoicate groups: " + groups);
                            Boolean no_real_group = true;
                            // if the account belongs to groups, add group assoication
                            for (String group : groups) {
                                // this is used to store account and optionally one associated entitlement
                                List<Map<String, Object>> accountSet = new ArrayList<>();
                                Map<String, Object> real_group = group_map.get(group);
                                // Check if the group from SUPGRPPRF was actually retrieved previously. Only add it if it exist
                                // There seems to be the case whereby the group is in supplemental group attribute but it actually is not retreived due to permission issue
                                if (real_group != null) {
                                    no_real_group = false;
                                    // Add account details
                                    accountSet.add(oneAccount);
                                    // Add group details
                                    accountSet.add(group_map.get(group));
                                    // Add empty account attribute details
                                    accountSet.add(new HashMap<>());
                                    // Append account details to the list
                                    //LOGGER.info("Account data: " + accountSet);
                                    accountsAllDataMap.add(accountSet);
                                } else {
                                    LOGGER.info("Missing group {} for user {}", group, object.getName());
                                }
                            }
                            // If none of the groups in supplemental goup attribute actually exist, simply add the account info
                            if (no_real_group) {
                                List<Map<String, Object>> accountSet = new ArrayList<>();
                                accountSet.add(oneAccount);
                                accountsAllDataMap.add(accountSet);
                                accountSet.add(new HashMap<>());
                                accountSet.add(new HashMap<>());
                            }
                        }

                    }
                } catch (AS400SecurityException | ErrorCompletingRequestException | InterruptedException | IOException | ObjectDoesNotExistException | RequestNotSupportedException ex) {
                    LOGGER.error("Error iterating users {}", ex.getMessage());
                }
            } catch (PropertyVetoException ex) {
                LOGGER.error("setUserInfo error {}", ex.getMessage());
            }

        }

        //LOGGER.debug("final return data: {}", accountsAllDataMap);
        return accountsAllDataMap;
    }

    /**/
    private Map<String, Object> porcessConfigJSON(Map<String, Object> configData, Map<String, Object> data, String configName) throws ConnectorException {
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Processing " + configName);

        // Get json configuration
        Object config_obj = data.get(configName);
        String resolved_json = null;
        if (config_obj != null) {
            try {
                // When dynamic attributes are defined in the endpoint and the dynamic attributes are used in connection json attribute,
                // they will appear in data map object if the provisioning task is created from request but not from technical rule.
                // So, add them into data map object before the process of replacing binding variables otherwise error will be thrown if 
                // provisioning task is created from technical rule.
                Map<String, Object> newdata = AS400Utils.addDynamicAttributes(configData, data);

                // if it is create account, add random password into data object
                if (configName.equals(Constants.CREATEACCOUNT_JSON)) {
                    String setPwd = (String) configData.get(Constants.SETRANDOMPASSWORD);

                    // If provisioning task is created from technical rule, randomPassword binding isn't populated in data map object.
                    // So, generate random password with the following customised feature. However, this is a problem in this approach
                    // because the generated password cannot be retrieved in email template. 
                    if (setPwd != null && setPwd.toUpperCase().equals("TRUE")) {
                        String pwd = AS400Utils.generatePassword(configData);
                        if (pwd != null) {
                            newdata.put("randomPassword", pwd);
                        }
                    }
                }
                // Replaces the binding variables in the connection attributes
                resolved_json = GroovyService.convertTemplateToString(config_obj.toString(), newdata);
            } catch (Exception ex) {
                LOGGER.error("Error in resolving binding variables: " + ex);
                throw new ConnectorException("Error in resolving binding variables: " + ex);
            }
        }

        Map<String, Object> config_map = null;
        if (resolved_json != null && !resolved_json.trim().isEmpty()) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                config_map = mapper.readValue(resolved_json, HashMap.class);
            } catch (JsonProcessingException ex) {
                LOGGER.error("Error in converting json string to map: " + ex);
                throw new ConnectorException("Error in converting json string to map: " + ex);
            }
        }

        return config_map;
    }

    private AS400Connection connectToAS400(Map<String, Object> configData) {
        // Get AS400 connectivity details
        String host = (String) configData.get(Constants.HOSTNAME);
        String username = (String) configData.get(Constants.USERNAME);
        String password = (String) configData.get(Constants.PASSWORD);
        String ssl = (String) configData.get(Constants.USESSL);
        return new AS400Connection(host, username, password, (ssl.equalsIgnoreCase("TRUE")));
    }

    private Boolean sendCommand(AS400Connection conn, String command) throws ConnectorException {
        boolean success = false;
        try {
            if (conn.getConnection() != null) {
                success = conn.runCommand(command);
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return success;
    }

    /*
    * Return account creation result in the following format
    * {ACCOUNT.CUSTOMPROPERTY1=xxx, ACCOUNT.NAME=xxx, ACCOUNT.ACCOUNTID=xxx, ACCOUNT.DESCRIPTION=xxx}
     */
    private Map getResponseMetaData(User as400user, Map<String, Object> attrs_map) {

        // If accountid, name and RECONCILIATION_FIELD are missing, add them
        attrs_map.put(Constants.OPT_RECONCILIATION_FIELD,
                attrs_map.get(Constants.OPT_RECONCILIATION_FIELD) != null ? attrs_map.get(Constants.OPT_RECONCILIATION_FIELD) : Constants.OPT_DEFAULT_RECONCILIATION_FIELD);
        attrs_map.put(Constants.SAV_ACCTATTR_ACCOUNTID,
                attrs_map.get(Constants.SAV_ACCTATTR_ACCOUNTID) != null ? attrs_map.get(Constants.SAV_ACCTATTR_ACCOUNTID) : Constants.OPT_USRPRF);
        attrs_map.put(Constants.SAV_ACCTATTR_NAME,
                attrs_map.get(Constants.SAV_ACCTATTR_NAME) != null ? attrs_map.get(Constants.SAV_ACCTATTR_NAME) : Constants.OPT_USRPRF);

        //List<List<Map<String, Object>>> accountsAllDataMap = new ArrayList<>();
        //List<Map<String, Object>> acctEnt = new ArrayList<>();
        Map<String, Object> oneAccount = new HashMap<>();

        // Add other defined attribute values
        for (Map.Entry<String, Object> attribute : attrs_map.entrySet()) {
            // This is the EIC acccount property name
            String savPropName = attribute.getKey();
            // This is the AS400 user profile attribute name
            String as400ParamName = (String) attribute.getValue();
            // Get the actual value of AS400 user profile attribute
            Object asValue = AS400Utils.getParamValue(as400user, as400ParamName);
            if (asValue != null && !asValue.toString().isEmpty()) {
                oneAccount.put(Constants.ACCOUNT_PREFIX + savPropName, asValue);
            }
        }

        // We don't need ACCOUNT.RECONCILIATION_FIELD=ACCOUNTID so let's remove it
        oneAccount.remove(Constants.ACCOUNT_PREFIX + Constants.OPT_RECONCILIATION_FIELD);
        //acctEnt.add(oneAccount);
        //accountsAllDataMap.add(acctEnt);
        LOGGER.debug("ReconcileAccount = {}", oneAccount.toString());

        return oneAccount;
    }

    /**
     * This is for future implementation hence ignore it for now to check
     * existing record for the input object USER, ACCOUNT, ENTITLEMENT,
     * ACCOUNT_ENTITLEMENT in SSM Example : to check existing record for the
     * input object(for account) , refer to the below steps step 1 : retrieve
     * connection attributes from configData/Data step 2 : set the data with
     * filters if any step 3 : call getObjectList step 4 : return true if object
     * exists
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @param serachableObject for serachableObject enabled for the entities
     * USER, ACCOUNT, ENTITLEMENT, ACCOUNT_ENTITLEMENT
     * @return the boolean true or false
     * @throws ConnectorException the connector exception
     */
    @SuppressWarnings("rawtypes")
    @Override
    public Boolean checkExisting(Map<String, Object> configData, Map<String, Object> data,
            SearchableObject serachableObject) throws ConnectorException {
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Check account exist");

        Boolean recordFound = false;
        //Connect to target System With Config data 
        //Check in SSM to find user with firstname
        Map<String, Object> userMap = new HashMap<String, Object>();
        userMap.put("firstname", "firstnameissaviynt");
        //call SaviyntReadOnlyObject.getObjectList(ExposedObject sObject,Map<String, Object> filter,Integer firstResult,Integer maxResult) with below arguments in the below order
        // ExposedObject sObject  - USERS  in this use case
        // filter is the criteria to retrieve user object which is userMap in this use case
        // Integer firstResult - row number  which is 1 in this use case
        // Integer maxResult - maximum results 
        //List resultList = SaviyntReadOnlyObject.getObjectList(ExposedObject.USERS, userMap,1,2);
        //Return true if resultList >0
        return recordFound;
    }

    /**
     * to create account in the target system Example : to create account in the
     * target system , refer to the below steps step 1 : retrieve connection
     * attributes from configData/Data step 2 : connect to the target system
     * step 3 : execute the query/process with the required input to create
     * account in the target system step 4 : return the Map with metadata as
     * explained in parameter description
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM (metadata
     * built with help of reconcile json mapping). Metadata is nothing but set
     * of properties from the target system to be updated in SSM for that
     * account. Example : Match the corresponding column of SSM with target
     * system data and build sampleMetadata. map sampleMetadata to
     * provisioningData key in the result map as below and return
     * map.put("provisioningData",sampleMetadata) metadata sample format :
     * {ACCOUNT.COLUMNNAME1=XXXX, ACCOUNT.COLUMNNAME2=XXXX,
     * ACCOUNT.COLUMNNAME3=XXXX} This is optional filed. If no metadata needs to
     * updated in SSM, it can be set to null Example :
     * map.put("provisioningData",null)
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map createAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Creating account");

        //com.saviynt.ssm.entity.ArsTasks task = (com.saviynt.ssm.entity.ArsTasks) data.get("arsTasks");
        //LOGGER.debug("randompassword: " + task.getPassword());
        // Log the content of data map and mask the value of password field for debug purpose 
        AS400Utils.printConfigData(data, "data");

        // Process configuration to replace binding variables and "inject" dynamic attributes
        Map<String, Object> config_map = porcessConfigJSON(configData, data, Constants.CREATEACCOUNT_JSON);

        // Log configuration with binding variables resolved and password masked for debug purpose 
        AS400Utils.printConfigData(config_map, "Processed " + Constants.CREATEACCOUNT_JSON);

        // Form AS400 user profile creation command
        String command = AS400Utils.constructCreateUserCommand(config_map);

        Map responseMap = new HashMap();

        //AS400Connection conn = connectToAS400(configData);
        // Execute creation user command
        if (sendCommand(connectToAS400(configData), command)) {
            // If we reach this step that means user creation is successful. Let's retrieve user information from target directly.
            String accountName = data.get("accountName").toString();
            LOGGER.debug("Retrieving user name: " + accountName);

            // sendcommand method closes connection automatically, so we need to re-establish connection again
            AS400Connection newconn = connectToAS400(configData);
            try {
                User newuser = new User(newconn.getConnection(), accountName);

                //build and return a map as explained in the @return Map description with this method 
                // Convert colsToPropsMap section of ACCOUNT_ATTRIBUTES json configuration into a map for use later
                Map<String, Object> attrs_map = AS400Utils.getAttributeMappings(configData, Constants.ACCOUNT_ATTRIBUTES_JSON);

                // Build return map and write it back to account object in EIC
                Map<String, Object> resultMap = getResponseMetaData(newuser, attrs_map);

                //LOGGER.debug("Return map: {}", resultMap);
                //Map which consists of metadata to be updated in SSM. Refer to the javadocs of this method for map format
                responseMap.put("provisioningData", resultMap);
            } catch (AS400SecurityException | ErrorCompletingRequestException | InterruptedException | IOException | ObjectDoesNotExistException ex) {
                LOGGER.error("Error retrieving user {} {}", accountName, ex.getMessage());
                throw new ConnectorException("Error retrieving user " + accountName + ". " + ex.getMessage());
            } finally {
                if (newconn != null) {
                    newconn.close();
                }
            }

        } else {
            throw new ConnectorException("Failed to create account.");
        }

        return responseMap;
    }

    /**
     * to update account in the target system Example : to update account in the
     * target system , refer to the below steps step 1 : retrieve connection
     * attributes from configData/Data step 2 : connect to the target system
     * step 3 : execute the query/process with the required input to update
     * account in the target system step 4 : return the Map with metadata as
     * explained in parameter description
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM (metadata
     * built with help of reconcile json mapping). Metadata is nothing but set
     * of properties from the target system to be updated in SSM for that
     * account. Example:Match the corresponding column of SSM with target system
     * data and build sampleMetadata. map sampleMetadata to provisioningData key
     * in the result map as below and return
     * map.put("provisioningData",sampleMetadata) metadata sample format :
     * {ACCOUNT.COLUMNNAME1=XXXX, ACCOUNT.COLUMNNAME2=XXXX,
     * ACCOUNT.COLUMNNAME3=XXXX} This is optional filed. If no metadata needs to
     * updated in SSM, it can be set to null Example :
     * map.put("provisioningData",null)
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map updateAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Updating account");

        // Log the content of data map and mask the value of password field for debug purpose 
        AS400Utils.printConfigData(data, "data");

        // Process configuration to replace binding variables and "inject" dynamic attributes
        Map<String, Object> config_map = porcessConfigJSON(configData, data, Constants.UPDATEACCOUNT_JSON);

        // Log configuration with binding variables resolved and password masked for debug purpose 
        AS400Utils.printConfigData(config_map, "Processed " + Constants.UPDATEACCOUNT_JSON);

        // Form AS400 user profile update command
        String command = AS400Utils.constructUpdateUserCommand(config_map);

        Map responseMap = new HashMap();
        //AS400Connection conn = connectToAS400(configData);

        // Execute update user command
        if (sendCommand(connectToAS400(configData), command)) {

            // If we reach this step that means user creation is successful. Let's retrieve user information from target directly.
            String accountName = data.get("accountName").toString();
            LOGGER.debug("Retrieving user name: " + accountName);

            // sendcommand method closes connection automatically, so we need to re-establish again
            AS400Connection newconn = connectToAS400(configData);
            try {
                User newuser = new User(newconn.getConnection(), accountName);

                //build and return a map as explained in the @return Map description with this method 
                // Convert colsToPropsMap section of ACCOUNT_ATTRIBUTES json configuration into a map for use later
                Map<String, Object> attrs_map = AS400Utils.getAttributeMappings(configData, Constants.ACCOUNT_ATTRIBUTES_JSON);

                // Build return map and write it back to account object in EIC
                Map<String, Object> resultMap = getResponseMetaData(newuser, attrs_map);
                //LOGGER.info("Return map: {}", resultMap);
                //Map which consists of metadata to be updated in SSM. Refer to the javadocs of this method for map format
                responseMap.put("provisioningData", resultMap);
            } catch (AS400SecurityException | ErrorCompletingRequestException | InterruptedException | IOException | ObjectDoesNotExistException ex) {
                LOGGER.error("Error retrieving user {} {}", accountName, ex.getMessage());
                throw new ConnectorException("Error retrieving user " + accountName + ". " + ex.getMessage());
            } finally {
                if (newconn != null) {
                    newconn.close();
                }
            }
        } else {
            throw new ConnectorException("Failed to update account.");
        }

        return responseMap;
    }

    /**
     * to lock the account in target system Example : to lock account in the
     * target system , refer to the below steps step 1 : retrieve connection
     * attributes from configData/Data step 2 : connect to the target system
     * step 3 : execute the query/process with the required input to lock
     * account in the target system step 4 : return the Map with metadata as
     * explained in parameter description
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM.This is for
     * future implementation hence set it to null for now Example:
     * map.put("provisioningData",null)
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map lockAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
        //Connect to target System With Config data 
        //lock Account in target System 
        Map map = new HashMap();
        //build and return a map as explained in the @return Map description with this method 
        //map.put("provisioningData",metadata map);
        return map;
    }

    /**
     * to disable account in the target system Example : to disable account in
     * the target system , refer to the below steps step 1 : retrieve connection
     * attributes from configData/Data step 2 : connect to the target system
     * step 3 : execute the query/process with the required input to disable
     * account in the target system step 4 : return the Map with metadata as
     * explained in parameter description
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM.This is for
     * future implementation hence set it to null for now Example:
     * map.put("provisioningData",null)
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map disableAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Disabling account");

        // Log the content of data map and mask the value of password field for debug purpose
        AS400Utils.printConfigData(data, "data");

        // Process configuration to replace binding variables and "inject" dynamic attributes
        Map<String, Object> config_map = porcessConfigJSON(configData, data, Constants.DISABLEACCOUNT_JSON);

        // Log configuration with binding variables resolved and password masked for debug purpose 
        AS400Utils.printConfigData(config_map, "Processed " + Constants.DISABLEACCOUNT_JSON);

        // Form disable user command
        String command = AS400Utils.constructUpdateUserCommand(config_map);

        Map responseMap = new HashMap();
        // Execute disable user command
        if (sendCommand(connectToAS400(configData), command)) {
            //build and return a map as explained in the @return Map description with this method 
            responseMap.put("provisioningData", null);
        } else {
            throw new ConnectorException("Failed to disable account.");
        }

        return responseMap;
    }

    /**
     * to unlock account in the target system Example : to disable account in
     * the target system , refer to the below steps step 1 : retrieve connection
     * attributes from configData/Data step 2 : connect to the target system
     * step 3 : execute the query/process with the required input to disable
     * account in the target system step 4 : return the Map with metadata as
     * explained in parameter description
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM.This is for
     * future implementation hence set it to null for now Example:
     * map.put("provisioningData",null)
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map unLockAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
        //Connect to target System With Config data 
        //unLock Account in target System 
        Map map = new HashMap();
        //build and return a map as explained in the @return Map description with this method 
        //map.put("provisioningData",metadata map);
        return map;
    }

    /**
     * to enable account in the target system Example : to enable account in the
     * target system , refer to the below steps step 1 : retrieve connection
     * attributes from configData/Data step 2 : connect to the target system
     * step 3 : execute the query/process with the required input to enable
     * account in the target system step 4 : return the Map with metadata as
     * explained in parameter description
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM.This is for
     * future implementation hence set it to null for now Example:
     * map.put("provisioningData",null)
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map enableAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Enabling account");

        // Log the content of data map and mask the value of password field for debug purpose
        AS400Utils.printConfigData(data, "data");

        // Process configuration to replace binding variables and "inject" dynamic attributes
        Map<String, Object> config_map = porcessConfigJSON(configData, data, Constants.ENABLEACCOUNT_JSON);

        // Log configuration with binding variables resolved and password masked for debug purpose 
        AS400Utils.printConfigData(config_map, "Processed " + Constants.ENABLEACCOUNT_JSON);

        // Form enable user command
        String command = AS400Utils.constructUpdateUserCommand(config_map);

        Map responseMap = new HashMap();
        // Execute enable user command
        if (sendCommand(connectToAS400(configData), command)) {
            //build and return a map as explained in the @return Map description with this method 
            responseMap.put("provisioningData", null);
        } else {
            throw new ConnectorException("Failed to enable account.");
        }

        return responseMap;

    }

    /**
     * to terminate account in the target system Example : to terminate account
     * in the target system , refer to the below steps step 1 : retrieve
     * connection attributes from configData/Data step 2 : connect to the target
     * system step 3 : execute the query/process with the required input to
     * terminate account in the target system step 4 : return the number of
     * records updated
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return the integer number of accounts terminated
     * @throws ConnectorException the connector exception
     */
    @Override
    public Integer terminateAccount(Map<String, Object> configData, Map<String, Object> data)
            throws ConnectorException {
        // write your own logic to terminate the account in the target system
        return 1;
    }

    /**
     * to remove account in the target system Example : to remove account in the
     * target system , refer to the below steps step 1 : retrieve connection
     * attributes from configData/Data step 2 : connect to the target system
     * step 3 : execute the query/process with the required input to remove
     * account in the target system step 4 : return the Map with metadata as
     * explained in parameter description
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM.This is for
     * future implementation hence set it to null for now Example:
     * map.put("provisioningData",null)}
     *
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map removeAccount(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Remove account");

        // Log the content of data map and mask the value of password field for debug purpose
        AS400Utils.printConfigData(data, "data");

        // Process configuration to replace binding variables and "inject" dynamic attributes
        Map<String, Object> config_map = porcessConfigJSON(configData, data, Constants.REMOVEACCOUNT_JSON);

        // Log configuration with binding variables resolved and password masked for debug purpose 
        AS400Utils.printConfigData(config_map, "Processed " + Constants.REMOVEACCOUNT_JSON);

        //The is the account name of the account being processed. This is set by EIC during provisioning job invocation
        String accountName = data.get("accountName").toString();
        //LOGGER.info("accountName: " + accountName);

        // Handle the case of OWNOBJOPT
        String gpfName = null;
        String ownObjOpt = (String) config_map.get("OWNOBJOPT");

        /*
        if ( ownObjOpt == null || ownObjOpt.toUpperCase().startsWith("CHGOWN ") || ownObjOpt.toUpperCase().startsWith("*CHGOWN ")) {
            // If OWNOBJOPT isn't specified or OWNOBJOPT is specified with option CHGOWN without owner user profile name,
            // Or if PGPOPT is specified with option CHGPGP without user profile name,
            // we need to find user's group profile
            AS400Connection conn = connectToAS400(configData);
            try {
                User grpUser = new User(conn.getConnection(), accountName);
                gpfName = grpUser.getGroupProfileName();
                LOGGER.debug("Retrieved user: " + grpUser.getUserProfileName());
                LOGGER.debug("Retrieved user group profile: " + gpfName);
            } catch (AS400SecurityException | ErrorCompletingRequestException | InterruptedException | IOException | ObjectDoesNotExistException ex) {
                LOGGER.error(ex.getMessage());
                throw new ConnectorException("Cannot retrieve user profile: " + accountName);
            } finally {
                if (conn != null) {
                    conn.close();
                }
            }
        }*/

        if (ownObjOpt != null && (ownObjOpt.toUpperCase().startsWith("CHGOWN") || ownObjOpt.toUpperCase().startsWith("*CHGOWN"))) {
            // If OWNOBJOPT is specified and its value is *CHGOWN, let's find the user profile that to be deleted user's objects are assigned
            // First get to deleted user's group profile, if not found set to QDFTOWN instead
            AS400Connection conn = connectToAS400(configData);
            try {
                User grpUser = new User(conn.getConnection(), accountName);
                gpfName = grpUser.getGroupProfileName();
                LOGGER.debug("Retrieved user: " + grpUser.getUserProfileName());
                LOGGER.debug("Retrieved user group profile: " + gpfName);
            } catch (AS400SecurityException | ErrorCompletingRequestException | InterruptedException | IOException | ObjectDoesNotExistException ex) {
                LOGGER.error(ex.getMessage());
                throw new ConnectorException("Cannot retrieve user profile: " + accountName);
            } finally {
                if (conn != null) {
                    conn.close();
                }
            }
        }
        
        // Form AS400 user profile deletion command
        String command = AS400Utils.constructDeleteUserCommand(config_map, gpfName);

        Map responseMap = new HashMap();
        // Execute AS400 user deletion command
        if (sendCommand(connectToAS400(configData), command)) {
            //build and return a map as explained in the @return Map description with this method 
            responseMap.put("provisioningData", null);
        } else {
            throw new ConnectorException("Failed to delete account.");
        }

        return responseMap;
    }

    /**
     * to add access to account in the target system Example : to add access to
     * account in the target system , refer to the below steps step 1 : retrieve
     * connection attributes from configData/Data step 2 : connect to the target
     * system step 3 : execute the query/process with the required input to add
     * access to account in the target system step 4 : return the Map with
     * metadata as explained in parameter description
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM.This is for
     * future implementation hence set it to null for now Example:
     * map.put("provisioningData",null)
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map addAccessToAccount(Map<String, Object> configData, Map<String, Object> data)
            throws ConnectorException {
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Add entitlement to account");

        // Log the content of data map and mask the value of password field for debug purpose
        AS400Utils.printConfigData(data, "data");

        // Process configuration to replace binding variables and "inject" dynamic attributes
        Map<String, Object> config_map = porcessConfigJSON(configData, data, Constants.ADDACCESS_JSON);

        // Log configuration with binding variables resolved and password masked for debug purpose 
        AS400Utils.printConfigData(config_map, "Processed " + Constants.ADDACCESS_JSON);

        //The is the account name of the account being processed. This is set by EIC during provisioning job invocation
        String accountName = data.get("accountName").toString();
        //LOGGER.debug("accountName: " + accountName);

        String entvalue = (String) config_map.get(Constants.SAV_JSONATTR_GROUP);
        //LOGGER.debug("Entitlement to be added: " + entvalue);

        // We need to retrieve user's current supplemental groups so that we can append the new group into them
        AS400Connection conn = connectToAS400(configData);
        List<String> groups_array = new ArrayList<>();
        try {
            User user = new User(conn.getConnection(), accountName);
            String[] groups = user.getSupplementalGroups();
            LOGGER.debug("Retrieved supplemental groups: " + Arrays.toString(groups));

            if (groups.length > 0) {
                groups_array.addAll(Arrays.asList(groups));
            }

            if (!groups_array.contains(entvalue)) {
                groups_array.add(entvalue);
            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | InterruptedException | IOException | ObjectDoesNotExistException ex) {
            LOGGER.error(ex.getMessage());
            throw new ConnectorException("Cannot retrieve user profile: " + accountName);
        }

        // Form add group command
        String command = AS400Utils.constructUpdateGroupCommand(config_map, groups_array);

        Map responseMap = new HashMap();
        // Reuse the previous connection object and execute add group command
        if (sendCommand(conn, command)) {
            // We supposed to retrieve user profile again so that we can update Supplemental groups attribute
            // But update provisioningData isn't seem to be supported like createAccount method.
            // So, comment out the following block and set provisioningData to null instead

            /*
            //build and return a map as explained in the @return Map description with this method 
            Map<String, Object> attrs_map = AS400Utils.getAttributeMappings(configData, Constants.ACCOUNT_ATTRIBUTES_JSON);
            // If we reach this step that means user creation is successful. Let's retrieve user information from target directly.
            LOGGER.debug("Retrieving user name: " + accountName);

            // sendcommand method closes connection automatically, so we need to re-establish again
            AS400Connection newconn = connectToAS400(configData);
            try {
                User newuser = new User(newconn.getConnection(), accountName);

                //List<List<Map<String, Object>>> resultMap = provisioningReturnMap(config_map, account_attributes);
                Map<String, Object> resultMap = getResponseMetaData(newuser, attrs_map);
                //LOGGER.info("Return map: {}", resultMap);
                //Map which consists of metadata to be updated in SSM. Refer to the javadocs of this method for map format
                responseMap.put("provisioningData", resultMap);
            
            } catch (AS400SecurityException | ErrorCompletingRequestException | InterruptedException | IOException | ObjectDoesNotExistException ex) {
                LOGGER.error("Error retrieving user {} {}", accountName, ex.getMessage());
                throw new ConnectorException("Error retrieving user " + accountName + ". " + ex.getMessage());
            } finally {
                if (newconn != null) {
                    newconn.close();
                }
            }
             */
            //build and return a map as explained in the @return Map description with this method 
            responseMap.put("provisioningData", null);
        } else {
            throw new ConnectorException("Failed to add group to account.");
        }

        return responseMap;
    }

    /**
     * to remove access to account in the target system Example : to remove
     * access to account in the target system , refer to the below steps step 1
     * : retrieve connection attributes from configData/Data step 2 : connect to
     * the target system step 3 : execute the query/process with the required
     * input to remove access to account in the target system step 4 : return
     * the Map with metadata as explained in parameter description
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM.This is for
     * future implementation hence set it to null for now Example:
     * map.put("provisioningData",null)
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map removeAccessToAccount(Map<String, Object> configData, Map<String, Object> data)
            throws ConnectorException {
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Remove entitlement from account");

        // Log the content of data map and mask the value of password field for debug purpose
        AS400Utils.printConfigData(data, "data");

        // Process configuration to replace binding variables and "inject" dynamic attributes
        Map<String, Object> config_map = porcessConfigJSON(configData, data, Constants.REMOVEACCESS_JSON);

        // Log configuration with binding variables resolved and password masked for debug purpose 
        AS400Utils.printConfigData(config_map, "Processed " + Constants.REMOVEACCESS_JSON);

        //The is the account name of the account being processed. This is set by EIC during provisioning job invocation
        String accountName = data.get("accountName").toString();
        //LOGGER.debug("accountName: " + accountName);
        //EntitlementValues entObj = (EntitlementValues) data.get("entitlementValues");
        //String entvalue = entObj.getEntitlementvalue();
        String entvalue = (String) config_map.get(Constants.SAV_JSONATTR_GROUP);
        //LOGGER.debug("Entitlement to be removed: " + entvalue);

        List<String> groups_array = new ArrayList<>();
        // We need to retrieve user's current supplemental groups and remove the requested group from the list
        AS400Connection conn = connectToAS400(configData);
        try {
            User user = new User(conn.getConnection(), accountName);
            String[] groups = user.getSupplementalGroups();
            LOGGER.debug("Retrieved user groups: " + Arrays.toString(groups));

            if (groups.length > 0) {
                groups_array.addAll(Arrays.asList(groups));
            }

            if (groups_array.contains(entvalue)) {
                groups_array.remove(entvalue);
            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | InterruptedException | IOException | ObjectDoesNotExistException ex) {
            LOGGER.error(ex.getMessage());
            throw new ConnectorException("Cannot retrieve user profile: " + accountName);
        }

        // Form update group command
        String command = AS400Utils.constructUpdateGroupCommand(config_map, groups_array);

        Map responseMap = new HashMap();
        // Reuse the previous connection object and execute update group command
        if (sendCommand(conn, command)) {
            // We supposed to retrieve user profile again so that we can update Supplemental groups attribute
            // But update provisioningData isn't seem to be supported like createAccount method.
            // So, comment out the following block and set provisioningData to null instead

            /*
            //build and return a map as explained in the @return Map description with this method 
            Map<String, Object> attrs_map = AS400Utils.getAttributeMappings(configData, Constants.ACCOUNT_ATTRIBUTES_JSON);
            // If we reach this step that means user creation is successful. Let's retrieve user information from target directly.
            LOGGER.debug("Retrieving user name: " + accountName);

            // sendcommand method closes connection automatically, so we need to re-establish again
            AS400Connection newconn = connectToAS400(configData);
            try {
                User newuser = new User(newconn.getConnection(), accountName);

                //List<List<Map<String, Object>>> resultMap = provisioningReturnMap(config_map, account_attributes);
                Map<String, Object> resultMap = getResponseMetaData(newuser, attrs_map);
                //LOGGER.info("Return map: {}", resultMap);
                //Map which consists of metadata to be updated in SSM. Refer to the javadocs of this method for map format
                responseMap.put("provisioningData", resultMap);
            } catch (AS400SecurityException | ErrorCompletingRequestException | InterruptedException | IOException | ObjectDoesNotExistException ex) {
                LOGGER.error("Error retrieving user {} {}", accountName, ex.getMessage());
                throw new ConnectorException("Error retrieving user " + accountName + ". " + ex.getMessage());
            } finally {
                if (newconn != null) {
                    newconn.close();
                }
            }
             */
            //build and return a map as explained in the @return Map description with this method
            responseMap.put("provisioningData", null);
        } else {
            throw new ConnectorException("Failed to remove group from account.");
        }

        return responseMap;
    }

    /**
     * to change password in the target system Example : to change password in
     * the target system , refer to the below steps step 1 : retrieve connection
     * attributes from configData/Data step 2 : connect to the target system
     * step 3 : execute the query/process with the required input to change
     * password in the target system step 4 : return true if successful
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return the boolean true or false
     * @throws ConnectorException the connector exception
     */
    @Override
    public Boolean changePassword(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
        // write your logic to change password in the target system
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Change password");

        // Log the content of data map and mask the value of password field for debug purpose
        AS400Utils.printConfigData(data, "data");

        // Process configuration to replace binding variables and "inject" dynamic attributes
        Map<String, Object> config_map = porcessConfigJSON(configData, data, Constants.CHANGECREDENTIAL_JSON);

        // Log configuration with binding variables resolved and password masked for debug purpose 
        AS400Utils.printConfigData(config_map, "Processed " + Constants.CHANGECREDENTIAL_JSON);

        // Form change user password command
        String command = AS400Utils.constructChangePasswordCommand(config_map);

        boolean success = false;
        // Execute change password command
        if (sendCommand(connectToAS400(configData), command)) {
            //build and return a map as explained in the @return Map description with this method 
            //map.put("provisioningData",metadata map);
            success = true;
        } else {
            throw new ConnectorException("Failed to change account password.");
        }
        return success;
    }

    /**
     * to create user in the target system Example : to create user in the
     * target system , refer to the below steps step 1 : retrieve connection
     * attributes from configData/Data step 2 : connect to the target system
     * step 3 : execute the query/process with the required input to create user
     * in the target system step 4 : return true if successful
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return the boolean true or false
     * @throws ConnectorException the connector exception
     */
    @Override
    public Boolean createUser(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Creating user");
        // write your own logic to create user in the target system
        return true;
    }

    /**
     * to update user in the target system Example : to update user in the
     * target system , refer to the below steps step 1 : retrieve connection
     * attributes from configData/Data step 2 : connect to the target system
     * step 3 : execute the query/process with the required input to update user
     * in the target system step 4 : return the number of records updated
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return the integer number of users updated
     * @throws ConnectorException the connector exception
     */
    @Override
    public Integer updateUser(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {
        // write your own logic to update user in the target system
        return 1;
    }

    /**
     * to create the entitlement in target system Example : to create
     * entitlement in the target system , refer to the below steps step 1 :
     * retrieve connection attributes from configData/Data step 2 : connect to
     * the target system step 3 : execute the query/process with the required
     * input to create entitlement in the target system step 4 : return the Map
     * with metadata as explained in parameter description
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM (metadata
     * built with help of reconcile json mapping). Metadata is nothing but set
     * of properties from the target system to be updated in SSM for that
     * account. Example:Match the corresponding column of SSM with target system
     * data and build sampleMetadata. map sampleMetadata to provisioningData key
     * in the result map as below and return
     * map.put("provisioningData",sampleMetadata) metadata sample format :
     * {ENTITLEMENT.COLUMNNAME1=XXXX, ENTITLEMENT.COLUMNNAME2=XXXX,
     * ENTITLEMENT.COLUMNNAME3=XXXX}
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map createEntitlement(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {//Connect to target System With Config data 
        // create Entitlement in target System 
        Map map = new HashMap();
        //build and return a map as explained in the @return Map description with this method 
        //map.put("provisioningData",metadata map);
        return map;
    }

    /**
     * to update the entitlement in target system Example : to update
     * entitlement in the target system , refer to the below steps step 1 :
     * retrieve connection attributes from configData/Data step 2 : connect to
     * the target system step 3 : execute the query/process with the required
     * input to update entitlement in the target system step 4 : return the Map
     * with metadata as explained in parameter description
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM (metadata
     * built with help of reconcile json mapping). Metadata is nothing but set
     * of properties from the target system to be updated in SSM for that
     * account. Example:Match the corresponding column of SSM with target system
     * data and build sampleMetadata. map sampleMetadata to provisioningData key
     * in the result map as below and return
     * map.put("provisioningData",sampleMetadata) metadata sample format :
     * {ENTITLEMENT.COLUMNNAME1=XXXX, ENTITLEMENT.COLUMNNAME2=XXXX,
     * ENTITLEMENT.COLUMNNAME3=XXXX}
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map updateEntitlement(Map<String, Object> configData, Map<String, Object> data) throws ConnectorException {//Connect to target System With Config data 
        // update Entitlement in target System 
        Map map = new HashMap();
        //build and return a map as explained in the @return Map description with this method 
        //map.put("provisioningData",metadata map);
        return map;
    }

    /**
     * to validate credentials of the given input from connection Example : to
     * validate credentials in the target system , refer to the below steps step
     * 1 : retrieve connection attributes from configData/Data step 2 : connect
     * to the target system step 3 : execute the query/process with the required
     * input to validate credentials in the target system step 4 : return true
     * if successful, false if failure
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return the boolean true or false
     * @throws ConnectorException the connector exception
     */
    @Override
    public Boolean validateCredentials(Map<String, Object> configData, Map<String, Object> data)
            throws ConnectorException {
        // write your own logic to validate credentials set in configData with the target system
        return true;
    }

    /**
     * This is for future implementation hence ignore it for now to get the
     * summary of number of records for the given input object such as
     * accounts.It provides number of accounts,users etc
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return the summary map with object and count as key ,value
     */
    @Override
    public Map<String, Object> getSummary(Map<String, Object> configData, Map<String, Object> data) {
        //write your logic
        Map<String, Object> map = new HashMap<String, Object>();
        //fetch account data
        //map.put("Account", 10);
        return map;
    }

    /**
     * to remove access to entitlements in the target system Example : to remove
     * access to entitlements in the target system , refer to the below steps
     * step 1 : retrieve connection attributes from configData/Data step 2 :
     * connect to the target system step 3 : execute the query/process with the
     * required input to add access to account in the target system step 4 :
     * return true if successful, false if failure
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return boolean true or false which indicates success or failure
     * @throws ConnectorException the connector exception
     */
    @Override
    public Boolean removeEntitlement(Map<String, Object> configData, Map<String, Object> data)
            throws ConnectorException {
        //write your own logic to remove Entitlement in target System 
        return true;
    }

    /**
     * to add access to entitlements in the target system Example : to add
     * access to entitlements in the target system , refer to the below steps
     * step 1 : retrieve connection attributes from configData/Data step 2 :
     * connect to the target system step 3 : execute the query/process with the
     * required input to add access to account in the target system step 4 :
     * return true if successful, false if failure
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return boolean true or false which indicates success or failure
     * @throws ConnectorException the connector exception
     */
    @Override
    public Boolean addAccessToEntitlement(Map<String, Object> configData, Map<String, Object> data)
            throws ConnectorException {
        //write your own logic to add Access to Entitlement in target System 
        return true;
    }

    /**
     * to remove access to entitlements in the target system Example : to remove
     * access to entitlements in the target system , refer to the below steps
     * step 1 : retrieve connection attributes from configData/Data step 2 :
     * connect to the target system step 3 : execute the query/process with the
     * required input to add access to account in the target system step 4 :
     * return true if successful, false if failure
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Boolean true or false which indicates success or failure
     * @throws ConnectorException the connector exception
     */
    @Override
    public Boolean removeAccessToEntitlement(Map<String, Object> configData, Map<String, Object> data)
            throws ConnectorException {
        // remove access Entitlement in target System 
        //Return
        return true;
    }

    /**
     * to provide the firefighterId access to a system/application in target
     * system for the input create account connection attributes of connection
     * configuration in SSM provisioningData sample format: {null} Example : to
     * add firefighterIdGrantAccess(firefighterIdGrantAccess is invoked when
     * provisioning job is triggered in SSM) to account in the target system ,
     * refer to the below steps step 1 : retrieve connection attributes from
     * configData/Data step 2 : connect to the target system step 3 : execute
     * the process with the required input to add access in the target system
     * step 4 : return the map with metadata
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM.This is for
     * future implementation hence set it to null for now Example:
     * map.put("provisioningData",null)
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map firefighterIdGrantAccess(Map<String, Object> configData, Map<String, Object> data)
            throws ConnectorException {//Connect to target System With Config data 

        //write your own logic to grant firefighterId Access in target System 
        Map map = new HashMap();
        //return null in below Map   
        map.put("provisioningData", null);

        return map;
    }

    /**
     * to remove the firefighterId access to a system/application in target
     * system for the input create account connection attributes of connection
     * configuration in SSM provisioningData sample format: {null} Example : to
     * revoke firefighteridaccess(firefighterIdRevokeAccess is invoked when
     * provisioning job is triggered in SSM) to account in the target system ,
     * refer to the below steps step 1 : retrieve connection attributes from
     * configData/Data step 2 : connect to the target system step 3 : execute
     * the process with the required input to revoke access in the target system
     * step 4 : return the map with metadata
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM.This is for
     * future implementation hence set it to null for now Example:
     * map.put("provisioningData",null)
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map firefighterIdRevokeAccess(Map<String, Object> configData, Map<String, Object> data)
            throws ConnectorException {//Connect to target System With Config data 

        //write your own logic to revoke firefighterId Access in target System 
        Map map = new HashMap();
        //return null in below Map   
        map.put("provisioningData", null);

        return map;
    }

    /**
     * to provide the firefighterId instance access to a system/application in
     * target system for the input create account connection attributes of
     * connection configuration in SSM provisioningData sample format: {null}
     * Example : to provide
     * firefighterIdInstanceGrantAccess(firefighterIdInstanceGrantAccess is
     * invoked immediately upon the task creation in SSM) to account in the
     * target system , refer to the below steps step 1 : retrieve connection
     * attributes from configData/Data step 2 : connect to the target system
     * step 3 : execute the process with the required input to add access in the
     * target system step 4 : return the map with metadata
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM.This is for
     * future implementation hence set it to null for now Example:
     * map.put("provisioningData",null)
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map firefighterIdInstanceGrantAccess(Map<String, Object> configData, Map<String, Object> data)
            throws ConnectorException {//Connect to target System With Config data 

        //write your own logic to grant firefighterIdInstance Access in target System 
        Map map = new HashMap();
        //return null in below Map   
        map.put("provisioningData", null);

        return map;
    }

    /**
     * to remove the firefighterId instance access to a system/application in
     * target system for the input create account connection attributes of
     * connection configuration in SSM provisioningData sample format: {null}
     * Example : to revoke
     * firefighteridInstanceaccess(firefighterIdInstanceRevokeAccess is invoked
     * immediately upon the task creation in SSM) to account in the target
     * system , refer to the below steps step 1 : retrieve connection attributes
     * from configData/Data step 2 : connect to the target system step 3 :
     * execute the process with the required input to revoke access in the
     * target system step 4 : return the map with metadata
     *
     * @param configData the configData This is a metadata that contains the
     * details of the information required and configurations needed for
     * establishing the connectivity to the target system and for doing
     * provisioning and reconciliation operations. This is defined in
     * setConfig().These appear as JSON or fields on the UI that have to be
     * input at the time of creating the connection for this connector in SSM
     * @param data contains the values (input details) of the JSON
     * attributes/fields specified at the time of creating the connection for
     * this connector in SSM UI. current user/task/entitlement/account data
     * referred in input JSON are dynamically populated at the runtime. Along
     * with connection attributes, this parameter also contains some additional
     * information (key value pairs) that can be used during
     * provisioning,reconciliation etc. e.g IMPORTABLE_OBJECT - This signifies
     * whether account recon or user recon is happening. Valid values
     * ("ACCOUNT","USER") endpointId - contains endpoint Id for the endpoint
     * corresponding to this connector
     * @return Map which consists of metadata to be updated in SSM.This is for
     * future implementation hence set it to null for now Example:
     * map.put("provisioningData",null)
     * @throws ConnectorException the connector exception
     */
    @Override
    public Map firefighterIdInstanceRevokeAccess(Map<String, Object> configData, Map<String, Object> data)
            throws ConnectorException {//Connect to target System With Config data 

        //write your own logic to  revoke access to firefighterId Instance  in target System 
        Map map = new HashMap();
        //return null in below Map   
        map.put("provisioningData", null);

        return map;
    }

}
