package com.pos.gen20javaspringbootpos.controller;


import com.pos.gen20javaspringbootpos.entity.Category;
import com.pos.gen20javaspringbootpos.model.CategoryRequest;
import com.pos.gen20javaspringbootpos.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class AsyncController {

    @Autowired
    private AsyncService service;

    @PostMapping("/test/async")
    public ResponseEntity<CategoryRequest> processSave(@RequestBody CategoryRequest category) throws InterruptedException{
        service.processSave(category);
        //async
        service.notifyUser(category);
        service.assignVendor(category);
        service.packaging(category);
        service.assignDeliveryPartner(category);
        service.assignTrailerAndDispatch(category);
        return ResponseEntity.ok(category);
    }

}
