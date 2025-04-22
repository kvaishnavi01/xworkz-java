package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.IceCream;

public class DessertShop {
    private IceCream iceCream;

    public DessertShop(IceCream iceCream) {
        System.out.println("DessertShop with IceCream created");
        this.iceCream = iceCream;
    }

    public void sell() {
        System.out.println("DessertShop is using iceCream");
        if (iceCream != null) {
            this.iceCream.scoop();
        }
    }
}