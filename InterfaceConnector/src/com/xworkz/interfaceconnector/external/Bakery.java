package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Pastry;

public class Bakery {
    private Pastry pastry;

    public Bakery(Pastry pastry) {
        System.out.println("Bakery with Pastry created");
        this.pastry = pastry;
    }

    public void prepare() {
        System.out.println("Bakery is using pastry");
        if (pastry != null) {
            this.pastry.bake();
        }
    }
}