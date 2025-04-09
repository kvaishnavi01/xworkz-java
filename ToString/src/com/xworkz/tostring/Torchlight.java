package com.xworkz.tostring;

public class Torchlight {
    private String brand;
    private int batteryLife;
    private boolean isRechargeable;

    public Torchlight(String brand, int batteryLife, boolean isRechargeable) {
        this.brand = brand;
        this.batteryLife = batteryLife;
        this.isRechargeable = isRechargeable;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " battery life is " + this.batteryLife + " rechargeable is " + this.isRechargeable;
    }
}
