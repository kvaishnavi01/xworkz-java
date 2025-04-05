package com.xworkz.inheritance;

public class RainforestEcosystem extends Ecosystem {
    public RainforestEcosystem() {
        System.out.println("no args const of RainforestEcosystem");
    }

    @Override
    public void supportLife() {
        System.out.println("Rainforest supports dense biodiversity");
    }

    @Override
    public void cycleNutrients() {
        System.out.println("Rainforest cycles nutrients through rapid decay and growth");
    }

    @Override
    public void maintainBalance() {
        System.out.println("Rainforest maintains humid climate and food web");
    }

    @Override
    public void regulateClimate() {
        System.out.println("Rainforest regulates rainfall and carbon levels");
    }

    @Override
    public void purifyAir() {
        System.out.println("Rainforest purifies air through high photosynthesis");
    }
}
