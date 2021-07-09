package com.yourideasmatter.postsandcomments.controllers;

import java.util.List;

import javax.validation.Valid;

import com.yourideasmatter.postsandcomments.models.Post;
import com.yourideasmatter.postsandcomments.models.User;
import com.yourideasmatter.postsandcomments.services.PostService;
import com.yourideasmatter.postsandcomments.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users", method = RequestMethod.GET)
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;

    @GetMapping("")
    public ResponseEntity<List<User>> allUsers() {
        List<User> users = userService.allUsers();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>(user, HttpStatus.FORBIDDEN);
        }
        if (userService.findByEmail(user.getEmail()) != null) {
            // return new ResponseEntity<>(user, HttpStatus.NOT_ACCEPTABLE);    
            return new ResponseEntity<>(user, HttpStatus.FORBIDDEN);    
        }
        userService.saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> allUsers(@PathVariable("id") Long id) {
        User user = userService.findById(id).get();
        if (user == null) return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    @GetMapping("/posts/{id}")
    public ResponseEntity<List<Post>> userPost(@PathVariable("id") Long id) {
        // User user = userService.findById(id).get();
        // if (user == null) return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
        List<Post> posts = userService.allPost(id);
        return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
    }
    
}
