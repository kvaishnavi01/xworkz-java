package com.xworkz.interfaces;

class StreetFoodVendor implements Bhel, Dahipuri, Frankie, Panipuri, VadaPav {
    public void mixPuffedRice() {
        System.out.println("StreetFoodVendor: Mixing puffed rice for bhel.");
    }
    public void addVeggies() {
        System.out.println("StreetFoodVendor: Adding chopped veggies to bhel.");
    }
    public void squeezeLemon() {
        System.out.println("StreetFoodVendor: Squeezing lemon over bhel.");
    }
    public void addCurd() {
        System.out.println("StreetFoodVendor: Adding curd to dahipuri.");
    }
    public void sprinkleMasala() {
        System.out.println("StreetFoodVendor: Sprinkling masala on dahipuri.");
    }
    public void plateUp() {
        System.out.println("StreetFoodVendor: Plating dahipuri for serving.");
    }
    public void prepareFilling() {
        System.out.println("StreetFoodVendor: Preparing frankie filling.");
    }
    public void rollRoti() {
        System.out.println("StreetFoodVendor: Rolling roti for frankie.");
    }
    public void packWrap() {
        System.out.println("StreetFoodVendor: Packing frankie in foil.");
    }
    public void prepareWater() {
        System.out.println("StreetFoodVendor: Preparing spicy panipuri water.");
    }
    public void fillPuri() {
        System.out.println("StreetFoodVendor: Filling puri with potatoes.");
    }
    public void serve() {
        System.out.println("StreetFoodVendor: Serving panipuri to customers.");
    }
    public void fryVada() {
        System.out.println("StreetFoodVendor: Frying vada for vada pav.");
    }
    public void applyChutney() {
        System.out.println("StreetFoodVendor: Applying chutney to vada pav.");
    }
    public void wrapInPaper() {
        System.out.println("StreetFoodVendor: Wrapping vada pav in paper.");
    }
}