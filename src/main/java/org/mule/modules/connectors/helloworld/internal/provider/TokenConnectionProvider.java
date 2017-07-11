package org.mule.modules.connectors.helloworld.internal.provider;

import org.mule.modules.connectors.helloworld.api.exception.HelloWorldConnectionException;
import org.mule.modules.connectors.helloworld.api.parameters.TokenParameterGroup;
import org.mule.modules.connectors.helloworld.internal.connection.HelloWorldConnection;
import org.mule.modules.connectors.helloworld.internal.connection.TokenConnection;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.Placement;

public class TokenConnectionProvider implements ConnectionProvider<HelloWorldConnection> {

    @ParameterGroup(name = "Connection")
    @Placement(order = 1)
    private TokenParameterGroup tokenParams;

    public void setTokenParams(TokenParameterGroup tokenParams) {
        this.tokenParams = tokenParams;
    }

    @Override
    public HelloWorldConnection connect() throws ConnectionException {
        if(!tokenParams.getToken().equals("aToken") || !tokenParams.getSecret().equals("aSecret"))
            throw new HelloWorldConnectionException("Invalid credentials.");

        return new TokenConnection();
    }

    @Override
    public void disconnect(HelloWorldConnection connection) {

    }

    @Override
    public ConnectionValidationResult validate(HelloWorldConnection connection) {
        return ConnectionValidationResult.success();
    }

}
