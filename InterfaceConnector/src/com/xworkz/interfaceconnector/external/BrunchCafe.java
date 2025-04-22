package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Pancake;

public class BrunchCafe {
    private Pancake pancake;

    public BrunchCafe(Pancake pancake) {
        System.out.println("BrunchCafe with Pancake created");
        this.pancake = pancake;
    }

    public void cook() {
        System.out.println("BrunchCafe is using pancake");
        if (pancake != null) {
            this.pancake.flip();
        }
    }
}