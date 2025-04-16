package com.xworkz.interfaces;

public class DahipuriDriver implements Dahipuri, Driver {
    public void prepareDahipuri() {
        System.out.println("Prepares creamy dahipuri.");
    }
    public void addCurd() {
        System.out.println("Adds chilled curd.");
    }
    public void sprinkleMasala() {
        System.out.println("Sprinkles chat masala.");
    }

    @Override
    public void plateUp() {

    }

    public void drive() {
        System.out.println("Drives carefully.");
    }
    public void checkFuel() {
        System.out.println("Checks fuel level.");
    }
    public void collectFare() {
        System.out.println("Collects travel fare.");
    }
}
