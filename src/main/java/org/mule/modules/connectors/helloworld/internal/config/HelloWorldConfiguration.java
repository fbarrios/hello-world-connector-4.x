package org.mule.modules.connectors.helloworld.internal.config;

import org.mule.modules.connectors.helloworld.internal.provider.BasicAuthConnectionProvider;
import org.mule.modules.connectors.helloworld.internal.provider.TokenConnectionProvider;
import org.mule.modules.connectors.helloworld.internal.operation.HelloWorldConnectorOperations;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

@Configuration(name = "config")
@DisplayName("Hello World configuration")
@Operations({
        HelloWorldConnectorOperations.class
})
@ConnectionProviders({
        BasicAuthConnectionProvider.class,
        TokenConnectionProvider.class
})
public class HelloWorldConfiguration {

    /**
     * Greeting message
     */
    @Parameter
    @Optional(defaultValue = "Hello")
    private String greeting;

    @Parameter
    @Optional(defaultValue = "Bye")
    private String farewell;


    /**
     * Set greeting message
     *
     * @param greeting
     *            the greeting message
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    /**
     * Get greeting message
     */
    public String getGreeting() {
        return this.greeting;
    }

    public String getFarewell() {
        return this.farewell;
    }

    public void setFarewell(String farewell) {
        this.farewell = farewell;
    }

}
