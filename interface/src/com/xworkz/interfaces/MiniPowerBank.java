package com.xworkz.interfaces;

public class MiniPowerBank implements PowerBank {
    public void chargeDevice() {
        System.out.println("Charging device using power bank.");
    }

    public void checkBattery() {
        System.out.println("Checking battery status.");
    }

    public void turnOff() {
        System.out.println("Turning off power bank.");
    }
}
