package com.xworkz.inheritance;

public class ParabolicAntenna extends Antenna {
    public ParabolicAntenna() {
        System.out.println("no args const of ParabolicAntenna");
    }

    @Override
    public void transmit() {
        System.out.println("Parabolic antenna transmits focused signals");
    }

    @Override
    public void receive() {
        System.out.println("Parabolic antenna receives directional signals");
    }

    @Override
    public void rotate() {
        System.out.println("Parabolic antenna rotates precisely");
    }

    @Override
    public void align() {
        System.out.println("Parabolic antenna is aligned using motors");
    }

    @Override
    public void calibrate() {
        System.out.println("Parabolic antenna is calibrated for maximum gain");
    }

    public void focusSignal() {
        System.out.println("Parabolic antenna focuses the signal to a point");
    }
}
