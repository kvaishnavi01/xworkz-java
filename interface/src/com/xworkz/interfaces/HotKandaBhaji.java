package com.xworkz.interfaces;

public class HotKandaBhaji implements KandaBhaji {
    public void sliceOnions() {
        System.out.println("Slices onions thinly for bhaji.");
    }

    public void coatWithBesan() {
        System.out.println("Coats onions with besan and spices.");
    }

    public void deepFry() {
        System.out.println("Deep fries onion bhaji till crispy.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
