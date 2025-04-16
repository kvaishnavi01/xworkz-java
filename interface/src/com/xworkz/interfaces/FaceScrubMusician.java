package com.xworkz.interfaces;

public class FaceScrubMusician implements FaceScrub, Musician {
    public void exfoliate() {
        System.out.println("Exfoliates dead skin.");
    }

    @Override
    public void unclogPores() {

    }

    @Override
    public void brightenSkin() {

    }

    public void massageFace() {
        System.out.println("Massages skin gently.");
    }
    public void rinseOff() {
        System.out.println("Rinses face thoroughly.");
    }

    public void playInstrument() {
        System.out.println("Plays soothing melodies.");
    }
    public void composeSong() {
        System.out.println("Composes new tunes.");
    }
    public void attendRehearsal() {
        System.out.println("Attends regular band rehearsals.");
    }
}
