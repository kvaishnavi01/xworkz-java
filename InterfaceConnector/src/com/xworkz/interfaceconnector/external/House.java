package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Door;

public class House {
    private Door door;

    public House(Door door) {
        System.out.println("House with Door created");
        this.door = door;
    }

    public void enter() {
        System.out.println("House is using door");
        if (door != null) {
            this.door.open();
        }
    }
}