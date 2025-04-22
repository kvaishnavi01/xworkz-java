package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Cupcake;

public class CakeShop {
    private Cupcake cupcake;

    public CakeShop(Cupcake cupcake) {
        System.out.println("CakeShop with Cupcake created");
        this.cupcake = cupcake;
    }

    public void decorate() {
        System.out.println("CakeShop is using cupcake");
        if (cupcake != null) {
            this.cupcake.frost();
        }
    }
}