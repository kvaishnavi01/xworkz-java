package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Waffle;

public class BreakfastNook {
    private Waffle waffle;

    public BreakfastNook(Waffle waffle) {
        System.out.println("BreakfastNook with Waffle created");
        this.waffle = waffle;
    }

    public void plate() {
        System.out.println("BreakfastNook is using waffle");
        if (waffle != null) {
            this.waffle.crisp();
        }
    }
}