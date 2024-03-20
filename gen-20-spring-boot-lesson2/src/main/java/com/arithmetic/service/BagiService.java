package com.arithmetic.service;

import com.arithmetic.model.BagiRequest;
import org.springframework.stereotype.Service;

@Service
public class BagiService {

    private BagiRequest bagi;

    public BagiService(){
        this.bagi = new BagiRequest();
    }

    public void setBagi(BagiRequest bagi){
        this.bagi.setNum1(bagi.getNum1());
        this.bagi.setNum2(bagi.getNum2());
        this.bagi.setDiv();
    }

    public BagiRequest getBagi(){
        return bagi;
    }
}
