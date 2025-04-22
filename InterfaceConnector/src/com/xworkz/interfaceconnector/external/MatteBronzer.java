package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Bronzer;

public class MatteBronzer implements Bronzer {
    public MatteBronzer() {
        System.out.println("MatteBronzer created");
    }

    @Override
    public void contour() {
        System.out.println("Contouring with MatteBronzer");
    }
}