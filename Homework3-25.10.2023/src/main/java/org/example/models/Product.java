package org.example.models;

public class Product {
    private String name;
    private int id;
    private int price;
    private int stockAmount;
    Category category;

    public Product(String name, int id, int price, int stockAmount, Category category) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.stockAmount = stockAmount;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
