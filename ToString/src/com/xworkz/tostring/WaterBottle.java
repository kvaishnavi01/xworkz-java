package com.xworkz.tostring;

public class WaterBottle {
    private String brand;
    private int volume;
    private boolean isSteel;

    public WaterBottle(String brand, int volume, boolean isSteel) {
        this.brand = brand;
        this.volume = volume;
        this.isSteel = isSteel;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " volume is " + this.volume + " steel is " + this.isSteel;
    }
    @Override
    public int hashCode(){
        return 81;
    }
}
