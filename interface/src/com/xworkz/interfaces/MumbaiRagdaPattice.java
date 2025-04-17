package com.xworkz.interfaces;

public class MumbaiRagdaPattice implements RagdaPattice {
    public void prepareRagda() {
        System.out.println("Boils and spices white peas.");
    }

    public void shallowFryPattice() {
        System.out.println("Fries potato pattice to golden brown.");
    }

    public void serveWithGarnish() {
        System.out.println("Serves with onion, sev and chutney garnish.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
