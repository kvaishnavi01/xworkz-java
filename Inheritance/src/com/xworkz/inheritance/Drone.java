package com.xworkz.inheritance;

public class Drone extends Toy {
    public Drone() {
        System.out.println("no args const of Drone");
    }

    @Override
    public void play() {
        System.out.println("Flying the drone in the sky");
    }

    @Override
    public void stop() {
        System.out.println("Drone is landing and stopping");
    }

    @Override
    public void store() {
        System.out.println("Storing the drone in its case");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning drone propellers and body");
    }

    @Override
    public void showDetails() {
        System.out.println("Drone: 4K camera, 20 mins flight time");
    }
}
