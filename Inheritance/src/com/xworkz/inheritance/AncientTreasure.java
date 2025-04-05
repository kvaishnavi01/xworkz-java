package com.xworkz.inheritance;

public class AncientTreasure extends Treasure {
    public AncientTreasure() {
        System.out.println("no args const of AncientTreasure");
    }

    @Override
    public void discover() {
        System.out.println("Ancient treasure discovered inside a hidden temple");
    }

    @Override
    public void unlock() {
        System.out.println("Ancient treasure unlocked using a secret code");
    }

    @Override
    public void evaluate() {
        System.out.println("Ancient treasure evaluated by archaeologists");
    }

    @Override
    public void preserve() {
        System.out.println("Ancient treasure preserved using climate control");
    }

    @Override
    public void display() {
        System.out.println("Ancient treasure displayed at world heritage exhibit");
    }
}
