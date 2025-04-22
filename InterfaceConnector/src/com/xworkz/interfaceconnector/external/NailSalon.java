package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.NailPolish;

public class NailSalon {
    private NailPolish nailPolish;

    public NailSalon(NailPolish nailPolish) {
        System.out.println("NailSalon with NailPolish created");
        this.nailPolish = nailPolish;
    }

    public void polish() {
        System.out.println("NailSalon is using nailPolish");
        if (nailPolish != null) {
            this.nailPolish.paint();
        }
    }
}