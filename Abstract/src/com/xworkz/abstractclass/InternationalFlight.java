package com.xworkz.abstractclass;

import com.xworkz.abstractclass.Flight;

class InternationalFlight extends Flight {
    InternationalFlight(String airline, String from, String to, double price) {
        super(airline, from, to, price);
    }

    void flightDetails() {
        System.out.println("Flight: " + airline + " from " + from + " to " + to + " costs rs." + price);
    }
}
