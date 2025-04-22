package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.CocoaNib;

public class ChocolateShop {
    private CocoaNib cocoaNib;

    public ChocolateShop(CocoaNib cocoaNib) {
        System.out.println("ChocolateShop with CocoaNib created");
        this.cocoaNib = cocoaNib;
    }

    public void process() {
        System.out.println("ChocolateShop is using cocoaNib");
        if (cocoaNib != null) {
            this.cocoaNib.grind();
        }
    }
}