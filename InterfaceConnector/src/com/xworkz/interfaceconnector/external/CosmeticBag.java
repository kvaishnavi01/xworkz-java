package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.LipBalm;

public class CosmeticBag {
    private LipBalm lipBalm;

    public CosmeticBag(LipBalm lipBalm) {
        System.out.println("CosmeticBag with LipBalm created");
        this.lipBalm = lipBalm;
    }

    public void moisturize() {
        System.out.println("CosmeticBag is using lipBalm");
        if (lipBalm != null) {
            this.lipBalm.soothe();
        }
    }
}