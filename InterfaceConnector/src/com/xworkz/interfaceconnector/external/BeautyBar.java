package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.EyelashCurler;

public class BeautyBar {
    private EyelashCurler eyelashCurler;

    public BeautyBar(EyelashCurler eyelashCurler) {
        System.out.println("BeautyBar with EyelashCurler created");
        this.eyelashCurler = eyelashCurler;
    }

    public void lift() {
        System.out.println("BeautyBar is using eyelashCurler");
        if (eyelashCurler != null) {
            this.eyelashCurler.curl();
        }
    }
}