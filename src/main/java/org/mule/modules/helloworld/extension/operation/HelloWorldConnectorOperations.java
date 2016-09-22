package org.mule.modules.helloworld.extension.operation;

import org.mule.modules.helloworld.HelloWorldConnector;
import org.mule.modules.helloworld.config.ConnectorConfig;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

@Operations(HelloWorldConnectorOperations.class)
public class HelloWorldConnectorOperations {

    /**
     * Custom processor
     * 
     * @param friend
     *            Name to be used to generate a greeting message.
     */
    public String greet(@UseConfig ConnectorConfig config, String friend) {
        HelloWorldConnector connector = new HelloWorldConnector();
        connector.setConfig(config);
        String result = connector.greet(friend);
        return result;
    }

    /**
     * 
     * @param friend
     *            Name to be used to generate a greeting message.
     */
    public String sayGoodbye(@UseConfig ConnectorConfig config, String friend) {
        HelloWorldConnector connector = new HelloWorldConnector();
        connector.setConfig(config);
        String result = connector.sayGoodbye(friend);
        return result;
    }

}
