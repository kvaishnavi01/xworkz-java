package com.xworkz.interfaces;

public class PressedCompact implements Compact {
    public void setMakeup() {
        System.out.println("Sets makeup in place.");
    }
    public void reduceShine() {
        System.out.println("Reduces facial shine.");
    }
    public void carryEasily() {
        System.out.println("Fits compactly into bags.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
