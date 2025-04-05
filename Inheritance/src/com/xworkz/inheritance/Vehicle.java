package com.xworkz.inheritance;

public class Vehicle {
    public Vehicle() {
        System.out.println("no args const of Vehicle");
    }

    public void start() {
        System.out.println("Vehicle starts");
    }

    public void stop() {
        System.out.println("Vehicle stops");
    }

    public void accelerate() {
        System.out.println("Vehicle accelerates");
    }

    public void brake() {
        System.out.println("Vehicle applies brake");
    }

    public void honk() {
        System.out.println("Vehicle honks");
    }
}
