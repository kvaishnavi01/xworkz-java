package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.IceCream;

public class VanillaIceCream implements IceCream {
    public VanillaIceCream() {
        System.out.println("VanillaIceCream created");
    }

    @Override
    public void scoop() {
        System.out.println("Scooping VanillaIceCream");
    }
}