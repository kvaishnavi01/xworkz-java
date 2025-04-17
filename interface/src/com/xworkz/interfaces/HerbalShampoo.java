package com.xworkz.interfaces;

public class HerbalShampoo implements Shampoo {
    public void cleanseHair() {
        System.out.println("Cleanses hair deeply using herbal ingredients.");
    }
    public void addFragrance() {
        System.out.println("Adds natural fragrance to the hair.");
    }
    public void strengthenRoots() {
        System.out.println("Strengthens hair roots and prevents hair fall.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
