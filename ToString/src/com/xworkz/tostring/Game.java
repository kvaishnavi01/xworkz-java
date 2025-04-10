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
    public int hashCode(){
        return 57;
    }
}
