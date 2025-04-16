package com.xworkz.interfaces;

public class AloeFaceWash implements FaceWash {
    public void removeDirt() {
        System.out.println("Removes dirt and impurities from the face.");
    }
    public void refreshSkin() {
        System.out.println("Refreshes the skin with aloe essence.");
    }
    public void controlOil() {
        System.out.println("Controls excess oil production.");
    }
}
