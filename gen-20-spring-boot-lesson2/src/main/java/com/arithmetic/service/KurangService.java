package com.arithmetic.service;


import com.arithmetic.model.KurangRequest;
import org.springframework.stereotype.Service;

@Service
public class KurangService {


    private KurangRequest kurang;

    public KurangService(){
        this.kurang = new KurangRequest();
    }

    public void setKurang(KurangRequest kurang) {
        this.kurang.setNum1(kurang.getNum1());
        this.kurang.setNum2(kurang.getNum2());
        this.kurang.setMinus();
    }

    public KurangRequest getKurang(){
        return kurang;
    }
}
