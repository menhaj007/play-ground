package com.twitter.tweet.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.twitter.tweet.models.User;
import com.twitter.tweet.repositories.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public ArrayList<User> getAllUsers() {
        return (ArrayList<User>) userRepository.findAll();
    }

    public User create(User newUser) {
        return userRepository.save(newUser);
    }

    public Optional<User> getAUser(Long id) {
        return userRepository.findById(id);
    }
    public User update(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user != null) {
            create(user.get());
        }
        System.out.println("User was not found " + user.get());
        return null;
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
    


}
