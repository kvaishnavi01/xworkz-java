package com.xworkz.interfaces;

public class WalnutFaceScrub implements FaceScrub {
    public void exfoliate() {
        System.out.println("Exfoliates dead skin cells.");
    }
    public void unclogPores() {
        System.out.println("Unclogs skin pores using walnut granules.");
    }
    public void brightenSkin() {
        System.out.println("Brightens dull skin tone.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
