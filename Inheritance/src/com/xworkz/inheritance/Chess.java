package com.xworkz.inheritance;

public class Chess extends Game {
    public Chess() {
        System.out.println("no args const of Chess");
    }

    @Override
    public void start() {
        System.out.println("Chess game has started with white's move");
    }

    @Override
    public void pause() {
        System.out.println("Chess game is paused for analysis");
    }

    @Override
    public void end() {
        System.out.println("Chess game ends with checkmate or draw");
    }

    @Override
    public void showRules() {
        System.out.println("Chess rules: each piece moves in a unique way");
    }

    @Override
    public void reset() {
        System.out.println("Chess board is reset to initial position");
    }
}
