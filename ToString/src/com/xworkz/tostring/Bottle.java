package com.xworkz.tostring;

public class Bottle {
    private String brand;
    private double volume;
    private boolean isReusable;

    public Bottle(String brand, double volume, boolean isReusable) {
        this.brand = brand;
        this.volume = volume;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " volume is " + this.volume + "L" +
                " reusable is " + this.isReusable;
    }
}
