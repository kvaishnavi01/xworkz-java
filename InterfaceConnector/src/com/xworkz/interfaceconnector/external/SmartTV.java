package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.TV;

public class SmartTV implements TV {
    public SmartTV() {
        System.out.println("SmartTV created");
    }

    @Override
    public void play() {
        System.out.println("SmartTV is playing");
    }
}