package com.xworkz.inheritance;

public class ElectricMotor extends Motor {
    public ElectricMotor() {
        System.out.println("no args const of ElectricMotor");
    }

    @Override
    public void rotate() {
        System.out.println("Electric motor rotates using electromagnetic fields");
    }

    @Override
    public void consumeEnergy() {
        System.out.println("Electric motor uses electric current");
    }

    @Override
    public void produceTorque() {
        System.out.println("Electric motor generates torque through stator-rotor interaction");
    }

    @Override
    public void operateContinuously() {
        System.out.println("Electric motor runs efficiently with low maintenance");
    }

    @Override
    public void stop() {
        System.out.println("Electric motor stops via electrical braking or switch");
    }
}
