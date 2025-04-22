package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Fan;

public class Bedroom {
    private Fan fan;

    public Bedroom(Fan fan) {
        System.out.println("Bedroom with Fan created");
        this.fan = fan;
    }

    public void cool() {
        System.out.println("Bedroom is using fan");
        if (fan != null) {
            this.fan.spin();
        }
    }
}