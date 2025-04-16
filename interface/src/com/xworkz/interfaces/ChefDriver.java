package com.xworkz.interfaces;

public class ChefDriver implements Chef, Driver {
    public void cook() {
        System.out.println("Cooks delicious meals.");
    }

    public void planMenu() {
        System.out.println("Plans the meal menu.");
    }

    public void manageKitchen() {
        System.out.println("Manages the kitchen operations.");
    }

    public void drive() {
        System.out.println("Drives vehicles.");
    }

    public void checkFuel() {
        System.out.println("Checks fuel levels.");
    }

    public void collectFare() {
        System.out.println("Collects fare from passengers.");
    }
}
