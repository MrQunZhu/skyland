package com.clesun.web.skyland.utils;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * Created by clesun on 2017/4/28.
 */
public class UserNameOrPhonenumPasswordToken extends UsernamePasswordToken {

    private Constant.LoginType loginType;

    public UserNameOrPhonenumPasswordToken(Constant.LoginType loginType) {
        this.loginType = loginType;
    }

    public UserNameOrPhonenumPasswordToken(String username, char[] password, Constant.LoginType loginType) {
        super(username, password);
        this.loginType = loginType;
    }

    public UserNameOrPhonenumPasswordToken(String username, String password, Constant.LoginType loginType) {
        super(username, password);
        this.loginType = loginType;
    }

    public UserNameOrPhonenumPasswordToken(String username, char[] password, String host, Constant.LoginType loginType) {
        super(username, password, host);
        this.loginType = loginType;
    }

    public UserNameOrPhonenumPasswordToken(String username, String password, String host, Constant.LoginType loginType) {
        super(username, password, host);
        this.loginType = loginType;
    }

    public UserNameOrPhonenumPasswordToken(String username, char[] password, boolean rememberMe, Constant.LoginType loginType) {
        super(username, password, rememberMe);
        this.loginType = loginType;
    }

    public UserNameOrPhonenumPasswordToken(String username, String password, boolean rememberMe, Constant.LoginType loginType) {
        super(username, password, rememberMe);
        this.loginType = loginType;
    }

    public UserNameOrPhonenumPasswordToken(String username, char[] password, boolean rememberMe, String host, Constant.LoginType loginType) {
        super(username, password, rememberMe, host);
        this.loginType = loginType;
    }

    public UserNameOrPhonenumPasswordToken(String username, String password, boolean rememberMe, String host, Constant.LoginType loginType) {
        super(username, password, rememberMe, host);
        this.loginType = loginType;
    }

    public Constant.LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(Constant.LoginType loginType) {
        this.loginType = loginType;
    }

}
