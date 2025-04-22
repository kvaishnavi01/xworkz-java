package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Toffee;

public class CaramelToffee implements Toffee {
    public CaramelToffee() {
        System.out.println("CaramelToffee created");
    }

    @Override
    public void chew() {
        System.out.println("Chewing CaramelToffee");
    }
}