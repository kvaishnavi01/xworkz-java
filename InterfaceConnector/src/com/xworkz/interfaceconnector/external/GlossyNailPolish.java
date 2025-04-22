package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.NailPolish;

public class GlossyNailPolish implements NailPolish {
    public GlossyNailPolish() {
        System.out.println("GlossyNailPolish created");
    }

    @Override
    public void paint() {
        System.out.println("Painting with GlossyNailPolish");
    }
}