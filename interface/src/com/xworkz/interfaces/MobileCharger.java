package com.xworkz.interfaces;

public class MobileCharger implements Charger {
    public void plugIn() {
        System.out.println("Mobile charger plugged in.");
    }

    public void startCharging() {
        System.out.println("Mobile charging started.");
    }

    public void stopCharging() {
        System.out.println("Mobile charging stopped.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
