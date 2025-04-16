package com.xworkz.interfaces;

public class PrimerBartender implements Primer, Bartender {
    public void applyPrimer() {
        System.out.println("Applies primer to smooth skin.");
    }

    public void setSmoothBase() {
        System.out.println("Sets a smooth base for makeup.");
    }

    public void prepareSkinForMakeup() {
        System.out.println("Prepares skin for makeup application.");
    }

    public void mixDrinks() {
        System.out.println("Mixes drinks for guests.");
    }

    public void takeOrders() {
        System.out.println("Takes orders for drinks.");
    }

    public void maintainBar() {
        System.out.println("Maintains the bar area.");
    }

    @Override
    public void prepSkin() {

    }

    @Override
    public void minimizePores() {

    }

    @Override
    public void smoothTexture() {

    }
}
