package com.xworkz.inheritance;

public class Appliance {
    public Appliance() {
        System.out.println("no args const of Appliance");
    }

    public void switchOn() {
        System.out.println("Appliance is switched on");
    }

    public void operate() {
        System.out.println("Appliance is operating");
    }

    public void switchOff() {
        System.out.println("Appliance is switched off");
    }

    public void checkPower() {
        System.out.println("Appliance power status is being checked");
    }

    public void displayStatus() {
        System.out.println("Appliance is displaying status");
    }
}
