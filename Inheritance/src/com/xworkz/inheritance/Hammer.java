package com.xworkz.inheritance;

public class Hammer extends Tool {
    public Hammer() {
        System.out.println("no args const of Hammer");
    }

    @Override
    public void use() {
        System.out.println("Hammer is used to drive nails into wood");
    }

    @Override
    public void maintain() {
        System.out.println("Hammer should be cleaned after use");
    }

    @Override
    public void store() {
        System.out.println("Hammer is stored in a toolbox");
    }

    @Override
    public void identify() {
        System.out.println("Hammer has a handle and a heavy head");
    }

    @Override
    public void safetyCheck() {
        System.out.println("Hammer should be checked for loose head before use");
    }
}
