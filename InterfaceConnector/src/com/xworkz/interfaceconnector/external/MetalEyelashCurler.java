package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.EyelashCurler;

public class MetalEyelashCurler implements EyelashCurler {
    public MetalEyelashCurler() {
        System.out.println("MetalEyelashCurler created");
    }

    @Override
    public void curl() {
        System.out.println("Curling with MetalEyelashCurler");
    }
}