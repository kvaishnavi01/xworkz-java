package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Sushi;

public class CaliforniaRoll implements Sushi {
    public CaliforniaRoll() {
        System.out.println("CaliforniaRoll created");
    }

    @Override
    public void roll() {
        System.out.println("Rolling CaliforniaRoll");
    }
}