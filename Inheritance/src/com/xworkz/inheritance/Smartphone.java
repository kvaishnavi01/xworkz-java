package com.xworkz.inheritance;

public class Smartphone extends Gadget {
    public Smartphone() {
        System.out.println("no args const of Smartphone");
    }

    @Override
    public void turnOn() {
        System.out.println("Smartphone is powering up");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is shutting down");
    }

    @Override
    public void charge() {
        System.out.println("Smartphone is fast charging");
    }

    @Override
    public void reset() {
        System.out.println("Smartphone is performing factory reset");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Smartphone is connecting to a Wi-Fi network");
    }

    public void use(){
        System.out.println("smartphone used");
    }
}
