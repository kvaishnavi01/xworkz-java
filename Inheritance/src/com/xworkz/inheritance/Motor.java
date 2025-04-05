package com.xworkz.inheritance;

public class Motor {
    public Motor() {
        System.out.println("no args const of Motor");
    }

    public void rotate() {
        System.out.println("Motor rotates to generate motion");
    }

    public void consumeEnergy() {
        System.out.println("Motor consumes energy to work");
    }

    public void produceTorque() {
        System.out.println("Motor produces torque");
    }

    public void operateContinuously() {
        System.out.println("Motor operates continuously under load");
    }

    public void stop() {
        System.out.println("Motor stops safely when turned off");
    }
}
