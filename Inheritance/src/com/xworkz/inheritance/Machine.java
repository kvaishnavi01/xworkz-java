package com.xworkz.inheritance;

public class Machine {
    public Machine() {
        System.out.println("no args const of Machine");
    }

    public void start() {
        System.out.println("Machine is starting");
    }

    public void stop() {
        System.out.println("Machine is stopping");
    }

    public void operate() {
        System.out.println("Machine is operating");
    }

    public void monitor() {
        System.out.println("Machine is being monitored");
    }

    public void maintain() {
        System.out.println("Machine is under maintenance");
    }
}
