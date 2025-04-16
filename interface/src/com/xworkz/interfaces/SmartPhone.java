package com.xworkz.interfaces;

public class SmartPhone implements Phone {
    public void makeCall() {
        System.out.println("Making a call from the smartphone.");
    }
    public void receiveCall() {
        System.out.println("Receiving a call on the smartphone.");
    }
    public void charge() {
        System.out.println("Charging the smartphone.");
    }
}
