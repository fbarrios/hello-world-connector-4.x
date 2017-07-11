package org.mule.modules.connectors.helloworld.internal.connection;

public interface HelloWorldConnection {

    void log(String message);

    void disconnect();

    boolean isConnected();

}
