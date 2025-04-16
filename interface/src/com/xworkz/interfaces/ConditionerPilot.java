package com.xworkz.interfaces;

public class ConditionerPilot implements Conditioner, Pilot {
    public void applyConditioner() {
        System.out.println("Applies conditioner post shampoo.");
    }
    public void rinseHair() {
        System.out.println("Rinses hair thoroughly.");
    }
    public void detangleHair() {
        System.out.println("Detangles hair smoothly.");
    }

    public void flyAircraft() {
        System.out.println("Flies commercial aircraft.");
    }
    public void checkWeather() {
        System.out.println("Checks weather before flight.");
    }
    public void passengerAnnouncement() {
        System.out.println("Makes announcements to passengers.");
    }

    @Override
    public void softenHair() {

    }

    @Override
    public void reduceFrizz() {

    }

    @Override
    public void addShine() {

    }
}
