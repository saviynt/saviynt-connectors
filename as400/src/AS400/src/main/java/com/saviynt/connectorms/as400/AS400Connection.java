package com.saviynt.connectorms.as400;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400Message;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.CommandCall;
import com.ibm.as400.access.ErrorCompletingRequestException;
import com.ibm.as400.access.SecureAS400;
import java.beans.PropertyVetoException;
import java.io.IOException;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import com.ibm.as400.access.ObjectDoesNotExistException;
import com.ibm.as400.access.RequestNotSupportedException;
import com.ibm.as400.access.SystemValue;
import com.saviynt.ssm.abstractConnector.exceptions.ConnectorException;
import java.util.Arrays;
import org.slf4j.LoggerFactory;

/**
 *
 * @author marcozhang
 */
public class AS400Connection implements AutoCloseable {

    //private static final Logger log = Logger.getLogger(AS400Connection.class.getName());
    private final Logger LOGGER = (Logger) LoggerFactory.getLogger(AS400Connection.class.getName());
    private AS400 conn = null;

    /**
     * The password level (QPWDLVL) of the system.
     */
    public static final int QPWDLVL_UNFETCHED = -2;
    public static final int QPWDLVL_UNSET = -1;
    protected int passwordLevel = QPWDLVL_UNFETCHED;

    private final String hostname;
    private final String username;
    private final String password;
    private Boolean useSSL = true;

    public AS400Connection(String host, String acct, String passwd) {
        hostname = host;
        username = acct;
        password = passwd;
        try {
            newConnection(hostname, username, password, useSSL);
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage());
        }
    }

    public AS400Connection(String host, String acct, String passwd, Boolean ssl) {
        hostname = host;
        username = acct;
        password = passwd;
        useSSL = ssl;
        try {
            newConnection(hostname, username, password, useSSL);
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage());
        }
    }

    /**
     *
     */
    private void newConnection(String host, String acct, String passwd, Boolean ssl) {
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("Establishing connection to AS400 system: " + host);
        try {
            if (ssl) {
                LOGGER.info("Connection with SSL");
                conn = new SecureAS400(host, acct, str2Char(passwd));
            } else {
                LOGGER.info("Connection without SSL");
                conn = new AS400(host, acct, str2Char(passwd));
            }
            //LOGGER.info("Connected to " + conn.getSystemName());
        } catch (Exception ex) {
            //LOGGER.error("Connection error: " + ex.getMessage());
            throw new ConnectorException(ex.getMessage());
        }

        try {
            // Turn off user IDs and passwords prompt
            conn.setGuiAvailable(false);
            authenticate();
        } catch (PropertyVetoException ex) {
            //log.log(Level.SEVERE, "setGuiAvailable error: {0}", e.getMessage());
            LOGGER.error("setGuiAvailable error: " + ex.getMessage());
            throw new ConnectorException(ex.getMessage());
        } catch (AS400SecurityException | IOException ex) {
            LOGGER.error("Authentiation error: " + ex.getMessage());
            throw new ConnectorException(ex.getMessage());
        }

    }

    public Boolean authenticate() throws AS400SecurityException, IOException {
        boolean authenticated = false;
        if (conn != null) {
            authenticated = conn.authenticate(username, str2Char(password));
            if (!authenticated) {
                //log.log(Level.SEVERE, "Username or password invalid!");
                LOGGER.error("Username or password invalid!");
                throw new ConnectorException("Username or password invalid!");
            }
            LOGGER.info("Authentication successful");
        }
        return authenticated;
    }

    protected void determinePasswordLevel() {
        if (conn != null) {
            try {
                SystemValue sysval = new SystemValue(conn, "QPWDLVL");
                Integer qpwdlvl = (Integer) sysval.getValue();
                if (qpwdlvl != null) {
                    passwordLevel = qpwdlvl;
                }
            } catch (RequestNotSupportedException e) {
                //This means the resource is earlier than AS400 5.1, so QPWDLVL does not exist
                //In this case, we will set password level to be -1 (QPWDLVL_UNSET)
                passwordLevel = QPWDLVL_UNSET;
            } catch (AS400SecurityException | ErrorCompletingRequestException | ObjectDoesNotExistException | IOException | InterruptedException e) {
                LOGGER.error("Unable to determine password level" + e);
            }
            LOGGER.info("Password level is " + passwordLevel);
        }
    }

    /**
     * Runs a generated command on the AS400 system.
     *
     * @param command Command to run on the AS400 system
     * @return Returns true if successful false otherwise.
     */
    public boolean runCommand(String command) {
        LOGGER.setLevel(Level.ALL);
        boolean success = false;
        try {
            //LOGGER.debug("Execute command: " + command);
            LOGGER.debug("Execute command: " + AS400Utils.maskPassword(command));
            CommandCall cc = new CommandCall(conn);
            //cc.setCommand(command);
            success = cc.run(command);
            AS400Message[] msgs = cc.getMessageList();
            if (!success) {
                for (AS400Message msg : msgs) {
                    // Handle user profile deletion
                    if (command.startsWith("DLTUSRPRF") && msg.getText().endsWith("not found.")) {
                        success = true;
                        break;
                    }
                }
                for (AS400Message msg : msgs) {
                    LOGGER.error("Command failed message: " + msg.getText());
                }
                throw new ConnectorException(Arrays.toString(msgs));
            } else {
                for (AS400Message msg : msgs) {
                    LOGGER.debug("Command success message: " + msg.getText());
                }
            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException ex) {
            LOGGER.error("Error in exeucting command: " + ex);
            throw new ConnectorException(ex);
        }

        return success;
    }

    /**
     * Tests the connection to the AS400 system.
     *
     * @return True if its still connected else false.
     */
    public boolean isConnected() {
        return (conn != null);
    }

    /**
     * Returns the internal connection object.
     *
     * @return Return the internal connection object.
     */
    public AS400 getConnection() {
        return conn;
    }

    /**
     * Closes the connection to the AS400 system.
     */
    @Override
    public void close() {
        if (conn != null) {
            conn.disconnectAllServices();
            conn = null;
        }
    }

    private char[] str2Char(String str) {
        if (str == null) {
            str = "";
        }
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        return ch;
    }
}
