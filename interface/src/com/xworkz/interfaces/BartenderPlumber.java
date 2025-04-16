package com.xworkz.interfaces;

public class BartenderPlumber implements Bartender, Plumber {
    public void mixDrinks() {
        System.out.println("Mixes alcoholic beverages.");
    }

    public void takeOrders() {
        System.out.println("Takes drink orders.");
    }

    public void maintainBar() {
        System.out.println("Maintains bar setup.");
    }

    public void fixLeak() {
        System.out.println("Fixes plumbing leaks.");
    }

    public void installPipes() {
        System.out.println("Installs new plumbing pipes.");
    }

    public void inspectDrains() {
        System.out.println("Inspects and clears blocked drains.");
    }
}
