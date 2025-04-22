package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Cupcake;

public class RedVelvetCupcake implements Cupcake {
    public RedVelvetCupcake() {
        System.out.println("RedVelvetCupcake created");
    }

    @Override
    public void frost() {
        System.out.println("Frosting RedVelvetCupcake");
    }
}