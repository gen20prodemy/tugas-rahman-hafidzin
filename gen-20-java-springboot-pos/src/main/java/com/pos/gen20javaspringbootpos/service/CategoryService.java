package com.pos.gen20javaspringbootpos.service;

import com.pos.gen20javaspringbootpos.entity.Category;
import com.pos.gen20javaspringbootpos.model.CategoryRequest;
import com.pos.gen20javaspringbootpos.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository catRepo;
//    public Category inputCat(CategoryRequest cr){
//
//    }

    public Category saveCat(CategoryRequest cr){
        Category cat = new Category();
        cat.setCategoryName(cr.getCategoryName());
        try {
            catRepo.insertWithQuery(cat.getCategoryName());
        } catch (Exception e){
            return null;
        }
        return cat;


    }
}
