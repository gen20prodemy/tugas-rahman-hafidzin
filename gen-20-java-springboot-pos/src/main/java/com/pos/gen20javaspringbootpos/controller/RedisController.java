package com.pos.gen20javaspringbootpos.controller;

import com.pos.gen20javaspringbootpos.entity.OurUsers;
import com.pos.gen20javaspringbootpos.model.CategoryRequest;
import com.pos.gen20javaspringbootpos.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @PostMapping("/user")
    public ResponseEntity<String> saveUser(@RequestBody CategoryRequest categoryRequest){
        boolean result = redisService.saveRedis(categoryRequest);
        if (result)
            return ResponseEntity.ok("berhasil");
            else
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/user")
    public ResponseEntity<List<CategoryRequest>> fetchAll(){
        List<CategoryRequest> categoryRequest;
        categoryRequest = redisService.fetchAll();
        return ResponseEntity.ok(categoryRequest);
    }
}
