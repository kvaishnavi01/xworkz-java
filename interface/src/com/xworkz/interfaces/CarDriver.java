package com.xworkz.interfaces;

public class CarDriver implements Driver {
    public void drive() {
        System.out.println("Drives the car.");
    }
    public void checkFuel() {
        System.out.println("Checks the fuel level.");
    }
    public void collectFare() {
        System.out.println("Collects fare from passengers.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
