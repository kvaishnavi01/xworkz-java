package com.xworkz.tostring;

public class Microwave {
    private String brand;
    private int power;
    private boolean hasGrillFunction;

    public Microwave(String brand, int power, boolean hasGrillFunction) {
        this.brand = brand;
        this.power = power;
        this.hasGrillFunction = hasGrillFunction;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " power is " + this.power + "W" +
                " grill function is " + this.hasGrillFunction;
    }
}
