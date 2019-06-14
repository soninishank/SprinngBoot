package com.in28minutes.springBoot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{

    @RequestMapping("/login")
    public String loginMessage(@RequestParam String name, ModelMap modelMap)
    {
        System.out.println("name is " + name );

        modelMap.put("name",name);
        return "login";
    }
}
