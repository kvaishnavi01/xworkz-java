package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Door;

public class WoodenDoor implements Door {
    public WoodenDoor() {
        System.out.println("WoodenDoor created");
    }

    @Override
    public void open() {
        System.out.println("WoodenDoor is opening");
    }
}