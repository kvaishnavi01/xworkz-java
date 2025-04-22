package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Lipstick;

public class MakeupArtist {
    private Lipstick lipstick;

    public MakeupArtist(Lipstick lipstick) {
        System.out.println("MakeupArtist with Lipstick created");
        this.lipstick = lipstick;
    }

    public void beautify() {
        System.out.println("MakeupArtist is using lipstick");
        if (lipstick != null) {
            this.lipstick.apply();
        }
    }
}