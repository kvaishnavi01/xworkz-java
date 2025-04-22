package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Cake;

public class ChocolateCake implements Cake {
    public ChocolateCake() {
        System.out.println("ChocolateCake created");
    }

    @Override
    public void decorate() {
        System.out.println("Decorating ChocolateCake");
    }
}