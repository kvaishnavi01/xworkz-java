package com.xworkz.interfaces;

public class WeddingFlorist implements Florist {
    public void arrangeFlowers() {
        System.out.println("Arranges flowers for weddings.");
    }
    public void takeOrders() {
        System.out.println("Takes orders for flower arrangements.");
    }
    public void deliverBouquets() {
        System.out.println("Delivers wedding bouquets.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
