package com.productservices.sales.repositories;

import java.util.Optional;
import com.productservices.sales.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    Optional<Product> findById(Long id);
    
}
