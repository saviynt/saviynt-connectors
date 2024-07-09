package com.saviynt.connectorms.as400;

import com.ibm.as400.access.User;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Map;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import java.util.List;
import org.slf4j.LoggerFactory;
import com.saviynt.connectorms.as400.util.Constants;
import com.saviynt.connectorms.as400.util.RandomPasswordGenerator;
import com.saviynt.connectorms.as400.util.PasswordPolicy;
import com.saviynt.ssm.abstractConnector.exceptions.ConnectorException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author marcozhang
 */
public class AS400Utils {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(AS400Utils.class.getName());

    protected static String constructCreateUserCommand(Map<String, Object> attributes) {
        LOGGER.setLevel(Level.ALL);

        String command = "CRTUSRPRF";

        if (attributes != null) {
            String accountName = (String) attributes.get("USRPRF");
            command += " USRPRF(" + accountName + ")";
            String attribList = constructUserAttributeParameters(attributes);
            if (attribList.length() > 0) {
                command += " " + attribList;
            }
        }

        return command;
    }

    protected static String constructUpdateUserCommand(Map<String, Object> attributes) {
        LOGGER.setLevel(Level.ALL);
        String command = "CHGUSRPRF";

        if (attributes != null) {
            String accountName = (String) attributes.get("USRPRF");
            command += " USRPRF(" + accountName + ")";
            String attribList = constructUserAttributeParameters(attributes);
            if (attribList.length() > 0) {
                command += " " + attribList;
            }
        }

        return command;
    }

    protected static String constructDeleteUserCommand(Map<String, Object> attributes, String gpfName) {
        LOGGER.setLevel(Level.ALL);
        String command = "DLTUSRPRF";

        if (attributes != null) {
            String accountName = (String) attributes.get("USRPRF");
            command += " USRPRF(" + accountName + ")";
            String attribList = constructDeleteUserAttributeParameters(attributes, gpfName);
            if (attribList.length() > 0) {
                command += " " + attribList;
            }
        }

        return command;
    }

    protected static String constructUpdateGroupCommand(Map<String, Object> attributes, List<String> groups) {
        LOGGER.setLevel(Level.ALL);
        String command = "CHGUSRPRF";

        if (attributes != null) {
            String accountName = (String) attributes.get("USRPRF");
            command += " USRPRF(" + accountName + ")";
            String attribList = constructUserAttributeParameters(attributes);
            if (attribList.length() > 0) {
                command += " " + attribList;
            }
        }
        command += " SUPGRPPRF(" + String.join(" ", groups) + ")";

        return command;
    }

    protected static String constructChangePasswordCommand(Map<String, Object> attributes) {
        LOGGER.setLevel(Level.ALL);
        String command = "CHGUSRPRF";

        if (attributes != null) {
            String accountName = (String) attributes.get("USRPRF");
            String password = (String) attributes.get(Constants.SAV_JSONATTR_NEWPASSWORD);
            command += " USRPRF(" + accountName + ") PASSWORD(" + password + ")";

        }

        return command;
    }

    /**
     * Builds a list of parameters appropriate for the resource to either create
     * or update user.
     *
     * @return a complete formatted parameter list for use in creating users
     * @param attributes get the parameter values from attribute mapping
     */
    protected static String constructUserAttributeParameters(Map<String, Object> attributes) {
        StringBuilder paramList = new StringBuilder();

        int i = 0;
        int size = attributes.size();
        for (Map.Entry<String, Object> attribute : attributes.entrySet()) {
            i++;
            String attrName = attribute.getKey();
            Object attrValue = attribute.getValue();
            //LOGGER.info("attrName: " + attrName + " attrValue: " + attrValue.toString());
            // Only put the parameter into command if its allowed and its value isn't empty
            if (isAllowableCreateUserAttribute(attrName) && attrValue != null && !attrValue.toString().trim().isEmpty()) {
                String cmd_attr = constructUserAttributeParameter(attrName, attrValue.toString());
                paramList.append(cmd_attr);
                if (i < size) {
                    paramList.append(" ");
                }
                //LOGGER.info("paramList: " + paramList);
            }

        }

        return paramList.toString();
    }

