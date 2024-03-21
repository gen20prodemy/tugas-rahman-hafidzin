package com.pos.gen20javaspringbootpos.model;


public class ProductsRequest {


    private Integer product_id;
    private String product_name;

    private Integer product_qty;

    public ProductsRequest(Integer product_id, String product_name, Integer product_qty) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_qty = product_qty;
    }

    public ProductsRequest() {    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(Integer product_qty) {
        this.product_qty = product_qty;
    }



}
