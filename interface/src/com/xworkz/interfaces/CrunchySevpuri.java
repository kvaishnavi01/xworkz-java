package com.xworkz.interfaces;

public class CrunchySevpuri implements Sevpuri {
    public void addToppings() {
        System.out.println("Adds onions, tomatoes and boiled potatoes.");
    }

    public void crushPuri() {
        System.out.println("Crushes puris for perfect crunch.");
    }

    public void serveWithChutney() {
        System.out.println("Serves with sweet and spicy chutneys.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
