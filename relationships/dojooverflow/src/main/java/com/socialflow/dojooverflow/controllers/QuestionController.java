package com.socialflow.dojooverflow.controllers;

import javax.validation.Valid;

import com.socialflow.dojooverflow.models.Question;
import com.socialflow.dojooverflow.services.TagQuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/questions", method = RequestMethod.GET)
public class QuestionController {
    @Autowired
    private TagQuestionService tQS;
    
    @GetMapping("")
    public String getQuestion(Model model) {
        return "index";
    }
    
    @GetMapping("/new")
    public String createQuestion(@ModelAttribute("questionObj") Question question) {
        return "newQuestion";
    }
    // @PostMapping("/new")
    // public String saveQuestion(@Valid @ModelAttribute("questionObj") Question question, BindingResult result) {
    // //     if (result.hasErrors()) {
    // //         return "newQuestion";
    // //     }
    // //     tQS.createQuestion(question);
    //     return "redirect:/questions/new";
    // }
    
}
