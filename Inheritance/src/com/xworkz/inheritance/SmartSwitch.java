package com.xworkz.inheritance;

public class SmartSwitch extends Switch {
    public SmartSwitch() {
        System.out.println("no args const of SmartSwitch");
    }

    @Override
    public void turnOn() {
        System.out.println("SmartSwitch turned on using app");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartSwitch turned off using app");
    }

    @Override
    public void toggle() {
        System.out.println("SmartSwitch toggled via voice");
    }

    @Override
    public void checkStatus() {
        System.out.println("SmartSwitch status checked online");
    }

    @Override
    public void replace() {
        System.out.println("SmartSwitch requires software reset");
    }
}
