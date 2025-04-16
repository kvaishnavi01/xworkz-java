package com.xworkz.interfaces;

public class ResidentialAgent implements RealEstateAgent {
    public void showProperties() {
        System.out.println("Shows residential properties.");
    }
    public void negotiateDeals() {
        System.out.println("Negotiates deals for residential properties.");
    }
    public void handlePaperwork() {
        System.out.println("Handles paperwork for property deals.");
    }
}
