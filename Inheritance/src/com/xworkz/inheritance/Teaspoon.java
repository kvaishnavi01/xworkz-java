package com.xworkz.inheritance;

public class Teaspoon extends Spoon {
    public Teaspoon() {
        System.out.println("no args const of Teaspoon");
    }

    @Override
    public void scoop() {
        System.out.println("Teaspoon is used to scoop sugar");
    }

    @Override
    public void stir() {
        System.out.println("Teaspoon stirs tea or coffee");
    }

    @Override
    public void wash() {
        System.out.println("Teaspoon is cleaned with warm water");
    }

    @Override
    public void place() {
        System.out.println("Teaspoon is placed in the saucer");
    }

    @Override
    public void pick() {
        System.out.println("Teaspoon is picked for mixing drinks");
    }
}
