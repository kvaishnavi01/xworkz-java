package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Bagel;

public class SesameBagel implements Bagel {
    public SesameBagel() {
        System.out.println("SesameBagel created");
    }

    @Override
    public void spread() {
        System.out.println("Spreading on SesameBagel");
    }
}