package com.xworkz.inheritance;

public class Car extends Vehicle {
    public Car() {
        System.out.println("no args const of Car");
    }

    @Override
    public void start() {
        System.out.println("Car starts with key");
    }

    @Override
    public void stop() {
        System.out.println("Car stops safely");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerates quickly");
    }

    @Override
    public void brake() {
        System.out.println("Car uses disc brakes");
    }

    @Override
    public void honk() {
        System.out.println("Car honks softly");
    }
}
