package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Bagel;

public class BagelShop {
    private Bagel bagel;

    public BagelShop(Bagel bagel) {
        System.out.println("BagelShop with Bagel created");
        this.bagel = bagel;
    }

    public void serve() {
        System.out.println("BagelShop is using bagel");
        if (bagel != null) {
            this.bagel.spread();
        }
    }
}