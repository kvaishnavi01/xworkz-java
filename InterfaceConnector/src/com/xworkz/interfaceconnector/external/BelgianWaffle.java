package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Waffle;

public class BelgianWaffle implements Waffle {
    public BelgianWaffle() {
        System.out.println("BelgianWaffle created");
    }

    @Override
    public void crisp() {
        System.out.println("Crisping BelgianWaffle");
    }
}