package com.xworkz.interfaces;

public class GamingLaptop implements Laptop {
    public void bootUp() {
        System.out.println("Gaming laptop booting up.");
    }

    public void runProgram() {
        System.out.println("Running games on high graphics.");
    }

    public void shutDown() {
        System.out.println("Shutting down gaming laptop.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
