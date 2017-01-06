package org.mule.modules.helloworld.extension.operation;

import org.mule.modules.helloworld.extension.HelloWorldExtension;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import static java.util.stream.Collectors.joining;

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

    /**
     * Returns the contents of an InputStream.
     *
     * @param stream
     *
     * @return The content of the stream, as a String.
     */
    public String getStreamData(@Content Object stream, @Optional(defaultValue = "\n") String lineSep) {
        return new BufferedReader(new InputStreamReader((InputStream) stream)).lines().collect(joining(lineSep));
    }

}
