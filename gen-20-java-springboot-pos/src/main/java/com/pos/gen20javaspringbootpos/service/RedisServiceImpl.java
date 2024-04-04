package com.pos.gen20javaspringbootpos.service;


import com.pos.gen20javaspringbootpos.entity.OurUsers;
import com.pos.gen20javaspringbootpos.model.CategoryRequest;
import com.pos.gen20javaspringbootpos.repository.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedisServiceImpl implements RedisService{

    @Autowired
    private RedisDao redisDao;

    @Override
    public boolean saveRedis(CategoryRequest categoryRequest) {
        return redisDao.saveRedis(categoryRequest);
    }

    @Override
    public List<CategoryRequest> fetchAll() {
        return redisDao.fetchAll();
    }
}
