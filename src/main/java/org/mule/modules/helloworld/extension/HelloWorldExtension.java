package org.mule.modules.helloworld.extension;

import org.mule.modules.helloworld.config.ConnectorConfig;
import org.mule.modules.helloworld.extension.connection.provider.HelloConnectionProvider;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.connector.ConnectionProviders;

@Extension(name = HelloWorldExtension.EXTENSION_NAME, description = HelloWorldExtension.EXTENSION_DESCRIPTION)
@ConnectionProviders(HelloConnectionProvider.class)
@Configurations(ConnectorConfig.class)
public class HelloWorldExtension {

    public static final String EXTENSION_NAME = "HelloWorldExtension";
    public static final String EXTENSION_DESCRIPTION = "This is a sample extension.";

}
