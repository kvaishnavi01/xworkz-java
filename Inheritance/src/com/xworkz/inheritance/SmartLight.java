package com.xworkz.inheritance;

public class SmartLight extends Light {
    public SmartLight() {
        System.out.println("no args const of SmartLight");
    }

    @Override
    public void turnOn() {
        System.out.println("SmartLight turned on via app");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartLight turned off remotely");
    }

    @Override
    public void dim() {
        System.out.println("SmartLight set to night mode");
    }

    @Override
    public void brighten() {
        System.out.println("SmartLight set to reading mode");
    }

    @Override
    public void blink() {
        System.out.println("SmartLight blinking for alert");
    }
}
