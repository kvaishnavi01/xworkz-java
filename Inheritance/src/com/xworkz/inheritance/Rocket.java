package com.xworkz.inheritance;

public class Rocket {
    public Rocket() {
        System.out.println("no args const of Rocket");
    }

    public void launch() {
        System.out.println("Rocket is launching");
    }

    public void land() {
        System.out.println("Rocket is landing");
    }

    public void ignite() {
        System.out.println("Rocket engines ignited");
    }

    public void fuelCheck() {
        System.out.println("Rocket fuel is checked");
    }

    public void abortMission() {
        System.out.println("Rocket mission aborted");
    }
}
