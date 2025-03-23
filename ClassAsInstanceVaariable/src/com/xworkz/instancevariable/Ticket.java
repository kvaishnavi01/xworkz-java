package com.xworkz.instancevariable;

class Ticket {
    TicketType type;
    double cost;

    Ticket(TicketType type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    void buy() {
        System.out.println("Buying ticket of type: " + type + " for Rs." + cost);
    }

    void sell() {
        System.out.println("Selling ticket of type: " + type + " for Rs." + (cost + 50));
    }
}