package com.xworkz.inheritance;

public class Motor {
    public Motor() {
        System.out.println("no args const of Motor");
    }

    public void start() {
        System.out.println("Motor starts running");
    }

    public void stop() {
        System.out.println("Motor stops running");
    }

    public void increaseSpeed() {
        System.out.println("Motor speed is increasing");
    }

    public void decreaseSpeed() {
        System.out.println("Motor speed is decreasing");
    }

    public void checkTemperature() {
        System.out.println("Motor temperature is being checked");
    }
}
