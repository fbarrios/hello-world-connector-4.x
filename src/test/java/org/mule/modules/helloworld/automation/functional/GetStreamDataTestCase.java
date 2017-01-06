package org.mule.modules.helloworld.automation.functional;

import org.junit.Test;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.mule.runtime.core.api.Event;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;


public class GetStreamDataTestCase extends MuleArtifactFunctionalTestCase {

    public static final String FLOW_CONFIG_LOCATION = "operation-get-stream-data.xml";
    private static final String TEST_DATA = "Lorem ipsum dolor sit amet.";

    @Override
    protected String[] getConfigFiles() {
        return new String[] { FLOW_CONFIG_LOCATION };
    }

    @Test
    public void testGetStreamDataFlow() throws Exception {
        Event event = flowRunner("get-stream-flow").withPayload(new ByteArrayInputStream(TEST_DATA.getBytes())).run();
        assertEquals(event.getMessage().getPayload().getValue(), TEST_DATA);
    }

}