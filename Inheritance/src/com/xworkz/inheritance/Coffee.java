package com.xworkz.inheritance;

public class Coffee extends Drink {
    public Coffee() {
        System.out.println("no args const of Coffee");
    }

    @Override
    public void serve() {
        System.out.println("Coffee is served hot in a mug");
    }

    @Override
    public void consume() {
        System.out.println("Coffee is sipped slowly");
    }

    @Override
    public void addIngredients() {
        System.out.println("Milk, sugar, and coffee powder are added");
    }

    @Override
    public void coolDown() {
        System.out.println("Coffee is allowed to cool slightly");
    }

    @Override
    public void stir() {
        System.out.println("Coffee is stirred with a spoon");
    }
}
