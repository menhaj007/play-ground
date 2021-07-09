package com.socialflow.dojooverflow.repositories;

import javax.persistence.Entity;

import com.socialflow.dojooverflow.models.Tag;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
    
}
