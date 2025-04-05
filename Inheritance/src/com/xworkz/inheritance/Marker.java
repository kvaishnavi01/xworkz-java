package com.xworkz.inheritance;

public class Marker extends Pen {
    public Marker() {
        System.out.println("no args const of Marker");
    }

    @Override
    public void write() {
        System.out.println("Marker writes on whiteboard");
    }

    @Override
    public void capOn() {
        System.out.println("Marker cap is placed");
    }

    @Override
    public void capOff() {
        System.out.println("Marker cap is removed");
    }

    @Override
    public void refill() {
        System.out.println("Marker is being refilled with ink");
    }

    @Override
    public void checkInk() {
        System.out.println("Marker ink level checked");
    }
}
