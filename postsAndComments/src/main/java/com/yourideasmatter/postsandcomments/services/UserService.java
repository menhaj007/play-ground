package com.yourideasmatter.postsandcomments.services;

import java.util.List;
import java.util.Optional;

import com.yourideasmatter.postsandcomments.models.Post;
import com.yourideasmatter.postsandcomments.models.User;
import com.yourideasmatter.postsandcomments.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> allUsers() {
        return (List<User>) userRepository.findAll();
    }
    
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
    public User updateUser(User user) {
        return saveUser(user);
    }
    public User deleteUser(Long id) {
        User findUser = userRepository.findById(id).get();
        if (findUser != null)
            userRepository.deleteById(id);
        return findUser;
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    public List<Post> allPost(Long id) {
        User user = userRepository.findById(id).get();
        List<Post> posts = user.getPosts();
        return posts;
    }
}
