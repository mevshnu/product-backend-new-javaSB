package com.example.product_backend_new.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private int productCode;
    private String name;
    private String mgDate;
    private String exDate;
    private String brand;
    private int price;
    private String sellerName;
    private String distributorName;

    public Product() {
    }

    public Product(int id, int productCode, String name, String mgDate, String exDate, String brand, int price, String sellerName, String distributorName) {
        this.id = id;
        this.productCode = productCode;
        this.name = name;
        this.mgDate = mgDate;
        this.exDate = exDate;
        this.brand = brand;
        this.price = price;
        this.sellerName = sellerName;
        this.distributorName = distributorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMgDate() {
        return mgDate;
    }

    public void setMgDate(String mgDate) {
        this.mgDate = mgDate;
    }

    public String getExDate() {
        return exDate;
    }

    public void setExDate(String exDate) {
        this.exDate = exDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }
}
