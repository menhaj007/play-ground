package com.yourideasmatter.postsandcomments.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

import com.yourideasmatter.postsandcomments.models.Post;
import com.yourideasmatter.postsandcomments.models.User;
import com.yourideasmatter.postsandcomments.repositories.PostRepository;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping(value="/posts", method=RequestMethod.GET)
public class PostController {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<List<Post>> allPosts() {
        List<Post> posts = (List<Post>) postService.allPosts();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }
    @PostMapping("/create/{id}")
    public ResponseEntity<Post> createPost(@Valid @RequestBody Post post, BindingResult result, @PathVariable("id") Long id) {
        User user = userService.findById(id).get();
        post.setUser(user);
        postRepository.save(post);
        return new ResponseEntity<Post>(post, HttpStatus.CREATED);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Post> getAPost(@PathVariable("id") Long id) {
        Post foundPost = postService.findById(id).get();
        return new ResponseEntity<Post>(foundPost, HttpStatus.FOUND);
    }

    
}
