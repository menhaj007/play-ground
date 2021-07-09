package com.productcats.productcategorysales.repositories;

import com.productcats.productcategorysales.models.CategoryProduct;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryProductRepo extends CrudRepository<CategoryProduct, Long> {
    
}
