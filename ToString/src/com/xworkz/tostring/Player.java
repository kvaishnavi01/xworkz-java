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

    @Override
    public int hashCode() {
        return 61;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Player) {
                System.out.println("will compare.....");
                Player p1 = this;
                Player p2 = (Player) obj;
                if (p1.sport.equals(p2.sport) && p1.matchesPlayed == p2.matchesPlayed && p1.isCaptain == p2.isCaptain) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
