package com.dmv.registration.repositories;

import java.util.List;
import java.util.Optional;

import com.dmv.registration.models.Person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findAll();
    Optional<Person> findById(Long id);
    
}
