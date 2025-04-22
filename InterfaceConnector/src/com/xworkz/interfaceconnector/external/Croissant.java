package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Pastry;

public class Croissant implements Pastry {
    public Croissant() {
        System.out.println("Croissant created");
    }

    @Override
    public void bake() {
        System.out.println("Baking Croissant");
    }
}