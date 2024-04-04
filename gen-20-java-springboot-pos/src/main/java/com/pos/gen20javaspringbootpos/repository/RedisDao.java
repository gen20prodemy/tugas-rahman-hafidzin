package com.pos.gen20javaspringbootpos.repository;

import com.pos.gen20javaspringbootpos.entity.OurUsers;
import com.pos.gen20javaspringbootpos.model.CategoryRequest;

import java.util.List;

public interface RedisDao {
    boolean saveRedis(CategoryRequest categoryRequest);

    List<CategoryRequest> fetchAll();
}
