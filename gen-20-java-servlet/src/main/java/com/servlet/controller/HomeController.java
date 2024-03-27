package com.servlet.controller;


import com.servlet.entity.Product;
import com.servlet.repository.ProductRepository;
import com.servlet.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private ProductService ps;
    @Autowired
    private ProductRepository pr;

    @GetMapping("")
    public String welcomeMsg(Model model){
        List<Product> product = pr.findAll();
        model.addAttribute("product", product);
        model.addAttribute("h1", "Welcome page.");
        return "index";
    }

}
