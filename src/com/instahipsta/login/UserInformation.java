package com.instahipsta.login;

/**
 * Created by Vladislove on 01.11.2014.
 */
public class UserInformation {

    private String name;
    private String password;

    public UserInformation() {
        name = "hipster";
        password = "hipster";
    }

    public UserInformation(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
