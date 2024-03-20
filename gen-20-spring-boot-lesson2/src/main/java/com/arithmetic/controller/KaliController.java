package com.arithmetic.controller;

import com.arithmetic.model.KaliRequest;
import com.arithmetic.service.KaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/kali")
public class KaliController {

    private KaliService kaliService;

    @Autowired
    public KaliController(KaliService kaliService){
        this.kaliService = kaliService;
    }

    @PostMapping
    public KaliRequest perkalian(@RequestBody KaliRequest kali){
        kaliService.setKali(kali);
        return kaliService.getKali();
    }
}
