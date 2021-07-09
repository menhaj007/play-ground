package com.customerservice.oranglesales.repositories;

import com.customerservice.oranglesales.models.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
    
}
