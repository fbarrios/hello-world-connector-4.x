package org.mule.modules.helloworld.extension;

import org.apache.log4j.Logger;
import org.mule.runtime.core.api.MuleException;
import org.mule.runtime.core.api.lifecycle.InitialisationException;
import org.mule.runtime.core.api.lifecycle.Lifecycle;

public class HelloWorldConnection implements Lifecycle {

    private Logger logger = Logger.getLogger(HelloWorldConnection.class);

    @Override
    public void dispose() {
        logger.info("Disposed connection.");
    }

    @Override
    public void initialise() throws InitialisationException {
        logger.info("Initialized connection.");
    }

    @Override
    public void start() throws MuleException {
        logger.info("Started connection.");
    }

    @Override
    public void stop() throws MuleException {
        logger.info("Stopped connection.");
    }

}
