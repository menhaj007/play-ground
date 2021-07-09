package com.dmv.dmvregistration.repositories;

import java.util.List;
import java.util.Optional;

import com.dmv.dmvregistration.models.License;
import com.dmv.dmvregistration.models.Person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long> {
    Optional<Person> findById(Long id);
    List<Person> findAll();
    List<Person> findByFirstName(String firstName);
    List<Person> findByLastName(String lastName);
    List<Person> findByLicense(License license);

}