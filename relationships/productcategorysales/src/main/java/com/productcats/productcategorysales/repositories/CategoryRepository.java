package com.productcats.productcategorysales.repositories;

import java.util.Optional;

import com.productcats.productcategorysales.models.Category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findById(Long id);
    
}
