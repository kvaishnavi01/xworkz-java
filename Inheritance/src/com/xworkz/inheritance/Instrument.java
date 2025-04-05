package com.xworkz.inheritance;

public class Instrument {
    public Instrument() {
        System.out.println("no args const of Instrument");
    }

    public void play() {
        System.out.println("Instrument is being played");
    }

    public void tune() {
        System.out.println("Instrument is being tuned");
    }

    public void carry() {
        System.out.println("Instrument is being carried");
    }

    public void repair() {
        System.out.println("Instrument is being repaired");
    }

    public void store() {
        System.out.println("Instrument is being stored");
    }
}
