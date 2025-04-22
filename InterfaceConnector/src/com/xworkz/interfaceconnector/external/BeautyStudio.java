package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Bronzer;

public class BeautyStudio {
    private Bronzer bronzer;

    public BeautyStudio(Bronzer bronzer) {
        System.out.println("BeautyStudio with Bronzer created");
        this.bronzer = bronzer;
    }

    public void sculpt() {
        System.out.println("BeautyStudio is using bronzer");
        if (bronzer != null) {
            this.bronzer.contour();
        }
    }
}