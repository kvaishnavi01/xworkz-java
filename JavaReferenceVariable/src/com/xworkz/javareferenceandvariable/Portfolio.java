package com.xworkz.javareferenceandvariable;

public class Portfolio {
    String title;
    int code;
    String details;
    int funding;

    Portfolio(String title, int code, String details, int funding) {
        this.title = title;
        this.code = code;
        this.details = details;
        this.funding = funding;
        System.out.println("Title: " + this.title + " | Code: " + this.code +
                " | Details: " + this.details + " | Funding: " + this.funding);
    }

    void display() {
        System.out.println("Showing portfolio details");
    }
}