package com.xworkz.interfaces;

public class StreetPanipuri implements Panipuri {
    public void prepareWater() {
        System.out.println("Prepares spicy tangy water for panipuri.");
    }

    public void fillPuri() {
        System.out.println("Fills puri with mashed potato and chutney.");
    }

    public void serve() {
        System.out.println("Serves panipuri with quick hands.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
