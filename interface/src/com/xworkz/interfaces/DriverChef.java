package com.xworkz.interfaces;

public class DriverChef implements Driver, Chef {
    public void drive() {
        System.out.println("Drives vehicles.");
    }

    public void checkFuel() {
        System.out.println("Checks fuel levels.");
    }

    public void collectFare() {
        System.out.println("Collects fare from passengers.");
    }

    public void cook() {
        System.out.println("Cooks meals.");
    }

    public void planMenu() {
        System.out.println("Plans menu for the day.");
    }

    public void manageKitchen() {
        System.out.println("Manages the kitchen and staff.");
    }
}
