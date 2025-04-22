package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Donut;

public class DonutShop {
    private Donut donut;

    public DonutShop(Donut donut) {
        System.out.println("DonutShop with Donut created");
        this.donut = donut;
    }

    public void sell() {
        System.out.println("DonutShop is using donut");
        if (donut != null) {
            this.donut.glaze();
        }
    }
}