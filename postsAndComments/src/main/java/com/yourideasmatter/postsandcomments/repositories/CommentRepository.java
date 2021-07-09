package com.yourideasmatter.postsandcomments.repositories;

import com.yourideasmatter.postsandcomments.models.Comment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {
    
    
}
