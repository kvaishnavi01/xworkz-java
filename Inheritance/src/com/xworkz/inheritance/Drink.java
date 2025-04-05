package com.xworkz.inheritance;

public class Drink {
    public Drink() {
        System.out.println("no args const of Drink");
    }

    public void serve() {
        System.out.println("Drink is being served");
    }

    public void consume() {
        System.out.println("Drink is being consumed");
    }

    public void addIngredients() {
        System.out.println("Ingredients are added to the drink");
    }

    public void coolDown() {
        System.out.println("Drink is cooling down");
    }

    public void stir() {
        System.out.println("Drink is stirred before serving");
    }
}
