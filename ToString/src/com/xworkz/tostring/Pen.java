package com.xworkz.tostring;

public class Pen {
    private String brand;
    private String color;
    private double price;

    public Pen(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " color is " + this.color +
                " price is ₹" + this.price;
    }
}
