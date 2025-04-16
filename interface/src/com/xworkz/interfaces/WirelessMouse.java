package com.xworkz.interfaces;

public class WirelessMouse implements Mouse {
    public void click() {
        System.out.println("Wireless mouse clicked.");
    }

    public void scroll() {
        System.out.println("Scrolling with wireless mouse.");
    }

    public void connectToPC() {
        System.out.println("Mouse connected to PC.");
    }
}
