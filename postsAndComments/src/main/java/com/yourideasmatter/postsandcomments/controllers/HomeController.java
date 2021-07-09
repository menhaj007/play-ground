package com.yourideasmatter.postsandcomments.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController //This will take care of JSON type files. Use RestController for REST API and @Controller for viewing models
@RequestMapping(value = "/home", method = RequestMethod.GET)
public class HomeController {
    
    @GetMapping
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }

}
