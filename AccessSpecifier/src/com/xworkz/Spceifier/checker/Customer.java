package com.xworkz.Spceifier.checker;

import com.xworkz.Spceifier.Hotel;

public class Customer {
    public void Acesser() {
        Hotel h1 = new Hotel();
        System.out.println("Our hotel has " + h1.rooms + " rooms. (Accessing this from another package)");

        h1.welcomeGuests();
        System.out.println("***********************************************");
    }
}
