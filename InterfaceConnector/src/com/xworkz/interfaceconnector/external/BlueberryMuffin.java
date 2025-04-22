package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Muffin;

public class BlueberryMuffin implements Muffin {
    public BlueberryMuffin() {
        System.out.println("BlueberryMuffin created");
    }

    @Override
    public void bake() {
        System.out.println("Baking BlueberryMuffin");
    }
}