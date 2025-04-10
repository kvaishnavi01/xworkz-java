package com.xworkz.tostring;

public class Fan {
    private String brand;
    private int speedLevels;
    private String color;

    public Fan(String brand, int speedLevels, String color) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.color = color;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " speed levels are " + this.speedLevels +
                " color is " + this.color;
    }
    @Override
    public int hashCode(){
        return 6;
    }
}
