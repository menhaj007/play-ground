package com.productservices.sales.services;

import java.util.List;

import com.productservices.sales.models.Category;
import com.productservices.sales.models.CategoryProduct;
import com.productservices.sales.models.Product;
import com.productservices.sales.repositories.CategoryProductRepo;
import com.productservices.sales.repositories.CategoryRepository;
import com.productservices.sales.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCatService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryProductRepo categoryProductRepo;

    //product service
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }
    public Product create(Product product) {
        return productRepository.save(product);
    }
    public Product findAProduct(Long id) {
        return productRepository.findById(id).get();
    }

//cat service
    public List<Category> getAllCategories() {
        return (List<Category>) categoryRepository.findAll();
    }
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
    public Category getACategory(Long id) {
        return categoryRepository.findById(id).get();
    }

    public CategoryProduct saveCategoryProduct(CategoryProduct cp) {
        return categoryProductRepo.save(cp);
    }
    
}
