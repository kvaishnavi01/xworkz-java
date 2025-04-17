package com.xworkz.interfaces;

public interface Veterinarian {
    void treatAnimals();
    void performSurgery();
    void prescribeMedication();
    default String getDescription() {
        return "This is a default method";
    }
}
