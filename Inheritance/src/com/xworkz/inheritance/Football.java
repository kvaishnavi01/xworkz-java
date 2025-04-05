package com.xworkz.inheritance;

public class Football extends Sport {
    public Football() {
        System.out.println("no args const of Football");
    }

    @Override
    public void start() {
        System.out.println("Football match is starting with a kickoff");
    }

    @Override
    public void play() {
        System.out.println("Football players are passing and shooting");
    }

    @Override
    public void pause() {
        System.out.println("Football match is paused for halftime");
    }

    @Override
    public void end() {
        System.out.println("Football match ends after 90 minutes");
    }

    @Override
    public void showScore() {
        System.out.println("Football score is 2 - 1");
    }
}
