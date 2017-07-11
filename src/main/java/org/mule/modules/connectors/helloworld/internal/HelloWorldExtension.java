package org.mule.modules.connectors.helloworld.internal;

import org.mule.modules.connectors.helloworld.internal.config.HelloWorldConfiguration;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;

import static org.mule.modules.connectors.helloworld.internal.HelloWorldExtension.EXTENSION_DESCRIPTION;
import static org.mule.modules.connectors.helloworld.internal.HelloWorldExtension.EXTENSION_NAME;
import static org.mule.modules.connectors.helloworld.internal.HelloWorldExtension.XML_PREFIX;


@Extension(name = EXTENSION_NAME, description = EXTENSION_DESCRIPTION)
@Configurations({
        HelloWorldConfiguration.class
})
@Xml(prefix = XML_PREFIX)
public class HelloWorldExtension {

    public static final String EXTENSION_NAME = "HelloWorldConnector";
    public static final String EXTENSION_DESCRIPTION = "This is a sample Mule 4 connector.";
    public static final String XML_PREFIX = "hello-world";

}
