package com.saviynt.connectorms.as400.util;

public class Constants {
    // Contstants used by connector configuration
    public static final String HOSTNAME = "Host";
    public static final String USERNAME = "Username";
    public static final String PASSWORD = "Password";
    public static final String USESSL = "useSSL";
    public static final String ENTITLEMENT_TYPE_GROUP = "Group";
    public static final String ACCOUNT_PREFIX = "ACCOUNT.";
    public static final String ENTITLEMENT_PREFIX = "ENTITLEMENT.";
    public static final String ACCOUNT_ATTRIBUTES_JSON = "AccountAttributesJSON";
    public static final String GROUP_ATTRIBUTES_JSON = "GroupAttributesJSON";
    public static final String COLSTOPROPSMAP = "colsToPropsMap";
    public static final String RESPCOLSTOPROPSMAP = "responseColsToPropsMap";
    public static final String COMMAND_ATTRIBUTES = "commandAttributes";
    public static final String CREATEACCOUNT_JSON = "CreateAccountJSON";
    public static final String UPDATEACCOUNT_JSON = "UpdateAccountJSON";
    public static final String REMOVEACCOUNT_JSON = "RemoveAccountJSON";
    public static final String ENABLEACCOUNT_JSON = "EnableAccountJSON";
    public static final String DISABLEACCOUNT_JSON = "DisableAccountJSON";
    public static final String ADDACCESS_JSON = "AddAccessJSON";
    public static final String REMOVEACCESS_JSON = "RemoveAccessJSON";
    public static final String CHANGECREDENTIAL_JSON = "ChangeCredentialJSON";
    // Tried PasswordPolicyJSON and PwdPolicyJSON but its value is masked in the UI so using PWPolicyJSON instead to workaround the silly issue
    public static final String PASSWORDPOLICY_JSON = "PWPolicyJSON";
    public static final String DYNAMICATTRIBUTES_JSON = "DynamicAttributesJSON";
    public static final String SETRANDOMPASSWORD = "SETRANDOMPASSWORD";
    
    public static final String PWD_POLICY_MINLENGTH = "minLength";
    public static final String PWD_POLICY_MAXLENGTH = "maxLength";
    public static final String PWD_POLICY_MINNUMERIC = "minNumeric";
    public static final String PWD_POLICY_MINLOWER = "minLowercaseChars";
    public static final String PWD_POLICY_MINUPPER = "minUppercaseChars";
    public static final String PWD_POLICY_MINSPECIAL = "minSpecialChars";
    public static final String PWD_POLICY_SPECIALCHARS = "specialChars";
    public static final String PWD_POLICY_MAXREPEATED = "maxRepeatedChars";
    public static final String PWD_POLICY_ALLOWFIRSTDIGITORSPECIAL = "allowFirstDigitOrSpecialChar";
    
    public static final String SAV_ACCTATTR_ACCOUNTID = "ACCOUNTID";
    public static final String SAV_ACCTATTR_NAME = "NAME";
    public static final String SAV_ENTATR_ENTITLEMENTTYPE = "TYPE";
    public static final String SAV_ENTATR_ENTITLEMENTID = "ENTITLEMENTID";
    public static final String SAV_ENTATR_ENTITLEMENT_VALUE = "ENTITLEMENT_VALUE";
    public static final String SAV_JSONATTR_GROUP = "Group";
    public static final String SAV_JSONATTR_NEWPASSWORD = "newAccountPassword";
    
    // Constants used by AS400 configuration and attribute mapping
    public static final String OPT_RECONCILIATION_FIELD = "RECONCILIATION_FIELD";
    public static final String OPT_DEFAULT_RECONCILIATION_FIELD = "ACCOUNTID";
    public static final String OPT_USRPRF = "USRPRF";
    public static final String OPT_PASSWORD = "PASSWORD";
    public static final String OPT_ACGCDE = "ACGCDE";
    public static final String OPT_ASTLVL = "ASTLVL";
    public static final String OPT_ATNPGM = "ATNPGM";
    public static final String OPT_CCSID = "CCSID";
    public static final String OPT_CHRIDCTL = "CHRIDCTL";
    public static final String OPT_CNTRYID = "CNTRYID";
    public static final String OPT_CURLIB = "CURLIB";
    public static final String OPT_DSPSGNINF = "DSPSGNINF";
    public static final String OPT_GRPAUT = "GRPAUT";
    public static final String OPT_GRPAUTTYP = "GRPAUTTYP";
    public static final String OPT_GID = "GID";
    public static final String OPT_GRPPRF = "GRPPRF";
    public static final String OPT_HOMEDIR = "HOMEDIR";
    public static final String OPT_INLMNU = "INLMNU";
    public static final String OPT_INLPGM = "INLPGM";
    public static final String OPT_JOBD = "JOBD";
    public static final String OPT_KBDBUF = "KBDBUF";
    public static final String OPT_LANGID = "LANGID";
    public static final String OPT_LMTCPB = "LMTCPB";
    public static final String OPT_LMTDEVSSN = "LMTDEVSSN";
    public static final String OPT_SETJOBATR = "SETJOBATR";
    public static final String OPT_LOCALE = "LOCALE";
    public static final String OPT_MAXSTG = "MAXSTG";
    public static final String OPT_MAXSTGLRG = "MAXSTGLRG";
    public static final String OPT_DLVRY = "DLVRY";
    public static final String OPT_MSGQ = "MSGQ";
    public static final String OPT_SEV = "SEV";
    public static final String OPT_OUTQ = "OUTQ";
    public static final String OPT_OWNER = "OWNER";
    public static final String OPT_PWDEXPITV = "PWDEXPITV";
    public static final String OPT_PRTDEV = "PRTDEV";
    public static final String OPT_PWDEXP = "PWDEXP";
    public static final String OPT_SRTSEQ = "SRTSEQ";
    public static final String OPT_SPCAUT = "SPCAUT";
    public static final String OPT_SPCENV = "SPCENV";
    public static final String OPT_STATUS = "STATUS";
    public static final String OPT_SUPGRPPRF = "SUPGRPPRF";
    public static final String OPT_TEXT = "TEXT";
    public static final String OPT_USRCLS = "USRCLS";
    public static final String OPT_UID = "UID";
    public static final String OPT_USROPT = "USROPT";
    public static final String OPT_OWNOBJOPT = "OWNOBJOPT";
    public static final String OPT_PGPOPT = "PGPOPT";
    public static final String OPT_USREXPDATE = "USREXPDATE";
    public static final String OPT_PWDCHGBLK = "PWDCHGBLK";
    public static final String OPT_USREXPITV = "USREXPITV";
    public static final String OPT_PTYLMT = "PTYLMT";
    public static final String OPT_PREVIOUSSIGNEDONDATE = "PREVIOUSSIGNEDONDATE";
    public static final String OPT_PASSWORDLASTCHANGEDDATE = "PASSWORDLASTCHANGEDDATE";
    public static final String OPT_SIGNEDONATTEMPTSNOTVALID = "SIGNEDONATTEMPTSNOTVALID";
    public static final String OPT_DOCPWD = "DOCPWD";
    public static final String OPT_EIMASSOC = "EIMASSOC";
}
