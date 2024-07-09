package com.saviynt.connectorms.as400.exceptions;

import com.saviynt.ssm.abstractConnector.exceptions.ConnectorException;

public class ConfigurationException extends ConnectorException {
    private static final long serialVersionUID = 1L;

    public ConfigurationException() {
    }

    public ConfigurationException(String message) {
        super(message);
    }

    public ConfigurationException(Throwable cause) {
        super(cause);
    }

    public ConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
