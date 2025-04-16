package com.xworkz.interfaces;

public class HomePlumber implements Plumber {
    public void fixLeak() {
        System.out.println("Fixes pipe leaks.");
    }
    public void installPipes() {
        System.out.println("Installs new pipes.");
    }
    public void inspectDrains() {
        System.out.println("Inspects and cleans drains.");
    }
}
