package com.pos.gen20javaspringbootpos.repository;

import com.pos.gen20javaspringbootpos.entity.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface ProductsRepository
        extends JpaRepository<Products, Integer> {

    @Query("FROM Products WHERE product_name = ?1")
    List<Products> findByProductName(String productName);

    @Query(value = "SELECT * FROM product WHERE product_qty < ?1", nativeQuery = true)
    List<Products> getProductQty(Integer qty);
}
