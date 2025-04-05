package com.xworkz.inheritance;

public class Pizza {
    public Pizza() {
        System.out.println("no args const of Pizza");
    }

    public void bake() {
        System.out.println("Pizza is baking");
    }

    public void slice() {
        System.out.println("Pizza is sliced");
    }

    public void box() {
        System.out.println("Pizza is boxed");
    }

    public void deliver() {
        System.out.println("Pizza is out for delivery");
    }

    public void eat() {
        System.out.println("Pizza is eaten");
    }
}