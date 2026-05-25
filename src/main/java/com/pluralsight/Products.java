package com.pluralsight;

public class Products {

    //add variables
    private int id;
    private String name;
    private float price;

    //add constructors

    public Products(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //add getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
