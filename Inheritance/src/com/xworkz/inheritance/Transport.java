package com.xworkz.inheritance;

public class Transport {
    public Transport() {
        System.out.println("no args const of Transport");
    }

    public void start() {
        System.out.println("Transport is starting");
    }

    public void move() {
        System.out.println("Transport is moving");
    }

    public void stop() {
        System.out.println("Transport is stopping");
    }

    public void load() {
        System.out.println("Transport is loading passengers");
    }

    public void unload() {
        System.out.println("Transport is unloading passengers");
    }
}
