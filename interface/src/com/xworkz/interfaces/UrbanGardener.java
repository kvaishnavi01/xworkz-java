package com.xworkz.interfaces;

public class UrbanGardener implements Gardener {
    public void plantTrees() {
        System.out.println("Plants trees in urban spaces.");
    }
    public void maintainLawns() {
        System.out.println("Maintains lawns in public parks.");
    }
    public void landscapeGardens() {
        System.out.println("Designs and landscapes urban gardens.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
