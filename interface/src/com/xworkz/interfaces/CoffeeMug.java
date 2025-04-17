package com.xworkz.interfaces;

public class CoffeeMug implements Mug {
    public void fill() {
        System.out.println("Filling the mug with coffee.");
    }
    public void drink() {
        System.out.println("Drinking from the coffee mug.");
    }
    public void wash() {
        System.out.println("Washing the mug.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
