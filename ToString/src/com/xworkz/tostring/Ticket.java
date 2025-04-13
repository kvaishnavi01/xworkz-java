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

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Ticket) {
                System.out.println("will compare.....");
                Ticket ticket = this;
                Ticket ticket1 = (Ticket) obj;
                if(ticket.event.equals(ticket1.event) && ticket.price == ticket1.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
