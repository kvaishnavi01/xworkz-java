package com.xworkz.tostring;

public class Animal {
    private String species;
    private double weight;
    private boolean isCarnivore;

    public Animal(String species, double weight, boolean isCarnivore) {
        this.species = species;
        this.weight = weight;
        this.isCarnivore = isCarnivore;
    }

    @Override
    public String toString() {
        return "species is " + this.species + " weight is " + this.weight + " carnivore is " + this.isCarnivore;
    }

    @Override
    public int hashCode() {
        return 67;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Animal) {
                System.out.println("will compare.....");
                Animal a1 = this;
                Animal a2 = (Animal) obj;
                if (a1.species.equals(a2.species) && a1.weight == a2.weight && a1.isCarnivore == a2.isCarnivore) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
