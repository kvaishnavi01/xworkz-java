package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Caramel;

public class SaltedCaramel implements Caramel {
    public SaltedCaramel() {
        System.out.println("SaltedCaramel created");
    }

    @Override
    public void drizzle() {
        System.out.println("Drizzling SaltedCaramel");
    }
}