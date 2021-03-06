package org.mule.modules.helloworld.automation.functional;

import org.junit.Test;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.mule.runtime.core.api.Event;

import static org.junit.Assert.assertEquals;

public class GreetTestCase extends MuleArtifactFunctionalTestCase {

    public static final String FLOW_CONFIG_LOCATION = "flows/operation-greet-test-flows.xml";

    @Override
    protected String[] getConfigFiles() {
        return new String[] { FLOW_CONFIG_LOCATION };
    }

    @Test
    public void testGreetFlowBasicAuth() throws Exception {
        Event event = flowRunner("greet-basic-flow").withPayload("Fede").run();
        String result = (String) event.getMessage().getPayload().getValue();
        assertEquals("Good morning Fede!", result);
    }

    @Test
    public void testGreetFlowTokenAuth() throws Exception {
        Event event = flowRunner("greet-token-flow").withPayload("Fede").run();
        String result = (String) event.getMessage().getPayload().getValue();
        assertEquals("Hello Fede!", result);
    }

}