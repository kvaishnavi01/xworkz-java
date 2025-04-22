package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.LipGloss;

public class BeautyKit {
    private LipGloss lipGloss;

    public BeautyKit(LipGloss lipGloss) {
        System.out.println("BeautyKit with LipGloss created");
        this.lipGloss = lipGloss;
    }

    public void enhance() {
        System.out.println("BeautyKit is using lipGloss");
        if (lipGloss != null) {
            this.lipGloss.shine();
        }
    }
}