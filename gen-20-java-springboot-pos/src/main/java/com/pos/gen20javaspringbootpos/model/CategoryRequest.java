package com.pos.gen20javaspringbootpos.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryRequest implements Serializable {

    private Integer categoryId;
    private String categoryName;


    public CategoryRequest(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public CategoryRequest(){}

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
