package com.codingdojo.auth.controllers;

import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.codingdojo.auth.models.User;
import com.codingdojo.auth.models.UserValidator;
import com.codingdojo.auth.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Users {
    @Autowired
    private UserService userService;
    @Autowired
    private UserValidator userValidator;
    
    
    
    @RequestMapping(value = {"/", "/login"})
    public String login() {
        return "loginPage.jsp";
    }
    @PostMapping("/login")
    public String loginUser(@RequestParam("email") String email, 
        @RequestParam("password") String password, Model model, HttpSession session) {
        // if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
        boolean isAuthenticated = userService.authenticatedUser(email, password);
        if (isAuthenticated) {
            User userFound = userService.findByEmail(email);
            session.setAttribute("userId", userFound.getId());
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Invalid credentials. Please try again");
            return "loginPage.jsp";
        }
    }
    @GetMapping("/registration")
        public String registerForm(@ModelAttribute("user") User user) {
            return "registrationPage.jsp";
        }
    @PostMapping("/registration")
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        // if result has errors, return the registration page (don't worry about validations just now)
        // else, save the user in the database, save the user id in session, and redirect them to the /home route
        userValidator.validate(user, result);
        if (result.hasErrors()) {
            return "registrationPage.jsp";
        }
        User newUser = userService.registerUser(user);
        session.setAttribute("userId", newUser.getId());
        return "redirect:/home";
    }
    

    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page
        // User user = userService.findUserByIdUser((Long) session.getAttribute("userId"));
        Long userId = (Long) session.getAttribute("userId");
        User user = userService.findUserByIdUser(userId);
        model.addAttribute("user", user);
        return "homePage.jsp";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
        // redirect to login page
        session.invalidate();
        return "redirect:/login";
    }
}