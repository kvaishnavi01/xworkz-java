package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Chocolate;

public class Margherita implements Chocolate.Pizza {
    public Margherita() {
        System.out.println("Margherita created");
    }

    @Override
    public void top() {
        System.out.println("Topping Margherita pizza");
    }
}