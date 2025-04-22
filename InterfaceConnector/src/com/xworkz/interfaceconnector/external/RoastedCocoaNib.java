package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.CocoaNib;

public class RoastedCocoaNib implements CocoaNib {
    public RoastedCocoaNib() {
        System.out.println("RoastedCocoaNib created");
    }

    @Override
    public void grind() {
        System.out.println("Grinding RoastedCocoaNib");
    }
}