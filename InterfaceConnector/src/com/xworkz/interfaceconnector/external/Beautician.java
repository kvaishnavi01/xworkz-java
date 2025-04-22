package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Foundation;

public class Beautician {
    private Foundation foundation;

    public Beautician(Foundation foundation) {
        System.out.println("Beautician with Foundation created");
        this.foundation = foundation;
    }

    public void makeup() {
        System.out.println("Beautician is using foundation");
        if (foundation != null) {
            this.foundation.blend();
        }
    }
}