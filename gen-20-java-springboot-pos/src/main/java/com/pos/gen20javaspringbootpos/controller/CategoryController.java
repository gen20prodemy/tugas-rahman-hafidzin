package com.pos.gen20javaspringbootpos.controller;


import com.pos.gen20javaspringbootpos.entity.Category;
import com.pos.gen20javaspringbootpos.model.CategoryRequest;
import com.pos.gen20javaspringbootpos.repository.CategoryRepository;
import com.pos.gen20javaspringbootpos.repository.ProductsRepository;
import com.pos.gen20javaspringbootpos.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryRepository catRepo;
    @Autowired
    private CategoryService cs;

//    @PostMapping("/input")
//    public Category postCat(@RequestBody CategoryRequest cr){
//        return catRepo.save(cs.inputCat(cr));
//    }

    @PostMapping("/input/query")
    public Category saveCat(@RequestBody CategoryRequest cr){
        return cs.saveCat(cr);
    }
}
