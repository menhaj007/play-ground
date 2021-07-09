package com.dmv.dmvregistration.controllers;

import java.util.ArrayList;
import java.util.Optional;

import javax.validation.Valid;

import com.dmv.dmvregistration.models.License;
import com.dmv.dmvregistration.models.Person;
import com.dmv.dmvregistration.repositories.PersonRepo;
import com.dmv.dmvregistration.services.LicenseService;
import com.dmv.dmvregistration.services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/license/")
public class LicenseController {
    @Autowired
    private LicenseService licenseService;

    @Autowired
    private PersonService personService;

    @GetMapping("all")
    public ArrayList<License> all() {
        return (ArrayList<License>) licenseService.showAllLicenses();
    }
    @PostMapping("create/{id}")
    public void save(@Valid @RequestBody License license, @PathVariable("id") Long id) {

        Person p1 = personService.findById(id);
        // System.out.println(p1);
        // System.out.println("Id: " + license.getId());
        // System.out.println(license.getNumber());
        // System.out.println(license.getState());
        // System.out.println(license.getExpirationDate());
        // System.out.println(license.getPerson());
        license.setPerson(p1);
        p1.setLicense(license);
        licenseService.save(license);
        
        
        
    }
    // @PostMapping("/license/save")
    // public License save(License newLicense, Long personId) {
    //     License license = null;
    //     Optional<Person> person = personRepo.findById(personId);
    //     if (person != null) {
    //         license = licenseService.save(newLicense);
    //     }
    //     return license;
    // }
    
}
