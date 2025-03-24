package com.xworkz.Spceifier;

import com.xworkz.Spceifier.checker.Customer;
import com.xworkz.Spceifier.checker.PublicRunner;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel h1 = new Hotel();
        Customer c1 = new Customer();

        c1.Acesser();
        System.out.println("Our hotel has " + h1.rooms + " rooms.");
        System.out.println("The hotel name is " + h1.hotelName);

        h1.welcomeGuests();
        h1.serveFood();
    }
}
