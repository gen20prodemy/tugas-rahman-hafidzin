package com.pos.gen20javaspringbootpos.entity;


import com.pos.gen20javaspringbootpos.model.ProductsRequest;
import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "product")
public class Products {

    @Id
    @SequenceGenerator(
            name = "product_id_sequence",
            sequenceName = "product_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_id_sequence"
    )
    private Integer product_id;
    private String product_name;
    private Integer product_qty;

    public Products(Integer product_id, String product_name, Integer product_qty) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_qty = product_qty;
    }

    public Products(){}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return product_id == products.product_id && product_qty == products.product_qty && Objects.equals(product_name, products.product_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, product_name, product_qty);
    }

    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_qty=" + product_qty +
                '}';
    }
}
