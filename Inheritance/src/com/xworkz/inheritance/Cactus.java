package com.xworkz.inheritance;

public class Cactus extends Plant {
    public Cactus() {
        System.out.println("no args const of Cactus");
    }

    @Override
    public void absorbWater() {
        System.out.println("Cactus stores water in thick stems");
    }

    @Override
    public void performPhotosynthesis() {
        System.out.println("Cactus uses stem for photosynthesis");
    }

    @Override
    public void grow() {
        System.out.println("Cactus grows slowly in dry climate");
    }

    @Override
    public void releaseOxygen() {
        System.out.println("Cactus releases oxygen mainly at night");
    }

    @Override
    public void respondToSunlight() {
        System.out.println("Cactus orients spines to reduce sunlight exposure");
    }
}
