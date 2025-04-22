package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Eyeliner;

public class GelEyeliner implements Eyeliner {
    public GelEyeliner() {
        System.out.println("GelEyeliner created");
    }

    @Override
    public void draw() {
        System.out.println("Drawing with GelEyeliner");
    }
}