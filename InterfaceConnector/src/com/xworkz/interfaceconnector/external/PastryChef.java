package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Ganache;

public class PastryChef {
    private Ganache ganache;

    public PastryChef(Ganache ganache) {
        System.out.println("PastryChef with Ganache created");
        this.ganache = ganache;
    }

    public void decorate() {
        System.out.println("PastryChef is using ganache");
        if (ganache != null) {
            this.ganache.pour();
        }
    }
}