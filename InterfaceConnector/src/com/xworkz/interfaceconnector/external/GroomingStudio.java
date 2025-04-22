package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.BrowGel;

public class GroomingStudio {
    private BrowGel browGel;

    public GroomingStudio(BrowGel browGel) {
        System.out.println("GroomingStudio with BrowGel created");
        this.browGel = browGel;
    }

    public void style() {
        System.out.println("GroomingStudio is using browGel");
        if (browGel != null) {
            this.browGel.shape();
        }
    }
}