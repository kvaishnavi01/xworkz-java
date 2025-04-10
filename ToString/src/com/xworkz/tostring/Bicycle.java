package com.xworkz.tostring;

public class Bicycle {
    private String brand;
    private int gears;
    private boolean hasBell;

    public Bicycle(String brand, int gears, boolean hasBell) {
        this.brand = brand;
        this.gears = gears;
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " gears are " + this.gears + " bell is " + this.hasBell;
    }
    @Override
    public int hashCode(){
        return 58;
    }
}
