package com.pos.gen20javaspringbootpos.controller;


import com.pos.gen20javaspringbootpos.entity.Products;
import com.pos.gen20javaspringbootpos.model.ProductsRequest;
import com.pos.gen20javaspringbootpos.repository.ProductsRepository;
import com.pos.gen20javaspringbootpos.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductsController {

    @Autowired
    private ProductsService ps;

    private ProductsRepository productsRepo;

    @Autowired
    public ProductsController(ProductsRepository productsRepo) {
        this.productsRepo = productsRepo;
    }
    public ProductsController(){}

//    @GetMapping("/getmap")
//    public List<Products> productsList() {
//        return List.of(
//                new Products(
//                    1, "Indomie", 4
//                ),
//                new Products(
//                        2,"Marimas", 6
//                )
//        );
//    }

    @GetMapping("/list")
    public List<Products> showProducts(){
        return productsRepo.findAll();
    }
    @PostMapping("/input")
    public Products postProduct(@RequestBody ProductsRequest pr) {
        return productsRepo.save(ps.inputProduct(pr));
    }

    @DeleteMapping("{productId}")
    public void deleteId(@PathVariable("productId") Integer id){
        productsRepo.deleteById(id);
    }

}
