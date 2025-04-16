package com.xworkz.interfaces;

class SnackChef implements KandaBhaji, Misal, PavBhaji, RagdaPattice, Sevpuri {
    public void sliceOnions() {
        System.out.println("SnackChef: Slicing onions for kanda bhaji.");
    }
    public void coatWithBesan() {
        System.out.println("SnackChef: Coating onions with besan for kanda bhaji.");
    }
    public void deepFry() {
        System.out.println("SnackChef: Deep frying kanda bhaji.");
    }
    public void makeRassa() {
        System.out.println("SnackChef: Preparing rassa for misal.");
    }
    public void fryUsal() {
        System.out.println("SnackChef: Frying usal for misal.");
    }
    public void topWithFarsan() {
        System.out.println("SnackChef: Topping misal with farsan.");
    }
    public void cookBhaji() {
        System.out.println("SnackChef: Cooking bhaji for pav bhaji.");
    }
    public void toastPav() {
        System.out.println("SnackChef: Toasting pav for pav bhaji.");
    }
    public void garnish() {
        System.out.println("SnackChef: Garnishing pav bhaji with coriander.");
    }
    public void prepareRagda() {
        System.out.println("SnackChef: Preparing ragda for ragda pattice.");
    }
    public void shallowFryPattice() {
        System.out.println("SnackChef: Shallow frying pattice for ragda pattice.");
    }
    public void serveWithGarnish() {
        System.out.println("SnackChef: Serving ragda pattice with garnish.");
    }
    public void addToppings() {
        System.out.println("SnackChef: Adding toppings to sevpuri.");
    }
    public void crushPuri() {
        System.out.println("SnackChef: Crushing puri for sevpuri.");
    }
    public void serveWithChutney() {
        System.out.println("SnackChef: Serving sevpuri with chutney.");
    }
}