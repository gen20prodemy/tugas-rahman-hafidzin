package com.pos.gen20javaspringbootpos.service;

import com.pos.gen20javaspringbootpos.entity.Products;
import com.pos.gen20javaspringbootpos.model.ProductsRequest;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {


    public Products inputProduct(ProductsRequest pr){
        Products prods = new Products();
        prods.setProduct_name(pr.getProduct_name());
        prods.setProduct_qty(pr.getProduct_qty());
        return prods;
    }

}
