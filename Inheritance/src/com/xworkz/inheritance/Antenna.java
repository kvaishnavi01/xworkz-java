package com.xworkz.inheritance;

public class Antenna {
    public Antenna() {
        System.out.println("no args const of Antenna");
    }

    public void transmitSignal() {
        System.out.println("Antenna transmits electromagnetic signals");
    }

    public void receiveSignal() {
        System.out.println("Antenna receives incoming signals");
    }

    public void adjustFrequency() {
        System.out.println("Antenna adjusts its frequency range");
    }

    public void amplifySignal() {
        System.out.println("Antenna amplifies weak signals");
    }

    public void trackSource() {
        System.out.println("Antenna tracks the signal source direction");
    }
}
