package com.xworkz.interfaces;

public class LEDMonitor implements Monitor {
    public void displayOutput() {
        System.out.println("Displaying output on LED monitor.");
    }

    public void changeBrightness() {
        System.out.println("Changing brightness of LED monitor.");
    }

    public void powerOff() {
        System.out.println("Powering off the monitor.");
    }
}
