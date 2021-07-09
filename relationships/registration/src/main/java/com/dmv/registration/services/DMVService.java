package com.dmv.registration.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.dmv.registration.models.License;
import com.dmv.registration.models.Person;
import com.dmv.registration.repositories.*;

@Service
public class DMVService {
    @Autowired
    private LicenseRepository licenseRepo;
    @Autowired
    private PersonRepository personRepo;

    public List<Person> personList() {
        return personRepo.findAll();
    }


    public List<License> licenseList() {
        return (List<License>)  licenseRepo.findAll();
    }
    public License getL() {
        License l = personRepo.findById(1l).get().getLicense();
        return l;
    }

    public Optional<Person> getAPerson(Long id) {
        return personRepo.findById(id);
    }


    public Optional<License> getLicense(Long id) {
        return licenseRepo.findById(id);
    }


    
    
    
}
