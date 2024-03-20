package com.arithmetic.model;


public class KurangRequest {

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getMinus() {
        return minus;
    }

    public void setMinus() {
        this.minus = num1 - num2;
    }

    private int num1;
    private int num2;

    public KurangRequest(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public KurangRequest(){}

    private int minus;
}