    /**
     * Builds a list of parameters appropriate for the resource to either delete
     * user.
     *
     * @return a complete formatted parameter list for use in creating users
     * @param attributes get the parameter values from attribute mapping
     * @param gpfName get the parameter values for group profile name of the
     * user to be deleted
     */
    protected static String constructDeleteUserAttributeParameters(Map<String, Object> attributes, String gpfName) {
        StringBuilder paramList = new StringBuilder();

        String ownObjOpt = (String) attributes.get(Constants.OPT_OWNOBJOPT);
        if (ownObjOpt != null && !ownObjOpt.isEmpty()) {
            String objectInheritor = null;

            if (ownObjOpt.equalsIgnoreCase("NODLT") || ownObjOpt.equalsIgnoreCase("*NODLT")) {
                paramList.append("OWNOBJOPT(*NODLT)");
            } else if (ownObjOpt.equalsIgnoreCase("DLT") || ownObjOpt.equalsIgnoreCase("*DLT")) {
                paramList.append("OWNOBJOPT(*DLT)");
            } else if (ownObjOpt.toUpperCase().startsWith("CHGOWN") || ownObjOpt.toUpperCase().startsWith("*CHGOWN")) {
                // See if a user profile name is specified after CHGOWN option.
                // If so use the profile name specified
                String[] opts = ownObjOpt.split("\\s+");
                if (opts.length == 2) {
                    objectInheritor = opts[1];
                } else {
                    if (gpfName != null && !gpfName.equalsIgnoreCase("*NONE")) {
                        objectInheritor = gpfName;
                    } else {
                        // If *CHGOWN is specified without following by a owner name, and user's doesn't have group profile assigned
                        // throws error
                        LOGGER.error("GRPPRF required for CHGOWN Option");
                        throw new ConnectorException("GRPPRF required for CHGOWN Option");
                    }
                }
                paramList.append("OWNOBJOPT(*CHGOWN ").append(objectInheritor).append(")");
            }

        } else {
            // we don't want to orphan the user's objects so we make sure someone inherits them.
            // First we see if they have a group profile. If so we reassign user's objects to the
            // group profile. if not we reassign user's objects to default owner
            String objectInheritor = gpfName;
            if (objectInheritor == null || objectInheritor.equalsIgnoreCase("*NONE")) {
                objectInheritor = "QDFTOWN";
            }
            paramList.append("OWNOBJOPT(*CHGOWN ").append(objectInheritor).append(")");
        }
        
        String pgpOpt = (String) attributes.get(Constants.OPT_PGPOPT);
        if (pgpOpt != null && !pgpOpt.isEmpty()) {
            String objectInheritor = null;
            // If OWNOBJOPT is already added the command parameter, let's add a space for cater for PGPOPT option
            if (paramList.lastIndexOf("OWNOBJOPT") != -1) {
                paramList.append(" ");
            }
            if (pgpOpt.equalsIgnoreCase("NOCHG") || pgpOpt.equalsIgnoreCase("*NOCHG")) {
                paramList.append("PGPOPT(*NOCHG)");
            } else if (pgpOpt.toUpperCase().startsWith("CHGPGP") || pgpOpt.toUpperCase().startsWith("*CHGPGP")) {
                String[] opts = pgpOpt.split("\\s+");
                if (opts.length == 2) {
                    objectInheritor = opts[1];
                } else {
                    LOGGER.error("Missing user profile name for PGPOPT Option");
                    throw new ConnectorException("Missing user profile name for PGPOPT Option");
                }
                paramList.append("PGPOPT(*CHGPGP ").append(objectInheritor).append(")");
            }
        }

        return paramList.toString();
    }

