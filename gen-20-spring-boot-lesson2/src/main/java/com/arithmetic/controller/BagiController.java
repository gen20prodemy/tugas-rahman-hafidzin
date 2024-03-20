package com.arithmetic.controller;

import com.arithmetic.model.BagiRequest;
import com.arithmetic.service.BagiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/bagi")
public class BagiController {

    private BagiService bagiService;

    @Autowired
    public BagiController(BagiService bagiservice){
        this.bagiService = bagiservice;
    }

    @PostMapping
    public BagiRequest pembagian(@RequestBody BagiRequest bagi){
        bagiService.setBagi(bagi);
        return bagiService.getBagi();
    }
}
