package com.example.ecommerceapp;

public class Product {
    public final String name;
    public final String price;
    public final int imageResId;

    public Product(String name, String price, int imageResId) {
        this.name = name;
        this.price = price;
        this.imageResId = imageResId;
    }
}