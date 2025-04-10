package com.xworkz.tostring;

public class Mixer {
    private String brand;
    private int channels;
    private boolean hasBluetooth;

    public Mixer(String brand, int channels, boolean hasBluetooth) {
        this.brand = brand;
        this.channels = channels;
        this.hasBluetooth = hasBluetooth;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " channels are " + this.channels + " bluetooth is " + this.hasBluetooth;
    }
    @Override
    public int hashCode(){
        return 76;
    }
}
