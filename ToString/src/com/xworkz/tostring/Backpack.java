package com.xworkz.tostring;

public class Backpack {
    private String brand;
    private int compartments;
    private boolean isWaterproof;

    public Backpack(String brand, int compartments, boolean isWaterproof) {
        this.brand = brand;
        this.compartments = compartments;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " compartments are " + this.compartments +
                " waterproof is " + this.isWaterproof;
    }
}
