package org.mule.modules.connectors.helloworld.api.parameters;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Password;
import org.mule.runtime.extension.api.annotation.param.display.Placement;

public class TokenParameterGroup {

    /**
     * @param token
     *            Token used to initialize the session
     */

    @Parameter
    @Placement(order = 1)
    public String token;

    /**
     * @param secret
     *            Secret used to authenticate the user
     */
    @Parameter
    @Placement(order = 2)
    @Password
    public String secret;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

}
