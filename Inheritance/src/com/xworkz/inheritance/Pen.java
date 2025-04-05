package com.xworkz.inheritance;

public class Pen {
    public Pen() {
        System.out.println("no args const of Pen");
    }

    public void write() {
        System.out.println("Pen writes on paper");
    }

    public void capOn() {
        System.out.println("Pen cap is on");
    }

    public void capOff() {
        System.out.println("Pen cap is off");
    }

    public void refill() {
        System.out.println("Pen is refilled");
    }

    public void checkInk() {
        System.out.println("Checking ink level in pen");
    }
}
