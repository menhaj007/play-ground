package com.productservices.sales.repositories;


import com.productservices.sales.models.CategoryProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryProductRepo extends CrudRepository<CategoryProduct, Long> {
    
}
