package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Smoothie;

public class BerrySmoothie implements Smoothie {
    public BerrySmoothie() {
        System.out.println("BerrySmoothie created");
    }

    @Override
    public void blend() {
        System.out.println("Blending BerrySmoothie");
    }
}