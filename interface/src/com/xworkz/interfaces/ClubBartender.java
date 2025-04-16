package com.xworkz.interfaces;

public class ClubBartender implements Bartender {
    public void mixDrinks() {
        System.out.println("Mixes drinks at the club.");
    }
    public void takeOrders() {
        System.out.println("Takes drink orders from customers.");
    }
    public void maintainBar() {
        System.out.println("Maintains cleanliness and stock at the bar.");
    }
}
