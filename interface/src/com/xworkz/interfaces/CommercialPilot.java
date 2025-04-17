package com.xworkz.interfaces;

public class CommercialPilot implements Pilot {
    public void flyAircraft() {
        System.out.println("Flies the aircraft.");
    }
    public void checkWeather() {
        System.out.println("Checks the weather conditions.");
    }
    public void passengerAnnouncement() {
        System.out.println("Makes passenger announcements.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
