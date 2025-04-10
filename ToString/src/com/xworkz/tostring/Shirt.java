package com.xworkz.tostring;

public class Shirt {
    private String color;
    private char size;
    private double price;

    public Shirt(String color, char size, double price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "color is " + this.color + " size is " + this.size + " price is " + this.price;
    }
    @Override
    public int hashCode(){
        return 54;
    }
}