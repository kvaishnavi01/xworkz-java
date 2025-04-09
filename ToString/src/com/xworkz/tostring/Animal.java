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
}
