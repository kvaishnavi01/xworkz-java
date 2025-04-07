package com.xworkz.inheritance;

public class WashingMachine extends Machine {
    public WashingMachine() {
        System.out.println("no args const of WashingMachine");
    }

    @Override
    public void start() {
        System.out.println("Washing Machine is starting the wash cycle");
    }

    @Override
    public void stop() {
        System.out.println("Washing Machine is stopping after rinse");
    }

    @Override
    public void operate() {
        System.out.println("Washing Machine is washing clothes");
    }

    @Override
    public void monitor() {
        System.out.println("Washing Machine is checking water levels");
    }

    @Override
    public void maintain() {
        System.out.println("Washing Machine is being cleaned and serviced");
    }

    public  void wash(){
        System.out.println("Washing clothes");
    }
}
