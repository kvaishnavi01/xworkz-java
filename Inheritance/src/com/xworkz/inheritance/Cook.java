package com.xworkz.inheritance;

public class Cook {
    public Cook() {
        System.out.println("no args const of Cook");
    }

    public void prepareIngredients() {
        System.out.println("Cook is preparing ingredients");
    }

    public void cookFood() {
        System.out.println("Cook is cooking food");
    }

    public void cleanKitchen() {
        System.out.println("Cook is cleaning the kitchen");
    }

    public void serveFood() {
        System.out.println("Cook is serving the food");
    }

    public void storeLeftovers() {
        System.out.println("Cook is storing the leftovers");
    }
}
