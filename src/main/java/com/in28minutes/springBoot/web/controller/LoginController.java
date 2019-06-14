package com.in28minutes.springBoot.web.controller;

import com.in28minutes.springBoot.web.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{


    LoginService loginService ;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap modelMap) {
        // modelMap.put("name",name);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap modelMap, @RequestParam String name, @RequestParam String password) {
        modelMap.put("name", name);
        modelMap.put("password",password);
        return "welcome";
    }
}
