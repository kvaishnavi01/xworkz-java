package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Taco;

public class BeefTaco implements Taco {
    public BeefTaco() {
        System.out.println("BeefTaco created");
    }

    @Override
    public void fill() {
        System.out.println("Filling BeefTaco");
    }
}