package com.yourideasmatter.postsandcomments.repositories;

import java.util.Optional;

import com.yourideasmatter.postsandcomments.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    Optional<User> findById(Long id);
    User findByEmail(String email);
}
