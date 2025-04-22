package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Wrap;

public class Deli {
    private Wrap wrap;

    public Deli(Wrap wrap) {
        System.out.println("Deli with Wrap created");
        this.wrap = wrap;
    }

    public void prepare() {
        System.out.println("Deli is using wrap");
        if (wrap != null) {
            this.wrap.fold();
        }
    }
}