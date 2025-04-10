package com.xworkz.tostring;

public class Recipe {
    private String dishName;
    private int cookingTime;
    private boolean isVegetarian;

    public Recipe(String dishName, int cookingTime, boolean isVegetarian) {
        this.dishName = dishName;
        this.cookingTime = cookingTime;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String toString() {
        return "dish name is " + this.dishName + " cooking time is " + this.cookingTime + " vegetarian is " + this.isVegetarian;
    }
    @Override
    public int hashCode(){
        return 51;
    }
}
