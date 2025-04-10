package com.xworkz.tostring;

public class Mobile {
    private String model;
    private int storage;
    private double price;

    public Mobile(String model, int storage, double price) {
        this.model = model;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "model is " + this.model +
                " storage is " + this.storage + "GB" +
                " price is ₹" + this.price;
    }
    @Override
    public int hashCode(){
        return 7;
    }
}
