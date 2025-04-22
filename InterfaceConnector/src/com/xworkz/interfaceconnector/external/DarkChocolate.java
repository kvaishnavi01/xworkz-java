package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Chocolate;

public class DarkChocolate implements Chocolate {
    public DarkChocolate() {
        System.out.println("DarkChocolate created");
    }

    @Override
    public void melt() {
        System.out.println("Melting DarkChocolate");
    }
}