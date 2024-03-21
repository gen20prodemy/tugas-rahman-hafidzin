package com.pos.gen20javaspringbootpos.repository;

import com.pos.gen20javaspringbootpos.entity.Products;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ProductsRepository
        extends JpaRepository<Products, Integer> {


}
