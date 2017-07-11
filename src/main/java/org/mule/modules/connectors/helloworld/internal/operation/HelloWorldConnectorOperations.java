package org.mule.modules.connectors.helloworld.internal.operation;

import org.mule.modules.connectors.helloworld.internal.config.HelloWorldConfiguration;
import org.mule.modules.connectors.helloworld.internal.connection.HelloWorldConnection;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;


public class HelloWorldConnectorOperations {

    /**
     * Greet operation.
     *
     * @param friend
     *            Name to be used to generate a greeting message.
     * @return A greeting message
     */
    public String greet(@Config HelloWorldConfiguration config,
                        @Connection HelloWorldConnection connection,
                        String friend) {
        connection.log("greet!");
        return config.getGreeting() + " " + friend + "!";
    }

    /**
     * Say goodbye operation.
     *
     * @param friend
     *            Name to be used to generate a greeting message.
     * @return A greeting message
     */
    public String sayGoodbye(@Config HelloWorldConfiguration config,
                             @Connection HelloWorldConnection connection,
                             String friend) {
        connection.log("farewell!");
        return config.getFarewell() + " " + friend + "!";
    }

}
