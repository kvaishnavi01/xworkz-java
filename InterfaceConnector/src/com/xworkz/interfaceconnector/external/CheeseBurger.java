package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Burger;

public class CheeseBurger implements Burger {
    public CheeseBurger() {
        System.out.println("CheeseBurger created");
    }

    @Override
    public void grill() {
        System.out.println("Grilling CheeseBurger");
    }
}