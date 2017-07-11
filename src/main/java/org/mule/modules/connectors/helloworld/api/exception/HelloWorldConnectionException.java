package org.mule.modules.connectors.helloworld.api.exception;

import org.mule.runtime.api.connection.ConnectionException;

public class HelloWorldConnectionException extends ConnectionException {

    public HelloWorldConnectionException(String message) {
        super(message);
    }

}
