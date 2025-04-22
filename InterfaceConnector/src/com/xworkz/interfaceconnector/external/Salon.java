package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Eyeliner;

public class Salon {
    private Eyeliner eyeliner;

    public Salon(Eyeliner eyeliner) {
        System.out.println("Salon with Eyeliner created");
        this.eyeliner = eyeliner;
    }

    public void style() {
        System.out.println("Salon is using eyeliner");
        if (eyeliner != null) {
            this.eyeliner.draw();
        }
    }
}