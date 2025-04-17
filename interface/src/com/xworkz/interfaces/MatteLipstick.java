package com.xworkz.interfaces;

public class MatteLipstick implements Lipstick {
    public void twistOpen() {
        System.out.println("Twists open the lipstick.");
    }
    public void applyOnLips() {
        System.out.println("Applies matte lipstick.");
    }
    public void sealColor() {
        System.out.println("Seals color on lips.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
