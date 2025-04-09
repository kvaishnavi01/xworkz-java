package com.xworkz.tostring;

public class Headphones {
    private String brand;
    private int price;
    private boolean hasMic;

    public Headphones(String brand, int price, boolean hasMic) {
        this.brand = brand;
        this.price = price;
        this.hasMic = hasMic;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " price is " + this.price + " has mic is " + this.hasMic;
    }
}
