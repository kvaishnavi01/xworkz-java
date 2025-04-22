package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Light;

public class Bulb implements Light {
    public Bulb() {
        System.out.println("Bulb created");
    }

    @Override
    public void glow() {
        System.out.println("Bulb is glowing");
    }
}