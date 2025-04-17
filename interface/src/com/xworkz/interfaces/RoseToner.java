package com.xworkz.interfaces;

public class RoseToner implements Toner {
    public void tightenPores() {
        System.out.println("Tightens pores using rose extract.");
    }
    public void balancePH() {
        System.out.println("Balances skin pH after cleansing.");
    }
    public void refreshSkin() {
        System.out.println("Gives a fresh feel with every spray.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
