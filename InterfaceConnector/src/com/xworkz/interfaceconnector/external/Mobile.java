package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Phone;

public class Mobile implements Phone {
    public Mobile() {
        System.out.println("Mobile created");
    }

    @Override
    public void call() {
        System.out.println("Mobile is making a call");
    }
}