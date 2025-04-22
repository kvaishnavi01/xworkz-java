package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Pen;

public class BallPen implements Pen {
    public BallPen() {
        System.out.println("BallPen created");
    }

    @Override
    public void write() {
        System.out.println("BallPen is writing");
    }
}