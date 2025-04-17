package com.xworkz.interfaces;

public class AntibacterialHandWash implements HandWash {
    public void killGerms() {
        System.out.println("Kills 99.9% of germs.");
    }
    public void moisturizeHands() {
        System.out.println("Moisturizes hands while cleaning.");
    }
    public void leaveFragrance() {
        System.out.println("Leaves a pleasant fragrance after wash.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
