package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.LipGloss;

public class SparkleLipGloss implements LipGloss {
    public SparkleLipGloss() {
        System.out.println("SparkleLipGloss created");
    }

    @Override
    public void shine() {
        System.out.println("Shining with SparkleLipGloss");
    }
}