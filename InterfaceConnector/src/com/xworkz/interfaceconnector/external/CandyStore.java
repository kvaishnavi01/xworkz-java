package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Praline;

public class CandyStore {
    private Praline praline;

    public CandyStore(Praline praline) {
        System.out.println("CandyStore with Praline created");
        this.praline = praline;
    }

    public void packageCandy() {
        System.out.println("CandyStore is using praline");
        if (praline != null) {
            this.praline.coat();
        }
    }
}