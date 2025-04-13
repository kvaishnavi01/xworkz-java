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

    @Override
    public int hashCode() {
        return 77;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof SoilSensor) {
                System.out.println("will compare.....");
                SoilSensor s1 = this;
                SoilSensor s2 = (SoilSensor) obj;
                if (s1.model.equals(s2.model) && s1.moistureLevel == s2.moistureLevel && s1.isWireless == s2.isWireless) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
