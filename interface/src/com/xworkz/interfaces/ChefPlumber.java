package com.xworkz.interfaces;

public class ChefPlumber implements Chef, Plumber {
    public void cook() {
        System.out.println("Cooks delicious meals.");
    }

    public void planMenu() {
        System.out.println("Plans the meal menu.");
    }

    public void manageKitchen() {
        System.out.println("Manages the kitchen operations.");
    }

    public void fixLeak() {
        System.out.println("Fixes water leakages.");
    }

    public void installPipes() {
        System.out.println("Installs plumbing pipes.");
    }

    public void inspectDrains() {
        System.out.println("Inspects and cleans drains.");
    }
}
