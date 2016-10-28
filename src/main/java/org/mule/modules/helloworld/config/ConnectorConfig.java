package org.mule.modules.helloworld.config;

import org.mule.modules.helloworld.extension.operation.HelloWorldConnectorOperations;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.param.Optional;

@Operations(HelloWorldConnectorOperations.class)
public class ConnectorConfig {

    /**
     * Greeting message
     */
    @Parameter
    @Optional(defaultValue = "Hello")
    private String greeting;

    /**
     * Reply message
     */
    @Parameter
    @Optional(defaultValue = "How are you?")
    private String reply;

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

    /**
     * Set reply
     *
     * @param reply
     *            the reply
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * Get reply
     */
    public String getReply() {
        return this.reply;
    }

}
