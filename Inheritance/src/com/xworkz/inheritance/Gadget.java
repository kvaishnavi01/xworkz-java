package com.xworkz.inheritance;

public class Gadget {
    public Gadget() {
        System.out.println("no args const of Gadget");
    }

    public void turnOn() {
        System.out.println("Gadget is turning on");
    }

    public void turnOff() {
        System.out.println("Gadget is turning off");
    }

    public void charge() {
        System.out.println("Gadget is charging");
    }

    public void reset() {
        System.out.println("Gadget is resetting");
    }

    public void connectToWifi() {
        System.out.println("Gadget is connecting to Wi-Fi");
    }
}
