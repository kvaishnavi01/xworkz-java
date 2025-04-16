package com.xworkz.interfaces;

public class SecurityChef implements SecurityGuard, Chef {
    public void patrolArea() {
        System.out.println("Patrols the premises.");
    }

    public void monitorCCTV() {
        System.out.println("Monitors CCTV surveillance.");
    }

    public void checkID() {
        System.out.println("Checks ID of visitors.");
    }

    public void cook() {
        System.out.println("Cooks meals for the security staff.");
    }

    public void planMenu() {
        System.out.println("Plans the weekly menu.");
    }

    public void manageKitchen() {
        System.out.println("Oversees kitchen operations.");
    }
}
