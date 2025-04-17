package com.xworkz.interfaces;

public class ChatpatiBhel implements Bhel {
    public void mixPuffedRice() {
        System.out.println("Mixes puffed rice with chutneys.");
    }

    public void addVeggies() {
        System.out.println("Adds chopped onion, tomato, and coriander.");
    }

    public void squeezeLemon() {
        System.out.println("Squeezes lemon for tangy flavor.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
