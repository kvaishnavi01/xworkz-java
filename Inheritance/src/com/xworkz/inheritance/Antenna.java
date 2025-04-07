package com.xworkz.inheritance;

public class Antenna {
    public Antenna() {
        System.out.println("no args const of Antenna");
    }

    public void transmit() {
        System.out.println("Antenna transmits signals");
    }

    public void receive() {
        System.out.println("Antenna receives signals");
    }

    public void rotate() {
        System.out.println("Antenna rotates for better reception");
    }

    public void align() {
        System.out.println("Antenna is being aligned");
    }

    public void calibrate() {
        System.out.println("Antenna is being calibrated");
    }
}
