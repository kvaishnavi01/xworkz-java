package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Ganache;

public class DarkGanache implements Ganache {
    public DarkGanache() {
        System.out.println("DarkGanache created");
    }

    @Override
    public void pour() {
        System.out.println("Pouring DarkGanache");
    }
}