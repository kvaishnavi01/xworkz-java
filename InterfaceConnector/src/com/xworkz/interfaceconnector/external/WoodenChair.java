package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Chair;

public class WoodenChair implements Chair {
    public WoodenChair() {
        System.out.println("WoodenChair created");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on WoodenChair");
    }
}