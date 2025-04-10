package com.xworkz.tostring;

public class Smartwatch {
    private String brand;
    private int batteryLife;
    private boolean waterResistant;

    public Smartwatch(String brand, int batteryLife, boolean waterResistant) {
        this.brand = brand;
        this.batteryLife = batteryLife;
        this.waterResistant = waterResistant;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " battery life is " + this.batteryLife + " water resistant is " + this.waterResistant;
    }

    @Override
    public int hashCode(){
        return 68;
    }
}
