package com.yourideasmatter.postsandcomments.controllers;

import java.util.List;

import javax.validation.Valid;

import com.yourideasmatter.postsandcomments.models.Comment;
import com.yourideasmatter.postsandcomments.models.Post;
import com.yourideasmatter.postsandcomments.services.CommentService;
import com.yourideasmatter.postsandcomments.services.PostService;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/comments", method = RequestMethod.GET)
public class CommentController {
    @Autowired
    private CommentService commentService;
    @Autowired
    private PostService postService;

    @GetMapping("")
    public ResponseEntity<List<Comment>> allComments() {
        List<Comment> comments = commentService.allComments();
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity aComments(@PathVariable("id") Long id) {
        Comment comment = commentService.findById(id).get();
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }
    @PostMapping("/new")
    public ResponseEntity<Comment> create(@Valid @RequestBody(required = false) Comment comment, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println(result.getFieldError());
        }
        commentService.saveComment(comment);
        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }

    @GetMapping("/post/{id}")
    public ResponseEntity<List<Comment>> aListComments(@PathVariable("id") Long id) {
        Post post = postService.findById(id).get();
        List<Comment> coms = post.getComments();
        return new ResponseEntity<>(coms, HttpStatus.OK);
    }
    @PostMapping("/post/{id}/new")
    public ResponseEntity<Comment> createComment( @RequestBody Comment comment, @PathVariable("id") Long id) {
        Post post = postService.findById(id).get();
        post.getComments().add(comment);
        // comment.getPosts().add(post);
        commentService.saveComment(comment);
        
        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }
    
    
}
