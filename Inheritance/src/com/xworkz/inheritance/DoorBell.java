package com.xworkz.inheritance;

public class DoorBell extends Bell {
    public DoorBell() {
        System.out.println("no args const of DoorBell");
    }

    @Override
    public void ring() {
        System.out.println("DoorBell rings when someone presses the button");
    }

    @Override
    public void hang() {
        System.out.println("DoorBell is fixed near the door");
    }

    @Override
    public void polish() {
        System.out.println("DoorBell is cleaned with a cloth");
    }

    @Override
    public void makeSound() {
        System.out.println("DoorBell makes a musical sound");
    }

    @Override
    public void stop() {
        System.out.println("DoorBell sound stops after few seconds");
    }
}
