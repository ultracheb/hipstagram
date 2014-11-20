package com.instahipsta.login;

import com.instahipsta.httpwork.HttpPutler;

/**
 * Created by Vladislove on 01.11.2014.
 */
public class LoginScreen {

    private UserInformation admin;

    public LoginScreen() {
        admin = new UserInformation("admin", "vintage");
    }

    public boolean existUser(UserInformation user) {
        return true;
    }

    public void registerUser(String name, String password){

        new HttpPutler().execute();
    }
}
