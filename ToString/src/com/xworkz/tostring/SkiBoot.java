package com.xworkz.tostring;

public class SkiBoot {
    private String brand;
    private int size;
    private boolean isWaterproof;

    public SkiBoot(String brand, int size, boolean isWaterproof) {
        this.brand = brand;
        this.size = size;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " size is " + this.size + " waterproof is " + this.isWaterproof;
    }
    @Override
    public int hashCode(){
        return 79;
    }
}
