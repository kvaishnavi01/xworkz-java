package com.xworkz.tostring;

public class Tablet {
    private String brand;
    private double screenSize;
    private boolean supportsStylus;

    public Tablet(String brand, double screenSize, boolean supportsStylus) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.supportsStylus = supportsStylus;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " screen size is " + this.screenSize + " inches" +
                " stylus support is " + this.supportsStylus;
    }

    @Override
    public int hashCode(){
        return 20;
    }
}
