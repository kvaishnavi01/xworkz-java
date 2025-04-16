package com.xworkz.interfaces;

public class ChefPilot implements Chef, Pilot {
    public void cook() {
        System.out.println("Cooks delicious meals.");
    }

    public void planMenu() {
        System.out.println("Plans the meal menu.");
    }

    public void manageKitchen() {
        System.out.println("Manages the kitchen operations.");
    }

    public void flyAircraft() {
        System.out.println("Flies commercial aircraft.");
    }

    public void checkWeather() {
        System.out.println("Checks the weather for flight safety.");
    }

    public void passengerAnnouncement() {
        System.out.println("Makes announcements for passengers.");
    }
}
