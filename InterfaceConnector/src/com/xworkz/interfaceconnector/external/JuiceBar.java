package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Smoothie;

public class JuiceBar {
    private Smoothie smoothie;

    public JuiceBar(Smoothie smoothie) {
        System.out.println("JuiceBar with Smoothie created");
        this.smoothie = smoothie;
    }

    public void serve() {
        System.out.println("JuiceBar is using smoothie");
        if (smoothie != null) {
            this.smoothie.blend();
        }
    }
}