package com.xworkz.tostring;

public class Cycle {
    private String brand;
    private int gearCount;
    private String frameMaterial;

    public Cycle(String brand, int gearCount, String frameMaterial) {
        this.brand = brand;
        this.gearCount = gearCount;
        this.frameMaterial = frameMaterial;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " gear count is " + this.gearCount +
                " frame material is " + this.frameMaterial;
    }
    @Override
    public int hashCode(){
        return 24;
    }
}
