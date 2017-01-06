package org.mule.modules.helloworld.automation.functional;

import org.junit.Test;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.mule.runtime.core.api.Event;

import static org.junit.Assert.assertEquals;

public class GreetTestCase extends MuleArtifactFunctionalTestCase {

    public static final String FLOW_CONFIG_LOCATION = "operation-greet.xml";

    @Override
    protected String[] getConfigFiles() {
        return new String[] { FLOW_CONFIG_LOCATION };
    }

    @Test
    public void testGreetFlow() throws Exception {
        Event event = flowRunner("greet-flow").run();
        assertEquals(event.getMessage().getPayload().getValue(), "Hello Fede. How are you?");
    }

}