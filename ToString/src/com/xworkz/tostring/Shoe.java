package com.xworkz.tostring;

public class Shoe {
    private String brand;
    private int size;
    private String type;

    public Shoe(String brand, int size, String type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " size is " + this.size +
                " type is " + this.type;
    }
}
