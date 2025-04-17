package com.xworkz.interfaces;

public class AnimalSurgeon implements Veterinarian {
    public void treatAnimals() {
        System.out.println("Treats sick animals.");
    }
    public void performSurgery() {
        System.out.println("Performs surgeries on animals.");
    }
    public void prescribeMedication() {
        System.out.println("Prescribes medication for animals.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
