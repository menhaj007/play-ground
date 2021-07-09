// package com.productcats.productcategorysales.controllers;

// import java.util.List;

// import javax.validation.Valid;

// import com.productcats.productcategorysales.models.Category;
// import com.productcats.productcategorysales.models.CategoryProduct;
// import com.productcats.productcategorysales.models.Product;
// import com.productcats.productcategorysales.repositories.CategoryProductRepo;
// import com.productcats.productcategorysales.repositories.CategoryRepository;
// import com.productcats.productcategorysales.services.CatProdService;
// import com.productcats.productcategorysales.services.CategoryService;
// import com.productcats.productcategorysales.services.ProductService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.validation.BindingResult;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;

// @Controller
// public class ProductController {
//     @Autowired
//     private ProductService productSer;
//     @Autowired
//     private CategoryService cS;
//     @Autowired
//     private CatProdService cPR;

//     @GetMapping("/product")
//     public String allProducts(Model model) {
//         model.addAttribute("allProducts", productSer.getAllProducts());
//         List<Product> pList = productSer.getAllProducts();
//         for (Product p: pList) {
//             System.out.println(p.getDescription());
//         }
//         return "product.html";
//     }
//     @PostMapping("/product/new")
//     public String saveProduct(@Valid @ModelAttribute("productObj") Product product, BindingResult result) {
//         if (result.hasErrors()) {
//             return "newproduct.html";
//         }
//         System.out.println(
//             product.getName() + "\n" +
//             product.getDescription()
//         );
//         Product newProduct = productSer.create(product);
//         return "redirect:/product/" +newProduct.getId();
//     }
//     @GetMapping("/product/new")
//     public String saveProduct( @ModelAttribute("productObj") Product product) {
//         return "newproduct.html";
//     }
//     @GetMapping("/product/{id}")
//     public String showAProduct(@PathVariable("id") Long id, Model model, @ModelAttribute("categoryObj") Category category) {
//         model.addAttribute("product", productSer.findAProduct(id));
//         List<Category> allCats = cS.getAllCategories();
//         model.addAttribute(("allCats"), allCats);
//         return "singleproductpage.html";
//     }
//     @PostMapping("/addtocat")
//     public String addToCategory(@Valid @ModelAttribute("cpObj") CategoryProduct cp, BindingResult result) {
//         if (result.hasErrors())
//             return "singleproductpage.html";
//             System.out.println(cp.getId());
//         return "redirect:/product/"+cp.getProduct().getId();
//     }


// }