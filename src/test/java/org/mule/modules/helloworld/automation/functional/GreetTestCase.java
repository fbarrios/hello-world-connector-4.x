package org.mule.modules.helloworld.automation.functional;

import org.junit.Test;
import org.mule.functional.junit4.FlowRunner;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.mule.runtime.core.api.Event;

import static org.junit.Assert.assertEquals;

public class GreetTestCase extends MuleArtifactFunctionalTestCase {

    public static final String FLOW_CONFIG_LOCATION = "extension-operations.xml";

    @Override
    protected String[] getConfigFiles() {
        return new String[] { FLOW_CONFIG_LOCATION };
    }

    @Test
    public void testGreetFlow() throws Exception {
        FlowRunner flowRunner = flowRunner("greet-flow-op");
        Event run = flowRunner.run();
        assertEquals(run.getMessage().getPayload().getValue(), "Hello Fede. How are you?");
    }

}