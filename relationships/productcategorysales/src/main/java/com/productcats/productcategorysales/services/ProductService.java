package com.productcats.productcategorysales.services;

import java.util.List;

import com.productcats.productcategorysales.models.Category;
import com.productcats.productcategorysales.models.Product;
import com.productcats.productcategorysales.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }
    public Product create(Product product) {
        return productRepository.save(product);
    }
    public Product findAProduct(Long id) {
        return productRepository.findById(id).get();
    }

    
}
