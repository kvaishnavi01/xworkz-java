package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Cake;

public class Patisserie {
    private Cake cake;

    public Patisserie(Cake cake) {
        System.out.println("Patisserie with Cake created");
        this.cake = cake;
    }

    public void display() {
        System.out.println("Patisserie is using cake");
        if (cake != null) {
            this.cake.decorate();
        }
    }
}