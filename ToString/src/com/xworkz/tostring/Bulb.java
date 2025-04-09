package com.xworkz.tostring;

public class Bulb {
    private String type;
    private int wattage;
    private boolean isLED;

    public Bulb(String type, int wattage, boolean isLED) {
        this.type = type;
        this.wattage = wattage;
        this.isLED = isLED;
    }

    @Override
    public String toString() {
        return "type is " + this.type + " wattage is " + this.wattage + " LED is " + this.isLED;
    }
}
