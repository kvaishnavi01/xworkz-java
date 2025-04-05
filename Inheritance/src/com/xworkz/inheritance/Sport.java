package com.xworkz.inheritance;

public class Sport {
    public Sport() {
        System.out.println("no args const of Sport");
    }

    public void start() {
        System.out.println("Sport is starting");
    }

    public void play() {
        System.out.println("Sport is being played");
    }

    public void pause() {
        System.out.println("Sport is paused");
    }

    public void end() {
        System.out.println("Sport has ended");
    }

    public void showScore() {
        System.out.println("Displaying the sport score");
    }
}
