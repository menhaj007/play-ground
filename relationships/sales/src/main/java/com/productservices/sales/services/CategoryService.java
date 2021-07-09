// package com.productservices.sales.services;

// import java.util.List;

// import com.productcats.productcategorysales.models.Category;
// import com.productcats.productcategorysales.repositories.CategoryRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class CategoryService {
//     @Autowired
//     private CategoryRepository cRepo;

//     public List<Category> getAllCategories() {
//         return (List<Category>) cRepo.findAll();
//     }
//     public Category create(Category category) {
//         return cRepo.save(category);
//     }
//     public Category getACategory(Long id) {
//         return cRepo.findById(id).get();
//     }
    
// }
