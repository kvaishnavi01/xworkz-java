package com.xworkz.inheritance;

public class Signal {
    public Signal() {
        System.out.println("no args const of Signal");
    }

    public void transmit() {
        System.out.println("Signal is being transmitted");
    }

    public void receive() {
        System.out.println("Signal is being received");
    }

    public void amplify() {
        System.out.println("Signal is being amplified");
    }

    public void decode() {
        System.out.println("Signal is being decoded");
    }

    public void modulate() {
        System.out.println("Signal is being modulated");
    }
}
