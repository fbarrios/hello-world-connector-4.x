package org.mule.modules.connectors.helloworld.internal.connection;

import org.apache.log4j.Logger;

public class TokenConnection implements HelloWorldConnection {

    private Logger logger = Logger.getLogger(TokenConnection.class);
    private boolean isConnected;

    public TokenConnection() {
        this.isConnected = true;
    }

    @Override
    public void log(String message) {
        this.logger.info(message);
    }

    @Override
    public void disconnect() {
        this.isConnected = false;
    }

    @Override
    public boolean isConnected() {
        return this.isConnected;
    }

}
