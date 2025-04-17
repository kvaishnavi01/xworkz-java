package com.xworkz.interfaces;

public class WirelessEarpods implements Earpods {
    public void connectBluetooth() {
        System.out.println("Earpods connected via Bluetooth.");
    }

    public void playMusic() {
        System.out.println("Playing music on wireless earpods.");
    }

    public void chargeCase() {
        System.out.println("Charging the earpods case.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
