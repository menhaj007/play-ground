package com.logandregistration.registration.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.logandregistration.registration.models.User;
import com.logandregistration.registration.services.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Users {
        private final UserService userService;

    
    public Users(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage";
    }
    

// if result has errors, return the registration page (don't worry about validations just now)
// else, save the user in the database, save the user id in session, and redirect them to the /home route

    @RequestMapping(value="/registration", method = RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
            if (result.hasErrors()) {
                return "registrationPage";
            }
            User usr = userService.registerUser(user);
            session.setAttribute("userId", usr.getId());
        return "redirect:/home";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        // if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
        boolean isAuthenticated = userService.authenticateUser(email, password);
        if (isAuthenticated) {
            User usr = userService.findByEmail(email);
            session.setAttribute("userId", usr.getId());
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Invalid Credentials. Please try again.");
            return "loginPage";
        }

    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page
        Long userId = (Long) session.getAttribute("userID");
        User usr = userService.findUserById(userId);
        model.addAttribute("user", usr);
        return "homePage";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
        // redirect to login page
        session.invalidate();
        return "redirect:/login";
    }


//     public UserService getUserService() {
//         return this.userService;
//     }


}