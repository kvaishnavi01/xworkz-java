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

    @Override
    public int hashCode(){
        return 48;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof CricketPlayer) {
                System.out.println("will compare.....");
                CricketPlayer c1 = this;
                CricketPlayer c2 = (CricketPlayer) obj;
                if(c1.playerName.equals(c2.playerName) && c1.runs == c2.runs) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
