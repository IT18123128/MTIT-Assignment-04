package com.mtit.microservice.productservice.banksservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    private String productId;
    private String productName;
    private int prodQuan;

    public Product() {
    }

    public Product(String productId, String productName, int prodQuan) {
        this.productId = productId;
        this.productName = productName;
        this.prodQuan = prodQuan;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProdQuan() {
        return prodQuan;
    }

    public void setProdQuan(int prodQuan) {
        this.prodQuan = prodQuan;
    }
}
