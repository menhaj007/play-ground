package com.logandregistration.registration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @GetMapping(value="/")
    public String showHome() {
        System.out.println("Hello world");
        return "homePage";
    }
    
    
}
