package com.xworkz.inheritance;

public class Fan {
    public Fan() {
        System.out.println("no args const of Fan");
    }

    public void spin() {
        System.out.println("Fan is spinning");
    }

    public void start() {
        System.out.println("Fan starts running");
    }

    public void stop() {
        System.out.println("Fan stops rotating");
    }

    public void adjustSpeed() {
        System.out.println("Fan speed is adjusted");
    }

    public void swing() {
        System.out.println("Fan is swinging left and right");
    }
}
