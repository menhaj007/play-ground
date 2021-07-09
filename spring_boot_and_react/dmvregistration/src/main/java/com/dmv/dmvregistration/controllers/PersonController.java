package com.dmv.dmvregistration.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import com.dmv.dmvregistration.models.Person;
import com.dmv.dmvregistration.services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/person/", method = RequestMethod.GET)
public class PersonController {
    @Autowired
    private PersonService personService;

    // @GetMapping("show")
    // public String getAllPersons() {
    //     System.out.println("You visited here." + personService.findAllPersons());
    //     return "Hello world";
    // }

    @GetMapping("show")
    public ArrayList<Person> showHome() {
        return (ArrayList<Person>) personService.findAllPersons();
    }

    @PostMapping("create")
    public Person savePerson(@Valid @RequestBody Person person) {
        return personService.save(person);
    }
    @GetMapping("{id}")
    public Person findById(@PathVariable("id") Long id) {
        return personService.findById(id);
    }
    
    
}
