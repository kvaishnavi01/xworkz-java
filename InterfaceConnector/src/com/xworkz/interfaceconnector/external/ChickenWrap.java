package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Wrap;

public class ChickenWrap implements Wrap {
    public ChickenWrap() {
        System.out.println("ChickenWrap created");
    }

    @Override
    public void fold() {
        System.out.println("Folding ChickenWrap");
    }
}