package com.xworkz.tostring;

public class Speaker {
    private String brand;
    private int wattage;
    private boolean isBluetooth;

    public Speaker(String brand, int wattage, boolean isBluetooth) {
        this.brand = brand;
        this.wattage = wattage;
        this.isBluetooth = isBluetooth;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " wattage is " + this.wattage + "W" +
                " bluetooth is " + this.isBluetooth;
    }

    @Override
    public int hashCode(){
        return 17;
    }
}
