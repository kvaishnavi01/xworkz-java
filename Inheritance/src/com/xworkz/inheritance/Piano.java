package com.xworkz.inheritance;

public class Piano extends Instrument {
    public Piano() {
        System.out.println("no args const of Piano");
    }

    @Override
    public void play() {
        System.out.println("Piano is playing beautiful melodies");
    }

    @Override
    public void tune() {
        System.out.println("Piano is being tuned by a technician");
    }

    @Override
    public void carry() {
        System.out.println("Piano is heavy and moved carefully");
    }

    @Override
    public void repair() {
        System.out.println("Piano is being repaired by a specialist");
    }

    @Override
    public void store() {
        System.out.println("Piano is covered and stored in a safe place");
    }
}
