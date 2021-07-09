package com.twitter.tweet.controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

import javax.validation.Valid;

import com.twitter.tweet.models.User;
import com.twitter.tweet.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping(value = "/api/user/", method = RequestMethod.GET)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="all")
    public ArrayList<User> getMethodName() {
        return userService.getAllUsers();
    }

    @GetMapping("{id}")
    public User getAUser(@PathVariable("id") Long id) {
        if (id != null) {
            Optional<User> user = userService.findById(id);
            return user.get();

        }
        return null;
    }
    @PostMapping("create")
    @ResponseBody
    public User createUser(@Valid @RequestBody User newUser) {
        if(newUser != null) {
            userService.create(newUser);
        }
        return null;
    }
    

    
}
