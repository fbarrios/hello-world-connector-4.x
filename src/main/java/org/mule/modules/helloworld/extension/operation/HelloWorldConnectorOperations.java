package org.mule.modules.helloworld.extension.operation;

import org.mule.modules.helloworld.extension.HelloWorldExtension;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

public class HelloWorldConnectorOperations {

    /**
     * Greet operation.
     *
     * @param friend
     *            Name to be used to generate a greeting message.
     * @return A greeting message
     */
    public String greet(@UseConfig HelloWorldExtension config, String friend) {
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }

    /**
     * Say goodbye operation.
     *
     * @param friend
     *            Name to be used to generate a greeting message.
     * @return A greeting message
     */
    public String sayGoodbye(@UseConfig HelloWorldExtension config, String friend) {
        return config.getFarewell() + " " + friend + "!";
    }

}
