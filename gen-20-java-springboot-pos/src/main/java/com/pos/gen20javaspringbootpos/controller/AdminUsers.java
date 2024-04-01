package com.pos.gen20javaspringbootpos.controller;


import com.pos.gen20javaspringbootpos.dto.RequestResponse;
import com.pos.gen20javaspringbootpos.entity.Products;
import com.pos.gen20javaspringbootpos.model.ProductsRequest;
import com.pos.gen20javaspringbootpos.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminUsers {

    @Autowired
    private ProductsRepository productRepo;

    @GetMapping("/public/product")
    public ResponseEntity<Object> getAllProduct(){
        return ResponseEntity.ok(productRepo.findAll());
    }

    @PostMapping("/admin/saveproduct")
    public ResponseEntity<Object> signUp(@RequestBody ProductsRequest pr){
        Products prods = new Products();
        prods.setProduct_name(pr.getProduct_name());
        prods.setProduct_qty(pr.getProduct_qty());
        prods.setCategory(pr.getCategory());
        return ResponseEntity.ok(productRepo.save(prods));
    }

    @GetMapping("/user/alone")
    public ResponseEntity<Object> userAlone(){
        return ResponseEntity.ok("Users alone access");
    }

    @GetMapping("/adminuser/both")
    public ResponseEntity<Object> bothAdminUserApi(){
        return ResponseEntity.ok("Both Admin and User can access this API");
    }
}
