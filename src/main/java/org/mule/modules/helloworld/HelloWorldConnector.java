package org.mule.modules.helloworld;

import org.mule.modules.helloworld.config.ConnectorConfig;

public class HelloWorldConnector {

    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend
     *            Name to be used to generate a greeting message.
     * @return A greeting message
     */
    public String greet(String friend) {
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }

    /**
     *
     *
     * @param friend
     *            Name to be used to generate a greeting message.
     * @return A greeting message
     */
    public String sayGoodbye(String friend) {
        return config.getFarewell() + " " + friend + "!";
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}
