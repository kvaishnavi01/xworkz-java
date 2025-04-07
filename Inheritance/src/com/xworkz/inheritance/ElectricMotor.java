package com.xworkz.inheritance;

public class ElectricMotor extends Motor {
    public ElectricMotor() {
        System.out.println("no args const of ElectricMotor");
    }

    @Override
    public void start() {
        System.out.println("Electric Motor starts with electric current");
    }

    @Override
    public void stop() {
        System.out.println("Electric Motor stops immediately");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Electric Motor speed increases smoothly");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Electric Motor speed decreases gradually");
    }

    @Override
    public void checkTemperature() {
        System.out.println("Electric Motor uses sensors to check temperature");
    }

    public void chargeBattery() {
        System.out.println("Electric Motor charges its battery");
    }
}
