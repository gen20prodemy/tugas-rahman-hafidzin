package com.pos.gen20javaspringbootpos.repository;

import com.pos.gen20javaspringbootpos.entity.Category;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {


    @Modifying
    @Transactional
    @Query(value = "INSERT INTO category VALUES (nextval('category_id'), ?1)",
            nativeQuery = true)
    void insertWithQuery(String category_name);

}