    /**
     * Reports whether a given attribute name is legal on the create. This is
     * useful for implementing either exclusion lists, or inclusion lists.
     *
     * @return true if attribute is allowable for user creation, false if not
     * @param name the name of the attribute to check
     */
    protected static boolean isAllowableCreateUserAttribute(String name) {
        // Verify if the attribute is valid for create user profile command
        return !name.equalsIgnoreCase(Constants.OPT_USRPRF)
                //&& !name.equalsIgnoreCase(OPT_PASSWORD)
                && !name.equalsIgnoreCase("Group")
                && !name.equalsIgnoreCase(Constants.OPT_PASSWORDLASTCHANGEDDATE)
                && !name.equalsIgnoreCase(Constants.OPT_SIGNEDONATTEMPTSNOTVALID);
    }

    /**
     * Builds a AS400 compatible command argument.
     *
     * @return a single formatted key value parameter option
     * @param key the parameter name
     * @param value the parameter value
     */
    protected static String constructUserAttributeParameter(String key, String value) {
        if (value == null) {
            return "";
        }
        String param;
        /*
        if (key.equalsIgnoreCase(Constants.OPT_TEXT)) {
            param = key.toUpperCase() + "('" + value + "')";
        } else {
            param = key.toUpperCase() + "(" + value + ")";
        }
        */

        switch (key.toUpperCase()) {
            case Constants.OPT_TEXT:
                // If this TEXT attribute, we need to quote the value string to cater for space
                // The command string should look like TEXT('description text...')
                param = key.toUpperCase() + "('" + value + "')";
                break;
            case Constants.OPT_SPCAUT:
            case Constants.OPT_SETJOBATR:
            case Constants.OPT_USROPT:
                // If this is SPCAUT, SETJOBATR or USROPT attribute, we expect comma-separated string like "*ALLOBJ,*JOBCTL"
                // The command string should look like SPCAUT(*ALLOBJ *JOBCTL)
                String[] arr = value.split(",");
                ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
                param = key.toUpperCase() + "(" + String.join(" ", list) + ")";
                break;
            default:
                // For the rest of attribute with single value
                // The command string should look like STATUS(*ENABLE)
                param = key.toUpperCase() + "(" + value + ")";
        }
        
        return param;
    }

