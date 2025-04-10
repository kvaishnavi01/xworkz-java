package com.xworkz.tostring;

public class Watch {
    private String brand;
    private String type;
    private double price;

    public Watch(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " type is " + this.type +
                " price is ₹" + this.price;
    }
    @Override
    public int hashCode(){
        return 10;
    }
}
