package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Taco;

public class FoodTruck {
    private Taco taco;

    public FoodTruck(Taco taco) {
        System.out.println("FoodTruck with Taco created");
        this.taco = taco;
    }

    public void serve() {
        System.out.println("FoodTruck is using taco");
        if (taco != null) {
            this.taco.fill();
        }
    }
}