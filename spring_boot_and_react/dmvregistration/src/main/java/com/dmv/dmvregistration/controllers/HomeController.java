// package com.dmv.dmvregistration.controllers;

// import java.util.ArrayList;

// import javax.validation.Valid;

// import com.dmv.dmvregistration.models.Person;
// import com.dmv.dmvregistration.repositories.PersonRepo;
// import com.dmv.dmvregistration.services.PersonService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping(value="/api/person/", method = RequestMethod.GET)
// public class HomeController {
//     @Autowired
//     private PersonService personService;

//     @GetMapping("show")
//     public ArrayList<Person> showHome() {
//         return (ArrayList<Person>) personService.findAllPersons();
//     }

//     @GetMapping("{id}")
//     public Person findById(@PathVariable("id") Long id) {
//         Person person = personService.findById(id);
//         return person;
//     }
//     @PostMapping("/save")
//     public Person save(@Valid @RequestBody Person newPerson) {
//         return personService.save(newPerson);
//     }

    
// }
