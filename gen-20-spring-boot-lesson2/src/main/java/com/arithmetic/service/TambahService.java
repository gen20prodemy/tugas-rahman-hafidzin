package com.arithmetic.service;

import com.arithmetic.model.TambahRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TambahService {

    private TambahRequest tambah;

    public TambahService(){
        this.tambah = new TambahRequest();
    }
    public void setHasil(TambahRequest tambah){
        this.tambah.setNum1(tambah.getNum1());
        this.tambah.setNum2(tambah.getNum2());
        this.tambah.setSum();
    }

    public TambahRequest getTambah(){
        return tambah;
    }

}
