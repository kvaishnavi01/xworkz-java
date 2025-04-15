package com.xworkz.abstractclass;

abstract class Flight {
    String airline;
    String from;
    String to;
    double price;

    Flight(String airline, String from) {
        this.airline = airline;
        this.from = from;
    }

    Flight(String airline, String from, String to) {
        this.airline = airline;
        this.from = from;
        this.to = to;
    }

    Flight(String airline, String from, String to, double price) {
        this.airline = airline;
        this.from = from;
        this.to = to;
        this.price = price;
    }
}
