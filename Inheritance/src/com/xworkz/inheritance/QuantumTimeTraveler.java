package com.xworkz.inheritance;

public class QuantumTimeTraveler extends TimeTraveler {
    public QuantumTimeTraveler() {
        System.out.println("no args const of QuantumTimeTraveler");
    }

    @Override
    public void travelToPast() {
        System.out.println("QuantumTimeTraveler uses quantum tunnel to travel to the past");
    }

    @Override
    public void travelToFuture() {
        System.out.println("QuantumTimeTraveler uses wormhole to jump into the future");
    }

    @Override
    public void observeHistory() {
        System.out.println("QuantumTimeTraveler records history without interference");
    }

    @Override
    public void avoidParadox() {
        System.out.println("QuantumTimeTraveler uses timeline stabilizer to avoid paradox");
    }

    @Override
    public void returnToPresent() {
        System.out.println("QuantumTimeTraveler synchronizes with present timeline");
    }

    public void stabilizeTimeline() {
        System.out.println("QuantumTimeTraveler is stabilizing the timeline");
    }
}
