package com.arithmetic.controller;

import com.arithmetic.model.TambahRequest;
import com.arithmetic.service.TambahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tambah")
public class TambahController {

    private TambahService tambahService;

    @Autowired
    public TambahController(TambahService tambahservice){
        this.tambahService = tambahservice;
    }

    @PostMapping
    public TambahRequest penambahan(@RequestBody TambahRequest tambah){
        tambahService.setHasil(tambah);
        return tambahService.getTambah();
    }
}
