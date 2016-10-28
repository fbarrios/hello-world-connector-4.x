package org.mule.modules.helloworld.extension.connection.provider;

import org.mule.modules.helloworld.extension.HelloWorldConnection;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.Alias;

@Alias("config")
public class HelloConnectionProvider implements ConnectionProvider<HelloWorldConnection> {

    @Override
    public HelloWorldConnection connect() throws ConnectionException {
        return new HelloWorldConnection();
    }

    @Override
    public void disconnect(HelloWorldConnection helloWorldClient) {

    }

    @Override
    public ConnectionValidationResult validate(HelloWorldConnection helloWorldClient) {
        return ConnectionValidationResult.success();
    }

}
