package com.in28minutes.springBoot.web.service;


import org.springframework.stereotype.Component;

@Component
public class LoginService {
    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("nishank") && password.equals("soni");
    }
}