package com.xworkz.inheritance;

public class Oxygen extends Element {
    public Oxygen() {
        System.out.println("no args const of Oxygen");
    }

    @Override
    public void react() {
        System.out.println("Oxygen reacts quickly with many elements");
    }

    @Override
    public void existNaturally() {
        System.out.println("Oxygen exists abundantly in Earth's atmosphere");
    }

    @Override
    public void conductHeat() {
        System.out.println("Oxygen is a poor conductor of heat");
    }

    @Override
    public void state() {
        System.out.println("Oxygen is a gas at room temperature");
    }

    @Override
    public void atomicNumber() {
        System.out.println("Oxygen has atomic number 8");
    }
}
