package com.xworkz.javareferenceandvariable;

public class House {
    String location;
    int numRooms;
    int areaInFeet;
    boolean hasParking;

    House(String location, int numRooms, int areaInFeet, boolean hasParking) {
        this.location = location;
        this.numRooms = numRooms;
        this.areaInFeet = areaInFeet;
        this.hasParking = hasParking;
        System.out.println("Location: " + this.location + " | Rooms: " + this.numRooms +
                " | Area: " + this.areaInFeet + " | Parking: " + this.hasParking);
    }

    void display() {
        System.out.println("Showing house details");
    }
}