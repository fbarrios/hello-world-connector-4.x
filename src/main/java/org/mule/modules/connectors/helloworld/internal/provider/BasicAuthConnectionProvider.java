package org.mule.modules.connectors.helloworld.internal.provider;

import org.mule.modules.connectors.helloworld.api.exception.HelloWorldConnectionException;
import org.mule.modules.connectors.helloworld.api.parameters.BasicAuthParameterGroup;
import org.mule.modules.connectors.helloworld.internal.connection.BasicAuthConnection;
import org.mule.modules.connectors.helloworld.internal.connection.HelloWorldConnection;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.Placement;

@Alias("config")
public class BasicAuthConnectionProvider implements ConnectionProvider<HelloWorldConnection> {

    @ParameterGroup(name = "Connection")
    @Placement(order = 1)
    private BasicAuthParameterGroup basicAuthParams;

    public void setBasicAuthParams(BasicAuthParameterGroup basicAuthParams) {
        this.basicAuthParams = basicAuthParams;
    }


    @Override
    public HelloWorldConnection connect() throws ConnectionException {
        if(!basicAuthParams.getUsername().equals("admin") || !basicAuthParams.getPassword().equals("admin"))
            throw new HelloWorldConnectionException("Invalid credentials.");

        return new BasicAuthConnection();
    }

    @Override
    public void disconnect(HelloWorldConnection connection) {

    }

    @Override
    public ConnectionValidationResult validate(HelloWorldConnection connection) {
        return ConnectionValidationResult.success();
    }

}
