// package com.productcats.productcategorysales.controllers;

// import javax.validation.Valid;

// import com.productcats.productcategorysales.models.Category;
// import com.productcats.productcategorysales.services.CategoryService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.validation.BindingResult;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;

// @Controller
// public class CategoryController {
//     @Autowired
//     private CategoryService sC;
    

//     @GetMapping("/category")
//     public String showAllCats(Model model) {
//         model.addAttribute("allCats", sC.getAllCategories());
//         return "category.html";
//     }
//     @GetMapping("/cat/new")
//     public String create(@ModelAttribute("catObj") Category category, Model model) {
//         return "newCategory.html";
//     }

//     @PostMapping("/cat/new")
//     public String createCats(@Valid @ModelAttribute("catObj") Category category, BindingResult result) {
//         if (result.hasErrors())
//             return "newCategory.html";
//         Category cat = sC.create(category);
//         return "redirect:/cat/" +cat.getId();
//     }
//     @GetMapping("/cat/{id}")
//     public String showACategory(@PathVariable("id") Long id, Model model) {
//         Category cat = sC.getACategory(id);
//         model.addAttribute("cat", cat);
//         return "catInfo.html";
//     }
    
// }
