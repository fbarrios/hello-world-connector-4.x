package org.mule.modules.helloworld.extension;

import org.mule.modules.helloworld.config.ConnectorConfig;
import org.mule.modules.helloworld.extension.operation.HelloWorldConnectorOperations;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;

@Extension(name = "HelloWorldConnector", description = "")
@Configurations({ ConnectorConfig.class })
public class HelloWorldExtension {

}
