package com.xworkz.inheritance;

public class QuantumTimeTraveler extends TimeTraveler {
    public QuantumTimeTraveler() {
        System.out.println("no args const of QuantumTimeTraveler");
    }

    @Override
    public void travelToPast() {
        System.out.println("QuantumTimeTraveler enters alternate past timelines");
    }

    @Override
    public void travelToFuture() {
        System.out.println("QuantumTimeTraveler explores infinite futures");
    }

    @Override
    public void blendIn() {
        System.out.println("QuantumTimeTraveler manipulates identity on the quantum level");
    }

    @Override
    public void fixTimeline() {
        System.out.println("QuantumTimeTraveler collapses unstable timelines");
    }

    @Override
    public void recordJourney() {
        System.out.println("QuantumTimeTraveler encodes memories into quantum fields");
    }
}
