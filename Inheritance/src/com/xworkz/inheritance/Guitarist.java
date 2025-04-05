package com.xworkz.inheritance;

public class Guitarist extends Musician {
    public Guitarist() {
        System.out.println("no args const of Guitarist");
    }

    @Override
    public void playInstrument() {
        System.out.println("Guitarist is playing the guitar");
    }

    @Override
    public void practice() {
        System.out.println("Guitarist is practicing fingerstyle");
    }

    @Override
    public void perform() {
        System.out.println("Guitarist is rocking the stage");
    }

    @Override
    public void compose() {
        System.out.println("Guitarist is composing a guitar solo");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Guitarist is tuning the guitar");
    }
}
