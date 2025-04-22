package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Light;

public class Room {
    private Light light;

    public Room(Light light) {
        System.out.println("Room with Light created");
        this.light = light;
    }

    public void illuminate() {
        System.out.println("Room is using light");
        if (light != null) {
            this.light.glow();
        }
    }
}