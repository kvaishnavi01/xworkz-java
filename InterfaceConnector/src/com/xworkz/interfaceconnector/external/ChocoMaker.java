package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.CocoaButter;

public class ChocoMaker {
    private CocoaButter cocoaButter;

    public ChocoMaker(CocoaButter cocoaButter) {
        System.out.println("ChocoMaker with CocoaButter created");
        this.cocoaButter = cocoaButter;
    }

    public void mix() {
        System.out.println("ChocoMaker is using cocoaButter");
        if (cocoaButter != null) {
            this.cocoaButter.melt();
        }
    }
}