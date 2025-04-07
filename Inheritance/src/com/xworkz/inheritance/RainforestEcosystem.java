package com.xworkz.inheritance;

public class RainforestEcosystem extends Ecosystem {
    public RainforestEcosystem() {
        System.out.println("no args const of RainforestEcosystem");
    }

    @Override
    public void supportLife() {
        System.out.println("Rainforest supports rich biodiversity");
    }

    @Override
    public void regulateClimate() {
        System.out.println("Rainforest helps regulate tropical climate");
    }

    @Override
    public void cycleNutrients() {
        System.out.println("Rainforest cycles nutrients rapidly");
    }

    @Override
    public void maintainSoil() {
        System.out.println("Rainforest maintains delicate soil balance");
    }

    @Override
    public void purifyWater() {
        System.out.println("Rainforest purifies rainwater");
    }

    public void produceOxygen() {
        System.out.println("Rainforest produces large amounts of oxygen");
    }
}
