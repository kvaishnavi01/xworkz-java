package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Muffin;

public class CoffeeShop {
    private Muffin muffin;

    public CoffeeShop(Muffin muffin) {
        System.out.println("CoffeeShop with Muffin created");
        this.muffin = muffin;
    }

    public void offer() {
        System.out.println("CoffeeShop is using muffin");
        if (muffin != null) {
            this.muffin.bake();
        }
    }
}