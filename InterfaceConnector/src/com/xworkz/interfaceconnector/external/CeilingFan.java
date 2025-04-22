package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Fan;

public class CeilingFan implements Fan {
    public CeilingFan() {
        System.out.println("CeilingFan created");
    }

    @Override
    public void spin() {
        System.out.println("CeilingFan is spinning");
    }
}