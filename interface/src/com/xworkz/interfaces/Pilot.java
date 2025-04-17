package com.xworkz.interfaces;

public interface Pilot {
    void flyAircraft();
    void checkWeather();
    void passengerAnnouncement();
    default String getDescription() {
        return "This is a default method";
    }
}
