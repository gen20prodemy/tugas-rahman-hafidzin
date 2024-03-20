package com.arithmetic.controller;

import com.arithmetic.model.KurangRequest;
import com.arithmetic.service.KurangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/kurang")
public class KurangController {

    private KurangService kurangService;

    @Autowired
    public KurangController(KurangService kurangService){
        this.kurangService = kurangService;
    }

    @PostMapping
    public KurangRequest pengurangan(@RequestBody KurangRequest kurang){
        kurangService.setKurang(kurang);
        return kurangService.getKurang();
    }
}
