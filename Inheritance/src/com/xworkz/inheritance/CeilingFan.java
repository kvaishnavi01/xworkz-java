package com.xworkz.inheritance;

public class CeilingFan extends Fan {
    public CeilingFan() {
        System.out.println("no args const of CeilingFan");
    }

    @Override
    public void spin() {
        System.out.println("CeilingFan spins above the room");
    }

    @Override
    public void start() {
        System.out.println("CeilingFan starts with a regulator");
    }

    @Override
    public void stop() {
        System.out.println("CeilingFan stops smoothly");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("CeilingFan speed adjusted to level 3");
    }

    @Override
    public void swing() {
        System.out.println("CeilingFan does not swing");
    }
}
