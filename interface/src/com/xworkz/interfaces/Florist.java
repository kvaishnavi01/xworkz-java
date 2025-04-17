package com.xworkz.interfaces;

public interface Florist {
    void arrangeFlowers();
    void takeOrders();
    void deliverBouquets();
    default String getDescription() {
        return "This is a default method";
    }
}
