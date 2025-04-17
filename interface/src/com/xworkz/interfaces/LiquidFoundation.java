package com.xworkz.interfaces;

public class LiquidFoundation implements Foundation {
    public void matchSkinTone() {
        System.out.println("Matches foundation to skin tone.");
    }
    public void provideCoverage() {
        System.out.println("Provides medium to full coverage.");
    }
    public void stayLong() {
        System.out.println("Stays on face all day.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
