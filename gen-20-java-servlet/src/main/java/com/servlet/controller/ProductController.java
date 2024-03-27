package com.servlet.controller;


import com.servlet.entity.Product;
import com.servlet.model.ProductModel;
import com.servlet.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository pr;

    @GetMapping("/create")
    public String createPage(Model model){
        ProductModel productM = new ProductModel();
        model.addAttribute("productM", productM);
        return "createProduct";
    }

    @PostMapping("/create")
    public String createProduct(
            @ModelAttribute ProductModel productM
    ){
        Product p = new Product();
        p.setProduct_name(productM.getProduct_name());
        p.setProduct_qty(productM.getProduct_qty());
        p.setCategory(productM.getCategory());
        pr.save(p);
        return "redirect:/";
    }

}
