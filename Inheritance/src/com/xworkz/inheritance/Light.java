package com.xworkz.inheritance;

public class Light {
    public Light() {
        System.out.println("no args const of Light");
    }

    public void turnOn() {
        System.out.println("Light is turned on");
    }

    public void turnOff() {
        System.out.println("Light is turned off");
    }

    public void dim() {
        System.out.println("Light is dimmed");
    }

    public void brighten() {
        System.out.println("Light is brightened");
    }

    public void blink() {
        System.out.println("Light is blinking");
    }
}
