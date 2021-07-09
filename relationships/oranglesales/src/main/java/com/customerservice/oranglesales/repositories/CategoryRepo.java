package com.customerservice.oranglesales.repositories;

import com.customerservice.oranglesales.models.Category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long> {
    
}
