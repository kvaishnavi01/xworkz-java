package com.xworkz.interfaces;

public class Backpack implements Bag {
    public void carry() {
        System.out.println("Carrying the backpack.");
    }
    public void zip() {
        System.out.println("Zipping the backpack.");
    }
    public void unpack() {
        System.out.println("Unpacking the backpack.");
    }
}
