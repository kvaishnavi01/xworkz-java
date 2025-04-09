package com.xworkz.tostring;

public class SoilSensor {
    private String model;
    private double moistureLevel;
    private boolean isWireless;

    public SoilSensor(String model, double moistureLevel, boolean isWireless) {
        this.model = model;
        this.moistureLevel = moistureLevel;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return "model is " + this.model + " moisture level is " + this.moistureLevel + " wireless is " + this.isWireless;
    }
}
