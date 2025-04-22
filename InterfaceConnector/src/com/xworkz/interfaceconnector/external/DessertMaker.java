package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Caramel;

public class DessertMaker {
    private Caramel caramel;

    public DessertMaker(Caramel caramel) {
        System.out.println("DessertMaker with Caramel created");
        this.caramel = caramel;
    }

    public void top() {
        System.out.println("DessertMaker is using caramel");
        if (caramel != null) {
            this.caramel.drizzle();
        }
    }
}