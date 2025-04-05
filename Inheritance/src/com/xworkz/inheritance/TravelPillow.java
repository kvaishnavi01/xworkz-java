package com.xworkz.inheritance;

public class TravelPillow extends Pillow {
    public TravelPillow() {
        System.out.println("no args const of TravelPillow");
    }

    @Override
    public void supportHead() {
        System.out.println("TravelPillow supports the head during travel");
    }

    @Override
    public void giveComfort() {
        System.out.println("TravelPillow gives comfort on journeys");
    }

    @Override
    public void adjustShape() {
        System.out.println("TravelPillow fits around the neck");
    }

    @Override
    public void absorbSweat() {
        System.out.println("TravelPillow absorbs sweat during long trips");
    }

    @Override
    public void cover() {
        System.out.println("TravelPillow has a soft velvet cover");
    }
}
