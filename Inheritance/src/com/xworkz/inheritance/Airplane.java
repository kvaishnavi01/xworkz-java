package com.xworkz.inheritance;

public class Airplane extends Transport {
    public Airplane() {
        System.out.println("no args const of Airplane");
    }

    @Override
    public void start() {
        System.out.println("Airplane engines are starting");
    }

    @Override
    public void move() {
        System.out.println("Airplane is taking off");
    }

    @Override
    public void stop() {
        System.out.println("Airplane is landing and stopping on runway");
    }

    @Override
    public void load() {
        System.out.println("Airplane is boarding passengers");
    }

    @Override
    public void unload() {
        System.out.println("Airplane is deboarding passengers");
    }

    public void checkin(){
        System.out.println("checking in");
    }
}
