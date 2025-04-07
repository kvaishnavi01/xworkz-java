package com.xworkz.inheritance;

public class ChineseChef {
    public void noodles(Cook cook){
        cook.cookFood();
        cook.cleanKitchen();
        cook.prepareIngredients();
        cook.serveFood();
        cook.storeLeftovers();

        if(cook instanceof PastryChef){
            PastryChef pastryChef=(PastryChef) cook;
            pastryChef.flavour();
        }
    }
}
