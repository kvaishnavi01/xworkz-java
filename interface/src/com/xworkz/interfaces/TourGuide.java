package com.xworkz.interfaces;

public interface TourGuide {
    void giveTour();
    void provideInformation();
    void ensureSafety();
    default String getDescription() {
        return "This is a default method";
    }
}
