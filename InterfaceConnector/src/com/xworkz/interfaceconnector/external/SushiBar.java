package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Sushi;

public class SushiBar {
    private Sushi sushi;

    public SushiBar(Sushi sushi) {
        System.out.println("SushiBar with Sushi created");
        this.sushi = sushi;
    }

    public void serve() {
        System.out.println("SushiBar is using sushi");
        if (sushi != null) {
            this.sushi.roll();
        }
    }
}