package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Mascara;

public class Stylist {
    private Mascara mascara;

    public Stylist(Mascara mascara) {
        System.out.println("Stylist with Mascara created");
        this.mascara = mascara;
    }

    public void enhance() {
        System.out.println("Stylist is using mascara");
        if (mascara != null) {
            this.mascara.coat();
        }
    }
}