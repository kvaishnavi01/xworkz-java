package com.xworkz.inheritance;

public class Manager extends Employee {
    public Manager() {
        System.out.println("no args const of Manager");
    }

    @Override
    public void work() {
        System.out.println("Manager is overseeing project execution");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is leading the team meeting");
    }

    @Override
    public void submitReport() {
        System.out.println("Manager is submitting the performance report");
    }

    @Override
    public void takeBreak() {
        System.out.println("Manager is taking a short break");
    }

    @Override
    public void logout() {
        System.out.println("Manager is logging out after team updates");
    }

    public void scolds(){
        System.out.println("scolds ");
    }
}
