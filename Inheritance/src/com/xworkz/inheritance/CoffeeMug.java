package com.xworkz.inheritance;

public class CoffeeMug extends Mug {
    public CoffeeMug() {
        System.out.println("no args const of CoffeeMug");
    }

    @Override
    public void fill() {
        System.out.println("CoffeeMug is filled with coffee");
    }

    @Override
    public void hold() {
        System.out.println("CoffeeMug is held by the handle");
    }

    @Override
    public void wash() {
        System.out.println("CoffeeMug is washed with soap");
    }

    @Override
    public void empty() {
        System.out.println("CoffeeMug is emptied after drinking");
    }

    @Override
    public void store() {
        System.out.println("CoffeeMug is placed in the cabinet");
    }
}
