package com.xworkz.inheritance;

public class QuantumTimeMachine extends TimeMachine {
    public QuantumTimeMachine() {
        System.out.println("no args const of QuantumTimeMachine");
    }

    @Override
    public void activate() {
        System.out.println("Quantum core initialized");
    }

    @Override
    public void setDestination() {
        System.out.println("Calculating quantum probability fields");
    }

    @Override
    public void travel() {
        System.out.println("Creating temporal wormhole");
    }

    @Override
    public void observe() {
        System.out.println("Viewing alternate timelines");
    }

    @Override
    public void returnHome() {
        System.out.println("Stabilizing quantum signature for return");
    }
}