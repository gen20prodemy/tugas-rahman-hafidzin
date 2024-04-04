package com.pos.gen20javaspringbootpos.service;

import com.pos.gen20javaspringbootpos.entity.OurUsers;
import com.pos.gen20javaspringbootpos.model.CategoryRequest;

import java.util.List;

public interface RedisService {


    boolean saveRedis(CategoryRequest categoryRequest);

    List<CategoryRequest> fetchAll();
}
