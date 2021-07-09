package com.customerservice.oranglesales.services;

import com.customerservice.oranglesales.repositories.CategoryRepo;
import com.customerservice.oranglesales.repositories.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryProductService {
    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private ProductRepo productRepo;


    
}
