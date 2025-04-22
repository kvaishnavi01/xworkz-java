package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Pancake;

public class ButtermilkPancake implements Pancake {
    public ButtermilkPancake() {
        System.out.println("ButtermilkPancake created");
    }

    @Override
    public void flip() {
        System.out.println("Flipping ButtermilkPancake");
    }
}