package org.mule.modules.connectors.helloworld.api.parameters;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Password;
import org.mule.runtime.extension.api.annotation.param.display.Placement;

public class BasicAuthParameterGroup {

    /**
     * @param token
     *            Username used to initialize the session
     */

    @Parameter
    @Placement(order = 1)
    public String username;

    /**
     * @param secret
     *            Password used to authenticate the user
     */
    @Parameter
    @Placement(order = 2)
    @Password
    public String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
