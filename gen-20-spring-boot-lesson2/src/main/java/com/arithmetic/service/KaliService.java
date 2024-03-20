package com.arithmetic.service;

import com.arithmetic.model.KaliRequest;
import org.springframework.stereotype.Service;

@Service
public class KaliService {

    private KaliRequest kali;

    public KaliService(){
        this.kali = new KaliRequest();
    }

    public void setKali(KaliRequest kali){
        this.kali.setNum1(kali.getNum1());
        this.kali.setNum2(kali.getNum2());
        this.kali.setMulti();
    }

    public KaliRequest getKali(){
        return kali;
    }
}
