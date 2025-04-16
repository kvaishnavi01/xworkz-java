package com.xworkz.interfaces;

public class NewsFlorist implements NewsReporter, Florist {
    public void gatherNews() {
        System.out.println("Gathers news while handling flower arrangements.");
    }

    public void reportLive() {
        System.out.println("Reports live with a bouquet in hand.");
    }

    public void interviewPeople() {
        System.out.println("Interviews people while delivering flowers.");
    }

    public void arrangeFlowers() {
        System.out.println("Arranges flowers for press conferences.");
    }

    public void takeOrders() {
        System.out.println("Takes floral orders from reporters.");
    }

    public void deliverBouquets() {
        System.out.println("Delivers bouquets to news anchors.");
    }
}
