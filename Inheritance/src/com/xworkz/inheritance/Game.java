package com.xworkz.inheritance;

public class Game {
    public Game() {
        System.out.println("no args const of Game");
    }

    public void start() {
        System.out.println("Game has started");
    }

    public void pause() {
        System.out.println("Game is paused");
    }

    public void end() {
        System.out.println("Game has ended");
    }

    public void showRules() {
        System.out.println("Game rules are being displayed");
    }

    public void reset() {
        System.out.println("Game is resetting");
    }
}