    protected static Object getParamValue(User u, String param) {
        Object value = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //System.out.println("as400ParamName: " + param.toUpperCase());
        //LOGGER.info("as400ParamName: " + param.toUpperCase());
        if (u != null && param != null) {
            switch (param.toUpperCase()) {
                case Constants.OPT_USRPRF:
                    value = u.getUserProfileName();
                    break;
                case Constants.OPT_UID:
                    value = Long.toString(u.getUserID());
                    break;
                case Constants.OPT_TEXT:
                    value = u.getDescription();
                    break;
                case Constants.OPT_PREVIOUSSIGNEDONDATE:
                    if (u.getPreviousSignedOnDate() != null) {
                        value = dateFormat.format(u.getPreviousSignedOnDate());
                    }
                    break;
                case Constants.OPT_PASSWORDLASTCHANGEDDATE:
                    if (u.getPasswordLastChangedDate() != null) {
                        value = dateFormat.format(u.getPasswordLastChangedDate());
                    }
                    break;
                case Constants.OPT_SIGNEDONATTEMPTSNOTVALID:
                    value = Integer.toString(u.getSignedOnAttemptsNotValid());
                    break;
                case Constants.OPT_USREXPDATE:
                    if (u.getUserExpirationDate() != null) {
                        value = dateFormat.format(u.getUserExpirationDate());
                    }
                    break;
                case Constants.OPT_USRCLS:
                    value = u.getUserClassName();
                    break;
                case Constants.OPT_ASTLVL:
                    value = u.getAssistanceLevel();
                    break;
                case Constants.OPT_CURLIB:
                    value = u.getCurrentLibraryName();
                    break;
                case Constants.OPT_INLPGM:
                    value = u.getInitialProgram();
                    break;
                case Constants.OPT_INLMNU:
                    value = u.getInitialMenu();
                    break;
                case Constants.OPT_LMTCPB:
                    value = u.getLimitCapabilities();
                    break;
                case Constants.OPT_SPCAUT:
                    value = Arrays.toString(u.getSpecialAuthority());
                    break;
                case Constants.OPT_SPCENV:
                    value = u.getSpecialEnvironment();
                    break;
                case Constants.OPT_DSPSGNINF:
                    value = u.getDisplaySignOnInformation();
                    break;
                case Constants.OPT_PWDEXPITV:
                    value = Integer.toString(u.getPasswordExpirationInterval());
                    break;
                case Constants.OPT_PWDCHGBLK:
                    value = u.getPasswordChangeBlock();
                    break;
                case Constants.OPT_LMTDEVSSN:
                    value = u.getLimitDeviceSessions();
                    break;
                case Constants.OPT_KBDBUF:
                    value = u.getKeyboardBuffering();
                    break;
                case Constants.OPT_MAXSTG:
                    value = Integer.toString(u.getMaximumStorageAllowed());
                    break;
                case Constants.OPT_MAXSTGLRG:
                    value = Long.toString(u.getMaximumStorageAllowedInLong());
                    break;
                case Constants.OPT_OWNER:
                    value = u.getOwner();
                    break;
                case Constants.OPT_GRPAUT:
                    value = u.getGroupAuthority();
                    break;
                case Constants.OPT_GRPAUTTYP:
                    value = u.getGroupAuthorityType();
                    break;
                case Constants.OPT_GRPPRF:
                    value = u.getGroupProfileName();
                    break;
                case Constants.OPT_SUPGRPPRF:
                    value = Arrays.toString(u.getSupplementalGroups());
                    break;
                case Constants.OPT_ACGCDE:
                    value = u.getAccountingCode();
                    break;
                case Constants.OPT_MSGQ:
                    value = u.getMessageQueue();
                    break;
                case Constants.OPT_PRTDEV:
                    value = u.getPrintDevice();
                    break;
                case Constants.OPT_OUTQ:
                    value = u.getOutputQueue();
                    break;
                case Constants.OPT_ATNPGM:
                    value = u.getAttentionKeyHandlingProgram();
                    break;
                case Constants.OPT_SRTSEQ:
                    value = u.getSortSequenceTable();
                    break;
                case Constants.OPT_LANGID:
                    value = u.getLanguageID();
                    break;
                case Constants.OPT_CNTRYID:
                    value = u.getCountryID();
                    break;
                case Constants.OPT_CCSID:
                    value = Integer.toString(u.getCCSID());
                    break;
                case Constants.OPT_CHRIDCTL:
                    value = u.getCHRIDControl();
                    break;
                case Constants.OPT_STATUS:
                    value = u.getStatus();
                    break;
                case Constants.OPT_SETJOBATR:
                    value = Arrays.toString(u.getLocaleJobAttributes());
                    break;
                case Constants.OPT_LOCALE:
                    value = u.getLocalePathName();
                    break;
                case Constants.OPT_USROPT:
                    value = Arrays.toString(u.getUserOptions());
                    break;
                case Constants.OPT_GID:
                    value = Long.toString(u.getGroupID());
                    break;
                case Constants.OPT_HOMEDIR:
                    value = u.getHomeDirectory();
                    break;
                case Constants.OPT_USREXPITV:
                    value = Integer.toString(u.getUserExpirationInterval());
                    break;
                case Constants.OPT_JOBD:
                    value = u.getJobDescription();
                    break;
                case Constants.OPT_PTYLMT:
                    value = Integer.toString(u.getHighestSchedulingPriority());
                default:
            }
        }

        return value;
    }

    public static Map<String, Object> uppercaseMapKey(Map<String, Object> map) {
        Map<String, Object> newmap = new HashMap();
        for (Map.Entry<String, Object> attribute : map.entrySet()) {
            String key = attribute.getKey();
            String value = (String) attribute.getValue();
            newmap.put(key.toUpperCase(), value);
        }

        return newmap;
    }

