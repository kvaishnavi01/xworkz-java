package com.xworkz.interfaces;

class FoodMaster implements Bhel, Dahipuri, Frankie, Panipuri, VadaPav {
    public void mixPuffedRice() {
        System.out.println("FoodMaster: Mixing puffed rice for bhel.");
    }
    public void addVeggies() {
        System.out.println("FoodMaster: Adding veggies to bhel.");
    }
    public void squeezeLemon() {
        System.out.println("FoodMaster: Squeezing lemon on bhel.");
    }
    public void addCurd() {
        System.out.println("FoodMaster: Adding curd to dahipuri.");
    }
    public void sprinkleMasala() {
        System.out.println("FoodMaster: Sprinkling masala on dahipuri.");
    }
    public void plateUp() {
        System.out.println("FoodMaster: Plating dahipuri.");
    }
    public void prepareFilling() {
        System.out.println("FoodMaster: Preparing frankie filling.");
    }
    public void rollRoti() {
        System.out.println("FoodMaster: Rolling roti for frankie.");
    }
    public void packWrap() {
        System.out.println("FoodMaster: Packing frankie wrap.");
    }
    public void prepareWater() {
        System.out.println("FoodMaster: Preparing panipuri water.");
    }
    public void fillPuri() {
        System.out.println("FoodMaster: Filling puri with stuffing.");
    }
    public void serve() {
        System.out.println("FoodMaster: Serving panipuri.");
    }
    public void fryVada() {
        System.out.println("FoodMaster: Frying vada for vada pav.");
    }
    public void applyChutney() {
        System.out.println("FoodMaster: Applying chutney to vada pav.");
    }
    public void wrapInPaper() {
        System.out.println("FoodMaster: Wrapping vada pav in paper.");
    }
}
