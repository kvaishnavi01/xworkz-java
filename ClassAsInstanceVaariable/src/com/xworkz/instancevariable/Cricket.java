package com.xworkz.instancevariable;

class Cricket {
    Ticket ticket;

    Cricket(Ticket ticket) {
        this.ticket = ticket;
    }

    void watch() {
        ticket.buy();
        System.out.println("Watching cricket match!");
    }

    void profit() {
        ticket.sell();
    }
}
