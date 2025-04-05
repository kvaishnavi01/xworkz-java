package com.xworkz.inheritance;

public class SteeringWheel extends Wheel {
    public SteeringWheel() {
        System.out.println("no args const of SteeringWheel");
    }

    @Override
    public void rotate() {
        System.out.println("SteeringWheel is turning the vehicle");
    }

    @Override
    public void stop() {
        System.out.println("SteeringWheel can’t be stopped like a normal wheel");
    }

    @Override
    public void checkPressure() {
        System.out.println("SteeringWheel doesn't need pressure check");
    }

    @Override
    public void balance() {
        System.out.println("SteeringWheel is electronically balanced");
    }

    @Override
    public void align() {
        System.out.println("SteeringWheel is aligned with front wheels");
    }
}
