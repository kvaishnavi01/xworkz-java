package com.xworkz.tostring;

public class Player {
    private String sport;
    private int matchesPlayed;
    private boolean isCaptain;

    public Player(String sport, int matchesPlayed, boolean isCaptain) {
        this.sport = sport;
        this.matchesPlayed = matchesPlayed;
        this.isCaptain = isCaptain;
    }

    @Override
    public String toString() {
        return "sport is " + this.sport + " matches played are " + this.matchesPlayed + " captain is " + this.isCaptain;
    }
}
