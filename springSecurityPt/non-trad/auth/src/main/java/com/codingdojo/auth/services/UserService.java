package com.codingdojo.auth.services;

import java.util.Optional;

import com.codingdojo.auth.models.User;
import com.codingdojo.auth.repositories.UserRepository;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    public User findUserByIdUser(Long id) {
        Optional<User> foundUser = userRepository.findById(id);
        if (foundUser.isPresent()) {
            return foundUser.get();
        } else {
            return null;
        }
    }
    public boolean authenticatedUser(String email, String password) {
        User foundUser = userRepository.findByEmail(email);
        if (foundUser == null) {
            return false;
        } else {
            if (BCrypt.checkpw(password, foundUser.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
}