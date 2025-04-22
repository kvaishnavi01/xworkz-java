package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Lock;

public class Padlock implements Lock {
    public Padlock() {
        System.out.println("Padlock created");
    }

    @Override
    public void secure() {
        System.out.println("Padlock is securing");
    }
}