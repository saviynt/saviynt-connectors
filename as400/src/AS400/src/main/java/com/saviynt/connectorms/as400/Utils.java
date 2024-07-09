/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saviynt.connectorms.as400;

import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.ErrorCompletingRequestException;
import com.ibm.as400.access.ObjectDoesNotExistException;
import com.ibm.as400.access.RequestNotSupportedException;
import com.ibm.as400.access.UserList;
import com.ibm.as400.access.User;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Enumeration;

/**
 *
 * @author marcozhang
 */
public class Utils {

    public static void main(String[] args) 
            throws AS400SecurityException, ErrorCompletingRequestException, InterruptedException, IOException, ObjectDoesNotExistException, RequestNotSupportedException {

        AS400Connection conn = null;
        
        try {
            conn = new AS400Connection("pub400.com", "marcozj", "rr4mXqAE");

            //RUserList list = new RUserList(conn.getConnection());
            //list.setSelectionValue(RUserList.SELECTION_CRITERIA, RUserList.USER);
            //Enumeration users = list.resources();

            UserList users = new UserList(conn.getConnection());
            Enumeration io = users.getUsers();

            while (io.hasMoreElements()) {
                User u = (User) io.nextElement();
                System.out.println("User name" + ": " + u.getName());
                System.out.println("User profile name / User (USRPRF)" + ": " + u.getUserProfileName());
                System.out.println("Previous sign-on date" + ": " + u.getPreviousSignedOnDate());
                System.out.println("Password last change date" + ": " + u.getPasswordLastChangedDate());
                System.out.println("Status (STATUS)" + ": " + u.getStatus());
                System.out.println("Password verification not valid" + ": " + u.getSignedOnAttemptsNotValid());
                System.out.println("User class / Type of User (USRCLS)" + ": " + u.getUserClassName());
                System.out.println("Assistance level (ASTLVL)" + ": " +  u.getAssistanceLevel());
                System.out.println("Current library / Default library (CURLIB)" + ": " +  u.getCurrentLibraryName());
                System.out.println("Initial program / Sign on program (INLPGM)" + ": " + u.getInitialProgram());
                System.out.println("Initial menu / First menu (INLMNU)" + ": " + u.getInitialMenu());
                System.out.println("Limit capabilities / Restrict command line use (LMTCPB)" + ": " + u.getLimitCapabilities());
                System.out.println("Text / User description (TEXT)" + ": " + u.getDescription());
                System.out.println("Special authority (SPCAUT)" + ": " + Arrays.toString(u.getSpecialAuthority()));
                System.out.println("Special environment (SPCENV)" + ": " + u.getSpecialEnvironment());
                System.out.println("Display sign-on information (DSPSGNINF)" + ": " + u.getDisplaySignOnInformation());
                System.out.println("Password expiration interval (PWDEXPITV)" + ": " + u.getPasswordExpirationInterval());
                System.out.println("Block Password Change (PWDCHGBLK)" + ": " + u.getPasswordChangeBlock());
                //System.out.println("Local password management (LCLPWDMGT)" + ": " + u.);
                System.out.println("Limit device sessions (LMTDEVSSN)" + ": " + u.getLimitDeviceSessions());
                System.out.println("Keyboard buffering (KBDBUF)" + ": " + u.getKeyboardBuffering());
                System.out.println("Maximum storage (MAXSTG)" + ": " + u.getMaximumStorageAllowed());
                System.out.println("Maximum large storage (MAXSTGLRG)" + ": " + u.getMaximumStorageAllowedInLong());
                //System.out.println("Priority limit (PTYLMT)" + ": " + u.);
                System.out.println("Job description (JOBD)" + ": " + u.getJobDescription());
                System.out.println("Group profile / User Group (GRPPRF)" + ": " + u.getGroupProfileName());
                System.out.println("Owner (OWNER)" + ": " + u.getOwner());
                System.out.println("Group authority (GRPAUT)" + ": " + u.getGroupAuthority());
                System.out.println("Group authority type (GRPAUTTYP)" + ": " + u.getGroupAuthorityType());
                System.out.println("Supplemental groups (SUPGRPPRF)" + ": " + Arrays.toString(u.getSupplementalGroups()));
                System.out.println("Accounting code (ACGCDE)" + ": " + u.getAccountingCode());
                //System.out.println("Document password (DOCPWD)" + ": " + u.);
                System.out.println("Message queue (MSGQ)" + ": " + u.getMessageQueue());
                //System.out.println("Delivery (DLVRY)" + ": " + u.get);
                //System.out.println("Severity (SEV)" + ": " + u.);
                System.out.println("Print device / Default printer (PRTDEV)" + ": " + u.getPrintDevice());
                System.out.println("Output queue (OUTQ)" + ": " + u.getOutputQueue());
                System.out.println("Attention-Key-Handling program (ATNPGM)" + ": " + u.getAttentionKeyHandlingProgram());
                System.out.println("Sort Sequence (SRTSEQ)" + ": " + u.getSortSequenceTable());
                System.out.println("Language identifier (LANGID)" + ": " + u.getLanguageID());
                System.out.println("Country or region identifier (CNTRYID)" + ": " + u.getCountryID());
                System.out.println("Coded character set identifier (CCSID)" + ": " + u.getCCSID());
                System.out.println("Character identifier control (CHRIDCTL)" + ": " + u.getCHRIDControl());
                System.out.println("Job attributes (SETJOBATR)" + ": " + Arrays.toString(u.getLocaleJobAttributes()));
                System.out.println("Locale (LOCALE)" + ": " + u.getLocalePathName());
                System.out.println("User Options (USROPT)" + ": " + Arrays.toString(u.getUserOptions()));
                System.out.println("User identification number (UID)" + ": " + u.getUserID());
                System.out.println("Group identification number (GID)" + ": " + u.getGroupID());
                System.out.println("Home directory (HOMEDIR)" + ": " + u.getHomeDirectory());
                //System.out.println("EIM association (EIMASSOC)" + ": " + u.get);
                System.out.println("User expiration date (USREXPDATE)" + ": " + u.getUserExpirationDate());
                System.out.println("User expiration interval (USREXPITV)" + ": " + u.getUserExpirationInterval());
                //System.out.println("Authority (AUT)" + ": " + u.ge);

                
                System.out.println("");
            }

        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    
    }
    
}
