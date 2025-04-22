package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Marshmallow;

public class Campfire {
    private Marshmallow marshmallow;

    public Campfire(Marshmallow marshmallow) {
        System.out.println("Campfire with Marshmallow created");
        this.marshmallow = marshmallow;
    }

    public void treat() {
        System.out.println("Campfire is using marshmallow");
        if (marshmallow != null) {
            this.marshmallow.roast();
        }
    }
}