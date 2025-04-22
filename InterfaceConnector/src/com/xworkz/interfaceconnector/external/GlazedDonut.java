package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Donut;

public class GlazedDonut implements Donut {
    public GlazedDonut() {
        System.out.println("GlazedDonut created");
    }

    @Override
    public void glaze() {
        System.out.println("Glazing GlazedDonut");
    }
}