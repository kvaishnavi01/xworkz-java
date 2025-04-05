package com.xworkz.inheritance;

public class CleaningRobot extends Robot {
    public CleaningRobot() {
        System.out.println("no args const of CleaningRobot");
    }

    @Override
    public void start() {
        System.out.println("Cleaning Robot is starting cleaning mode");
    }

    @Override
    public void stop() {
        System.out.println("Cleaning Robot is stopping operations");
    }

    @Override
    public void recharge() {
        System.out.println("Cleaning Robot is auto-docking for recharge");
    }

    @Override
    public void move() {
        System.out.println("Cleaning Robot is moving around the room");
    }

    @Override
    public void processTask() {
        System.out.println("Cleaning Robot is cleaning the floor");
    }
}
