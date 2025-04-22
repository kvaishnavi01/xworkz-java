package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Mascara;

public class VolumizingMascara implements Mascara {
    public VolumizingMascara() {
        System.out.println("VolumizingMascara created");
    }

    @Override
    public void coat() {
        System.out.println("Coating with VolumizingMascara");
    }
}