package com.pos.gen20javaspringbootpos.repository;

import com.pos.gen20javaspringbootpos.entity.Category;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {


    @Modifying
    @Transactional
    @Query(value = "INSERT INTO category (category_id, category_name) VALUES " +
            "(nextval('category_id') , :category_name)", nativeQuery = true)
    void insertWithQuery(@Param("category_name") String category_name);

}
