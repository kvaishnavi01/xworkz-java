package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Primer;

public class HydratingPrimer implements Primer {
    public HydratingPrimer() {
        System.out.println("HydratingPrimer created");
    }

    @Override
    public void prep() {
        System.out.println("Prepping with HydratingPrimer");
    }
}