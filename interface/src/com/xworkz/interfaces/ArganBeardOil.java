package com.xworkz.interfaces;

public class ArganBeardOil implements BeardOil {
    public void nourishBeard() {
        System.out.println("Nourishes the beard with argan oil.");
    }
    public void softenBeard() {
        System.out.println("Softens rough and frizzy beard.");
    }
    public void promoteGrowth() {
        System.out.println("Promotes healthy beard growth.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
