package com.customerservice.oranglesales.controllers;

import com.customerservice.oranglesales.models.Product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ProductCategoryController {

    @GetMapping("/product")
    public String products(@ModelAttribute("productObj") Product product, Model model) {
        
        return "product";
    }

    
}
