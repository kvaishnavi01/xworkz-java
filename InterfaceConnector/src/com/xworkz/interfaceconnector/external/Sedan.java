package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Car;

public class Sedan implements Car {
    public Sedan() {
        System.out.println("Sedan created");
    }

    @Override
    public void drive() {
        System.out.println("Sedan is driving");
    }
}