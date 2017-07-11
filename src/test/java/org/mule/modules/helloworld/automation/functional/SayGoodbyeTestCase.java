package org.mule.modules.helloworld.automation.functional;

import org.junit.Test;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.mule.runtime.core.api.Event;

import static org.junit.Assert.assertEquals;

public class SayGoodbyeTestCase extends MuleArtifactFunctionalTestCase {

    public static final String FLOW_CONFIG_LOCATION = "flows/operation-say-goodbye-test-flows.xml";

    @Override
    protected String[] getConfigFiles() {
        return new String[]{FLOW_CONFIG_LOCATION};
    }

    @Test
    public void testGreetFlowBasicAuth() throws Exception {
        Event event = flowRunner("say-goodbye-basic-flow").withPayload("Fede").run();
        String result = (String) event.getMessage().getPayload().getValue();
        assertEquals("Good bye Fede!", result);
    }

    @Test
    public void testGreetFlowTokenAuth() throws Exception {
        Event event = flowRunner("say-goodbye-token-flow").withPayload("Fede").run();
        String result = (String) event.getMessage().getPayload().getValue();
        assertEquals("Bye Fede!", result);
    }

}
