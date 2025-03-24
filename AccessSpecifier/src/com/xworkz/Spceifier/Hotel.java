package com.xworkz.Spceifier;

public class Hotel {
    public int rooms = 50;
    private String chefSpecialDish = "Secret Recipe";
    String hotelName = "Grand Palace";

    public void welcomeGuests() {
        System.out.println("Welcome to Grand Palace Hotel!");
    }

    private void kitchenSecrets() {
        System.out.println("Chef's special dish is a secret.");
    }

    void serveFood() {
        System.out.println("Serving delicious meals to guests.");
    }
}
