package com.xworkz.interfaces;

public class MountainTourGuide implements TourGuide {
    public void giveTour() {
        System.out.println("Gives mountain tours.");
    }
    public void provideInformation() {
        System.out.println("Provides information about mountain trails.");
    }
    public void ensureSafety() {
        System.out.println("Ensures the safety of the tourists during the tour.");
    }
}
