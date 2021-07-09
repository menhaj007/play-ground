package com.afghanbooksales.science.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value ="/", method = RequestMethod.GET)
public class HomeController {
    int counter = 0;
    @GetMapping("home")
    // @ResponseBody
    public String home(HttpSession session) {
        session.setAttribute("count", 0);
        Integer count = (Integer) session.getAttribute("count");
        if ((Integer) session.getAttribute("count") > -1) {
            System.out.println(count +=1);

        }
            
        System.out.println("count is " + count);
        return "";
    }
}
