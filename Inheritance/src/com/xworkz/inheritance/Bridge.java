package com.xworkz.inheritance;

public class Bridge extends Structure {
    public Bridge() {
        System.out.println("no args const of Bridge");
    }

    @Override
    public void provideSupport() {
        System.out.println("Bridge supports the movement of vehicles and people");
    }

    @Override
    public void withstandLoad() {
        System.out.println("Bridge handles dynamic and static load");
    }

    @Override
    public void occupySpace() {
        System.out.println("Bridge spans across two points");
    }

    @Override
    public void endureWeather() {
        System.out.println("Bridge resists wind, rain, and temperature changes");
    }

    @Override
    public void defineShape() {
        System.out.println("Bridge structure defines architectural aesthetics and function");
    }
}
