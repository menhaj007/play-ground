package com.yourideasmatter.postsandcomments.services;

import java.util.List;
import java.util.Optional;

import com.yourideasmatter.postsandcomments.models.Comment;
import com.yourideasmatter.postsandcomments.repositories.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> allComments() {
        return (List<Comment>) commentRepository.findAll();
    }
    
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }
    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }
    public Comment updatePost(Comment comment) {
        return saveComment(comment);
    }
    public Comment deletePost(Long id) {
        Comment findPost = commentRepository.findById(id).get();
        if (findPost != null)
            commentRepository.deleteById(id);
        return findPost;
    }
    
    
}
