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

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Recipe) {
                System.out.println("will compare.....");
                Recipe r1 = this;
                Recipe r2 = (Recipe) obj;
                if(r1.dishName.equals(r2.dishName) && r1.isVegetarian == r2.isVegetarian) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
