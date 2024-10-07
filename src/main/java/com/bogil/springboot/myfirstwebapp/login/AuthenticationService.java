package com.bogil.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){

        boolean isValidUsername = username.equalsIgnoreCase("bogil");

        boolean isValidPassword = password.equalsIgnoreCase("hi");

        return isValidPassword&&isValidUsername;
    }
}
