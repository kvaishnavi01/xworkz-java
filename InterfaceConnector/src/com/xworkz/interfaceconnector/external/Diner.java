package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Burger;

public class Diner {
    private Burger burger;

    public Diner(Burger burger) {
        System.out.println("Diner with Burger created");
        this.burger = burger;
    }

    public void serve() {
        System.out.println("Diner is using burger");
        if (burger != null) {
            this.burger.grill();
        }
    }
}