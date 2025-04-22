package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Lipstick;

public class MatteLipstick implements Lipstick {
    public MatteLipstick() {
        System.out.println("MatteLipstick created");
    }

    @Override
    public void apply() {
        System.out.println("Applying MatteLipstick");
    }
}