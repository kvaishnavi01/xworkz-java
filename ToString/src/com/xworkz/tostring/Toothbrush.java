package com.xworkz.tostring;

public class Toothbrush {
    private String brand;
    private int bristleCount;
    private boolean isElectric;

    public Toothbrush(String brand, int bristleCount, boolean isElectric) {
        this.brand = brand;
        this.bristleCount = bristleCount;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " bristle count is " + this.bristleCount + " electric is " + this.isElectric;
    }
}
