package com.pos.gen20javaspringbootpos.repository;

import com.pos.gen20javaspringbootpos.entity.OurUsers;
import com.pos.gen20javaspringbootpos.model.CategoryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RedisDaoImpl implements RedisDao {

    @Autowired
    private RedisTemplate redisTemplate;
    private static final String KEY = "data";
    @Override
    public boolean saveRedis(CategoryRequest categoryRequest) {
        try{
            redisTemplate.opsForValue().set(KEY, categoryRequest.getCategoryId());
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<CategoryRequest> fetchAll() {
        List<CategoryRequest> users;
        users = redisTemplate.opsForHash().values(KEY);
        return users;
    }
}
