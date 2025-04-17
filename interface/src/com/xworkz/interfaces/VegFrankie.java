package com.xworkz.interfaces;

public class VegFrankie implements Frankie {
    public void prepareFilling() {
        System.out.println("Prepares spiced mixed veggie filling.");
    }

    public void rollRoti() {
        System.out.println("Rolls soft roti for the wrap.");
    }

    public void packWrap() {
        System.out.println("Wraps and packs the frankie.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
