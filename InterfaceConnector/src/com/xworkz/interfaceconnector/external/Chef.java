package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Chocolate;

public class Chef {
    private Chocolate chocolate;

    public Chef(Chocolate chocolate) {
        System.out.println("Chef with Chocolate created");
        this.chocolate = chocolate;
    }

    public void cook() {
        System.out.println("Chef is using chocolate");
        if (chocolate != null) {
            this.chocolate.melt();
        }
    }
}