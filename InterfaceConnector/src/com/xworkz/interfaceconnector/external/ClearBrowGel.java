package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.BrowGel;

public class ClearBrowGel implements BrowGel {
    public ClearBrowGel() {
        System.out.println("ClearBrowGel created");
    }

    @Override
    public void shape() {
        System.out.println("Shaping with ClearBrowGel");
    }
}