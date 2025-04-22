package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Primer;

public class MakeupVan {
    private Primer primer;

    public MakeupVan(Primer primer) {
        System.out.println("MakeupVan with Primer created");
        this.primer = primer;
    }

    public void base() {
        System.out.println("MakeupVan is using primer");
        if (primer != null) {
            this.primer.prep();
        }
    }
}