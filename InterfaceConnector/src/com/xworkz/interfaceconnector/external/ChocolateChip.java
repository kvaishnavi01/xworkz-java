package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Cookie;

public class ChocolateChip implements Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip created");
    }

    @Override
    public void crumble() {
        System.out.println("Crumbling ChocolateChip");
    }
}