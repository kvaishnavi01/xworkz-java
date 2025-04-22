package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Candy;

public class Lollipop implements Candy {
    public Lollipop() {
        System.out.println("Lollipop created");
    }

    @Override
    public void wrap() {
        System.out.println("Wrapping Lollipop");
    }
}