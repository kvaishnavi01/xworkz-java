package com.xworkz.interfaces;

public class PilotLibrarian implements Pilot, Librarian {
    public void flyAircraft() {
        System.out.println("Flies aircraft full of books.");
    }

    public void checkWeather() {
        System.out.println("Checks weather before delivering books.");
    }

    public void passengerAnnouncement() {
        System.out.println("Announces in-flight book readings.");
    }

    public void organizeBooks() {
        System.out.println("Organizes in-flight reading shelves.");
    }

    public void assistReaders() {
        System.out.println("Assists readers mid-flight.");
    }

    public void maintainRecords() {
        System.out.println("Maintains passenger reading logs.");
    }

    @Override
    public void catalogBooks() {

    }

    @Override
    public void assistPatrons() {

    }

    @Override
    public void organizeEvents() {

    }
}
