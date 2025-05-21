package com.inventory.model;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private Category category; // Yeni ekledik
    private double price;      // Yeni ekledik

    public Product() {}

    // Sadece isim ve adet için kullanılan constructor
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Tüm alanlar için constructor
    public Product(int id, String name, Category category, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    // Bu constructor eksikti – DAO içinde kullanılıyor!
    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    // Getter ve Setter'lar
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
