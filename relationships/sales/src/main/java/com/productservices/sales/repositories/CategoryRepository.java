package com.productservices.sales.repositories;

import java.util.Optional;


import com.productservices.sales.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findById(Long id);
    
}
