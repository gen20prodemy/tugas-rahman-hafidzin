package com.pos.gen20javaspringbootpos.controller;


import com.pos.gen20javaspringbootpos.service.RajaOngkirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/api")
public class RajaOngkirController {


    @Autowired
    RajaOngkirService ros;
    @GetMapping("/province")
    public Object provinceApi(){
        return ros.fetchAPI();
    }

    @PostMapping("/cost")
//    @Scheduled(cron = "*/10 * * * * *")
    public Object costApi(){
        return ros.fetchCost();
    }
    @PostMapping("/cost/detail")
    public Object costApiDetail(){
        return ros.fetchCostDetail();
    }
}
