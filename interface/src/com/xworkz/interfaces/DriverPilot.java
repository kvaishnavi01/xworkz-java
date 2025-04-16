package com.xworkz.interfaces;

public class DriverPilot implements Driver, Pilot {
    public void drive() {
        System.out.println("Drives vehicles.");
    }

    public void checkFuel() {
        System.out.println("Checks fuel levels.");
    }

    public void collectFare() {
        System.out.println("Collects fare from passengers.");
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
