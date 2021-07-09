package com.socialflow.dojooverflow.repositories;

import javax.persistence.Entity;

import com.socialflow.dojooverflow.models.Question;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
    
}
