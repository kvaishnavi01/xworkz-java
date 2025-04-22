package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.LipBalm;

public class TintedLipBalm implements LipBalm {
    public TintedLipBalm() {
        System.out.println("TintedLipBalm created");
    }

    @Override
    public void soothe() {
        System.out.println("Soothing with TintedLipBalm");
    }
}