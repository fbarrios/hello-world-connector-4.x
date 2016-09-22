package org.mule.modules.helloworld.config;

public class ConnectorConfig {

    /**
     * Greeting message
     */
    @org.mule.runtime.extension.api.annotation.Parameter
    @org.mule.runtime.extension.api.annotation.param.Optional(defaultValue = "Hello")
    private String greeting;

    /**
     * Reply message
     */
    @org.mule.runtime.extension.api.annotation.Parameter
    @org.mule.runtime.extension.api.annotation.param.Optional(defaultValue = "How are you?")
    private String reply;

    @org.mule.runtime.extension.api.annotation.Parameter
    @org.mule.runtime.extension.api.annotation.param.Optional(defaultValue = "Bye")
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
