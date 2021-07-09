package com.yourideasmatter.postsandcomments.repositories;

import com.yourideasmatter.postsandcomments.models.Post;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long>{
    
}
