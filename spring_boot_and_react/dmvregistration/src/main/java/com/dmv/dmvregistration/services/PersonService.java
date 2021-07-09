package com.dmv.dmvregistration.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.dmv.dmvregistration.models.Person;
import com.dmv.dmvregistration.repositories.PersonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepo personRepo;
    
    public List<Person> findAllPersons() {
        return personRepo.findAll();
    }
    public Person findById(Long id) {
        Optional<Person> person = personRepo.findById(id);
        return person.get();
    }
    public Person save(Person newPerson) {
        return personRepo.save(newPerson);
    }
    
    
}
