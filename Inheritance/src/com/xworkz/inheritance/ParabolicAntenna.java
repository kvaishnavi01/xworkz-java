package com.xworkz.inheritance;

public class ParabolicAntenna extends Antenna {
    public ParabolicAntenna() {
        System.out.println("no args const of ParabolicAntenna");
    }

    @Override
    public void transmitSignal() {
        System.out.println("Parabolic antenna transmits highly directional beams");
    }

    @Override
    public void receiveSignal() {
        System.out.println("Parabolic antenna receives focused long-distance signals");
    }

    @Override
    public void adjustFrequency() {
        System.out.println("Parabolic antenna supports wideband frequency adjustments");
    }

    @Override
    public void amplifySignal() {
        System.out.println("Parabolic antenna boosts gain with dish shape");
    }

    @Override
    public void trackSource() {
        System.out.println("Parabolic antenna aligns precisely with satellite paths");
    }
}