    public static Map<String, Object> getAttributeMappings(Map<String, Object> configData, String jsonConfigName) {
        // Get account or group attributes configuration
        Object attributes_config = configData.get(jsonConfigName);
        // Initiaise json to avoid null pointer exception
        JSONObject attributes_json = new JSONObject();
        if (attributes_config != null && !attributes_config.toString().isEmpty()) {
            try {
                attributes_json = new JSONObject(attributes_config.toString());
            } catch (JSONException ex) {
                LOGGER.debug("Json format error in " + jsonConfigName + ". " + ex.getMessage());
                throw new ConnectorException("Json format error in " + jsonConfigName + ". " + ex.getMessage());
            }
        }

        // Retrieve colsToPropsMap section of the account or group configuration
        Map<String, Object> orig_attributes_map = attributes_json.has(Constants.COLSTOPROPSMAP) ? attributes_json.getJSONObject(Constants.COLSTOPROPSMAP).toMap() : new HashMap();
        
        // Convert EIC account or entitlement property names to upper case to avoid poential property not found issue
        Map<String, Object> attributes_map = uppercaseMapKey(orig_attributes_map);
        //LOGGER.info("{} attributes_map: {}", jsonConfigName, attributes_map);

        return attributes_map;
    }

    /*
    * if dynamic attributes are defined for the endpoint, they appear in data object when account creation task is created from request.
    * However, dynamic attributes aren't in data object if account creation task is created from birthright rule. This will cause exception 
    * during execution of the task when GroovyService.convertTemplateToString is invoked.
    * To workaround the issue, we need to define all dynamic attributes in the connection configuration and "inject" them into data object.
    *    DynamicAttributesJSON is in the following format
    *        {
    *            "d_USRCLS": "",
    *            "d_ASTLVL": ""
    *        }
     */
    public static Map<String, Object> addDynamicAttributes(Map<String, Object> configData, Map<String, Object> data) {
        Map<String, Object> newdata = data;

        // Retrieve dynamic attribute names from DynamicAttributesJSON configuration
        Object dynamicAttributes_config = configData.get(Constants.DYNAMICATTRIBUTES_JSON);
        //Convert json string to map
        JSONObject dynamicAttributes_json = new JSONObject();
        if (dynamicAttributes_config != null && !dynamicAttributes_config.toString().isEmpty()) {
            try {
                dynamicAttributes_json = new JSONObject(dynamicAttributes_config.toString());
            } catch (JSONException ex) {
                LOGGER.debug("Json format error in " + Constants.DYNAMICATTRIBUTES_JSON + ". " + ex.getMessage());
                throw new ConnectorException("Json format error in " + Constants.DYNAMICATTRIBUTES_JSON + ". " + ex.getMessage());
            }
        }
        Map<String, Object> dynamicAttributes_map = dynamicAttributes_json.toMap();

        for (Map.Entry<String, Object> attribute : dynamicAttributes_map.entrySet()) {
            String key = attribute.getKey();
            // Test if the dynamic attribute already exist. If so, do nothing
            if (!newdata.containsKey(key)) {
                newdata.put(key, attribute.getValue());
            }
        }

        return newdata;
    }

    /*
    * Print configData and data objects and mask sensitive value
     */
    protected static void printConfigData(Map<String, Object> data, String mapName) {
        LOGGER.debug("###### {} map ######", mapName);
        for (Map.Entry<String, Object> attribute : data.entrySet()) {
            String key = attribute.getKey();
            Object value = attribute.getValue();
            Object output = value;

            if (key.equalsIgnoreCase("Password") || key.equalsIgnoreCase("randomPassword") || key.equalsIgnoreCase("newAccountPassword")) {
                // If it sensitive data mask the value
                output = "*****";
            } else {
                // If it is json string, convert it beforing printing
                try {
                    JSONObject jsonObject = new JSONObject(value.toString());
                    output = jsonObject.toString();
                } catch (JSONException ex) {
                    // do nothing
                }
            }
            LOGGER.debug(key + " = " + output);
        }
    }

