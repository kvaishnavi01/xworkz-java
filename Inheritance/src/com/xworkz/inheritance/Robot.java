package com.xworkz.inheritance;

public class Robot {
    public Robot() {
        System.out.println("no args const of Robot");
    }

    public void start() {
        System.out.println("Robot is starting");
    }

    public void stop() {
        System.out.println("Robot is stopping");
    }

    public void recharge() {
        System.out.println("Robot is recharging");
    }

    public void move() {
        System.out.println("Robot is moving");
    }

    public void processTask() {
        System.out.println("Robot is processing task");
    }
}
