package com.xworkz.tostring;

public class CricketPlayer {
    private String playerName;
    private int runs;
    private boolean isCaptain;

    public CricketPlayer(String playerName, int runs, boolean isCaptain) {
        this.playerName = playerName;
        this.runs = runs;
        this.isCaptain = isCaptain;
    }

    @Override
    public String toString() {
        return "player name is " + this.playerName + " runs are " + this.runs + " captain is " + this.isCaptain;
    }
}