    public static String generatePassword(Map<String, Object> configData) {
        Object pwdPolicy_config = configData.get(Constants.PASSWORDPOLICY_JSON);
        JSONObject pwdPolicy_json = new JSONObject();

        if (pwdPolicy_config != null && !pwdPolicy_config.toString().isEmpty()) {
            try {
                pwdPolicy_json = new JSONObject(pwdPolicy_config.toString());
            } catch (JSONException ex) {
                LOGGER.debug("Json format error in " + Constants.PASSWORDPOLICY_JSON + ". " + ex.getMessage());
                throw new ConnectorException("Json format error in " + Constants.PASSWORDPOLICY_JSON + ". " + ex.getMessage());
            }
        }
        
        Map<String, Object> pwdPolicy_map = pwdPolicy_json.toMap();
        int minLength = (int) pwdPolicy_map.getOrDefault(Constants.PWD_POLICY_MINLENGTH, 8);
        int maxLength = (int) pwdPolicy_map.getOrDefault(Constants.PWD_POLICY_MAXLENGTH, 10);
        int minNumeric = (int) pwdPolicy_map.getOrDefault(Constants.PWD_POLICY_MINNUMERIC, 1);
        int minLower = (int) pwdPolicy_map.getOrDefault(Constants.PWD_POLICY_MINLOWER, 1);
        int minUpper = (int) pwdPolicy_map.getOrDefault(Constants.PWD_POLICY_MINUPPER, 1);
        int minSpec = (int) pwdPolicy_map.getOrDefault(Constants.PWD_POLICY_MINSPECIAL, 1);
        int maxRepeat = (int) pwdPolicy_map.getOrDefault(Constants.PWD_POLICY_MAXREPEATED, 2);
        String specialChars = (String) pwdPolicy_map.getOrDefault(Constants.PWD_POLICY_SPECIALCHARS, "!@#$%^&*_=+-/");
        boolean allowfirst = (boolean) pwdPolicy_map.getOrDefault(Constants.PWD_POLICY_ALLOWFIRSTDIGITORSPECIAL, false);
        /*
            PasswordGenerator pwdGen = new PasswordGenerator();
            pwdGen.setSPLCHARS(specialChars);
            pwd = pwdGen.generatePassword(minLength, maxLength, minLower, minUpper, minNumeric, minSpec);
         */
        PasswordPolicy customPolicy = new PasswordPolicy();
        customPolicy.setMinLength(minLength);
        customPolicy.setMaxLength(maxLength);
        customPolicy.setMinLowercase(minLower);
        customPolicy.setMinUppercase(minUpper);
        customPolicy.setMinDigits(minNumeric);
        customPolicy.setMinSpecialChars(minSpec);
        customPolicy.setMaxRepeatedChars(2);
        customPolicy.setSpecialCharacters(specialChars);
        customPolicy.setMaxRepeatedChars(maxRepeat);
        customPolicy.setAllowFirstDigitOrSpeicalChar(allowfirst);
        String pwd = RandomPasswordGenerator.generatePassword(customPolicy);

        return pwd;
    }

    /*
    * Mask password in the command
     */
    public static String maskPassword(String inputString) {
        // Regex to find the PASSWORD field
        Pattern pattern = Pattern.compile("PASSWORD\\(([^)]+)\\)");
        Matcher matcher = pattern.matcher(inputString);

        // Buffer to build the result
        StringBuffer result = new StringBuffer();

        // Iterate over all matches
        while (matcher.find()) {
            // Replace the password with fixed mask of asterisks
            matcher.appendReplacement(result, "PASSWORD(******)");
        }
        // Append the tail of the input string
        matcher.appendTail(result);

        return result.toString();
    }

}
