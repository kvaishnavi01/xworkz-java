package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Marshmallow;

public class VanillaMarshmallow implements Marshmallow {
    public VanillaMarshmallow() {
        System.out.println("VanillaMarshmallow created");
    }

    @Override
    public void roast() {
        System.out.println("Roasting VanillaMarshmallow");
    }
}