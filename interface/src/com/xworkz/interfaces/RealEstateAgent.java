package com.xworkz.interfaces;

public interface RealEstateAgent {
    void showProperties();
    void negotiateDeals();
    void handlePaperwork();
    default String getDescription() {
        return "This is a default method";
    }
}
