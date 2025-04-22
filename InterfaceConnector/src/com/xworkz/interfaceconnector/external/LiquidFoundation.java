package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Foundation;


public class LiquidFoundation implements Foundation {
    public LiquidFoundation() {
        System.out.println("LiquidFoundation created");
    }

    @Override
    public void blend() {
        System.out.println("Blending LiquidFoundation");
    }
}