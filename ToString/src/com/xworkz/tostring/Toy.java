package com.xworkz.tostring;

public class Toy {
    private String name;
    private double price;
    private String type;

    public Toy(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "name is " + this.name +
                " price is " + this.price +
                " type is " + this.type;
    }
}
