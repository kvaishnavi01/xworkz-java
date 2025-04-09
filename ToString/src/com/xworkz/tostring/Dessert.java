package com.xworkz.tostring;

public class Dessert {
    private String name;
    private int calories;
    private boolean isCold;

    public Dessert(String name, int calories, boolean isCold) {
        this.name = name;
        this.calories = calories;
        this.isCold = isCold;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " calories are " + this.calories + " cold is " + this.isCold;
    }
}
