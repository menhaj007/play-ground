package com.yourideasmatter.postsandcomments.services;

import java.util.List;
import java.util.Optional;

import com.yourideasmatter.postsandcomments.models.Post;
import com.yourideasmatter.postsandcomments.models.User;
import com.yourideasmatter.postsandcomments.repositories.PostRepository;
import com.yourideasmatter.postsandcomments.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PostRepository postRepository;
    public List<Post> allPosts() {
        return (List<Post>) postRepository.findAll();
    }
    
    public Post savePost(Post post) {
        return postRepository.save(post);
    }
    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }
    public Post updatePost(Post post) {
        return savePost(post);
    }
    public Post deletePost(Long id) {
        Post findPost = postRepository.findById(id).get();
        if (findPost != null)
            postRepository.deleteById(id);
        return findPost;
    }
    
    
}
