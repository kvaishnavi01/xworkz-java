package com.xworkz.interfaces;

public class KolhapuriMisal implements Misal {
    public void makeRassa() {
        System.out.println("Makes spicy red rassa.");
    }

    public void fryUsal() {
        System.out.println("Fries sprouts with masala.");
    }

    public void topWithFarsan() {
        System.out.println("Tops misal with crunchy farsan.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
