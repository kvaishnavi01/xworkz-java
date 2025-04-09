package com.xworkz.tostring;

public class Sharpener {
    private String brand;
    private int bladeCount;
    private boolean hasContainer;

    public Sharpener(String brand, int bladeCount, boolean hasContainer) {
        this.brand = brand;
        this.bladeCount = bladeCount;
        this.hasContainer = hasContainer;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " blade count is " + this.bladeCount + " container is " + this.hasContainer;
    }
}
