package com.xworkz.inheritance;

public class Berserker extends Viking {
    public Berserker() {
        System.out.println("no args const of Berserker");
    }

    @Override
    public void raid() {
        System.out.println("Berserker charges first into battle");
    }

    @Override
    public void sail() {
        System.out.println("Berserker rows furiously");
    }

    @Override
    public void battle() {
        System.out.println("Berserker enters blood rage");
    }

    @Override
    public void feast() {
        System.out.println("Berserker drinks entire barrel");
    }

    @Override
    public void worship() {
        System.out.println("Berserker channels Thor's fury");
    }
}