package com.productservices.sales.controllers;

import javax.validation.Valid;

import com.productservices.sales.models.Category;
import com.productservices.sales.models.CategoryProduct;
import com.productservices.sales.models.Product;
import com.productservices.sales.services.ProductCatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @Autowired
    ProductCatService productCatService;

    @GetMapping("/")
    public String welcome() {
        return "index";
    }

    @GetMapping("/product/new")
    public String addProduct(@ModelAttribute("productObj") Product product) {
        return "addProduct";
    }
    @PostMapping("/product/new")
    public String saveProduct(@Valid @ModelAttribute("productObj") Product product, BindingResult result) {
        if (!result.hasErrors()) {
            productCatService.create(product);
        }
        return "redirect:/product/new";

    }

    @GetMapping("/category/new")
    public String addProduct(@ModelAttribute("categoryObj") Category category) {
        return "addCategory";
    }
    @PostMapping("/category/new")
    public String saveProduct(@Valid @ModelAttribute("categoryObj") Category category, BindingResult result) {
        if (!result.hasErrors()) {
            productCatService.saveCategory(category);
        }
        return "redirect:/category/new";

    }

    @GetMapping("/product/{id}")
    public String products(@PathVariable("id") Long id, Model model, @ModelAttribute("categoryproductObj") CategoryProduct cP) {
        model.addAttribute("aProduct", productCatService.findAProduct(id));
        model.addAttribute("allCategories", productCatService.getAllCategories());
        // model.addAttribute("cp", attributeValue)
        return "addCategoriesToProduct";
    }
    @PostMapping("/addcategorytoproduct")
    public String addCategoriesToProduct(@ModelAttribute("categoryproductObj") CategoryProduct cP) {
        productCatService.saveCategoryProduct(cP);
        return "redirect:/product/"+ cP.getProduct().getId();
    }
    

    @GetMapping("/category/{id}")
    public String categoreis(@PathVariable("id") Long id, Model model, @ModelAttribute("categoryproductObj") CategoryProduct cP) {
        model.addAttribute("aCategory", productCatService.getACategory(id));
        model.addAttribute("allProducts", productCatService.getAllProducts());
        // model.addAttribute("cp", attributeValue)
        return "addProductToCategory";
    }
    @PostMapping("/addproducttocategory")
    public String addProductToCategory(@ModelAttribute("categoryproductObj") CategoryProduct cP) {
        productCatService.saveCategoryProduct(cP);
        return "redirect:/category/"+ cP.getCategory().getId();
    }

    // @GetMapping("categories/{categoryId}")
	// public String categoryAddProduct(@ModelAttribute("categoryProduct")CategoryProduct categoryProduct,@PathVariable("categoryId")Long id, Model model) {
	// 	model.addAttribute("products",productService.allExcludeProducts(productService.findCategoryById(id)));
	// 	model.addAttribute("category",productService.findCategoryById(id));
	// 	return "jsp/categoryPage.jsp";
	// }
	
	// @PostMapping("categories/{categoryId}")
	// public String addProductToCategory(@ModelAttribute("categoryProduct")CategoryProduct categoryProduct, @PathVariable("categoryId")Long id, Model model) {
	// 	categoryProduct.setCategory(productService.findCategoryById(id));
	// 	productService.joinCategoryToProduct(categoryProduct);
	// 	return"redirect:/categories/"+id;
	// }

    
}
