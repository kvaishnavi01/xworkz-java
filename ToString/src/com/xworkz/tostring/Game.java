package com.xworkz.tostring;

public class Game {
    private String title;
    private int levels;
    private boolean isMultiplayer;

    public Game(String title, int levels, boolean isMultiplayer) {
        this.title = title;
        this.levels = levels;
        this.isMultiplayer = isMultiplayer;
    }

    @Override
    public String toString() {
        return "title is " + this.title + " levels are " + this.levels + " multiplayer is " + this.isMultiplayer;
    }

    @Override
    public int hashCode() {
        return 57;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Game) {
                System.out.println("will compare.....");
                Game g1 = this;
                Game g2 = (Game) obj;
                if(g1.title.equals(g2.title) && g1.levels == g2.levels) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
