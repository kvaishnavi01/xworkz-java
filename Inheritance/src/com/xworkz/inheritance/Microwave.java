package com.xworkz.inheritance;

public class Microwave extends Appliance {
    public Microwave() {
        System.out.println("no args const of Microwave");
    }

    @Override
    public void switchOn() {
        System.out.println("Microwave is heating up");
    }

    @Override
    public void operate() {
        System.out.println("Microwave is cooking food");
    }

    @Override
    public void switchOff() {
        System.out.println("Microwave is turned off");
    }

    @Override
    public void checkPower() {
        System.out.println("Microwave is checking electricity connection");
    }

    @Override
    public void displayStatus() {
        System.out.println("Microwave displays cooking time left");
    }
}
