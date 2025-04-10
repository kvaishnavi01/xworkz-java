package com.xworkz.tostring;

public class Ticket {
    private String event;
    private double price;
    private boolean isVIP;

    public Ticket(String event, double price, boolean isVIP) {
        this.event = event;
        this.price = price;
        this.isVIP = isVIP;
    }

    @Override
    public String toString() {
        return "event is " + this.event + " price is " + this.price + " VIP is " + this.isVIP;
    }
    @Override
    public int hashCode(){
        return 42;
    }
}
