package com.xworkz.inheritance;

public class PastryChef extends Cook {
    public PastryChef() {
        System.out.println("no args const of PastryChef");
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Pastry Chef is preparing flour, sugar, and eggs");
    }

    @Override
    public void cookFood() {
        System.out.println("Pastry Chef is baking desserts");
    }

    @Override
    public void cleanKitchen() {
        System.out.println("Pastry Chef is cleaning baking tools");
    }

    @Override
    public void serveFood() {
        System.out.println("Pastry Chef is serving pastries");
    }

    @Override
    public void storeLeftovers() {
        System.out.println("Pastry Chef is storing cakes and desserts");
    }
}
