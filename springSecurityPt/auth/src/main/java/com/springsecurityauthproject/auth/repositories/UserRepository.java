package com.springsecurityauthproject.auth.repositories;

import com.springsecurityauthproject.auth.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);
}
