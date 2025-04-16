package com.xworkz.interfaces;

public class MusicianAgent implements Musician, RealEstateAgent {
    public void playInstrument() {
        System.out.println("Plays music during property visits.");
    }

    public void composeSong() {
        System.out.println("Composes songs for property ads.");
    }

    public void attendRehearsal() {
        System.out.println("Attends rehearsals before showings.");
    }

    public void showProperties() {
        System.out.println("Shows houses to fellow musicians.");
    }

    public void negotiateDeals() {
        System.out.println("Negotiates deals with rhythm.");
    }

    public void handlePaperwork() {
        System.out.println("Handles legal and musical paperwork.");
    }
}
