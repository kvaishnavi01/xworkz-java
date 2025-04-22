package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Bonbon;

public class ChocolateBonbon implements Bonbon {
    public ChocolateBonbon() {
        System.out.println("ChocolateBonbon created");
    }

    @Override
    public void fill() {
        System.out.println("Filling ChocolateBonbon");
    }
}