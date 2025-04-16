package com.xworkz.interfaces;

public class PlasticBottle implements Bottle {
    public void fillWater() {
        System.out.println("Filling water in the bottle.");
    }
    public void drinkWater() {
        System.out.println("Drinking water from the bottle.");
    }
    public void recycle() {
        System.out.println("Recycling the bottle.");
    }
}
