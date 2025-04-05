package com.xworkz.inheritance;

public class Beverage {
    public Beverage() {
        System.out.println("no args const of Beverage");
    }

    public void pour() {
        System.out.println("Beverage is being poured into a glass");
    }

    public void drink() {
        System.out.println("Beverage is being consumed");
    }

    public void chill() {
        System.out.println("Beverage is being chilled");
    }

    public void openCap() {
        System.out.println("Beverage cap is being opened");
    }

    public void shake() {
        System.out.println("Beverage is being shaken");
    }
}
