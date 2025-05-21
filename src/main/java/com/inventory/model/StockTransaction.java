package com.inventory.model;

import java.util.Date;

public class StockTransaction {
    private Date date;
    private String username;
    private String productName;
    private String type; // "Ekleme" ya da "Çıkarma"
    private int quantity;

    public StockTransaction() {}

    public StockTransaction(Date date, String username, String productName, String type, int quantity) {
        this.date = date;
        this.username = username;
        this.productName = productName;
        this.type = type;
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
