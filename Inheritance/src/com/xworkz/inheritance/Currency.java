package com.xworkz.inheritance;

public class Currency {
    public Currency() {
        System.out.println("no args const of Currency");
    }

    public void use() {
        System.out.println("Currency is used for transactions");
    }

    public void exchange() {
        System.out.println("Currency can be exchanged for goods");
    }

    public void storeValue() {
        System.out.println("Currency stores value over time");
    }

    public void measureValue() {
        System.out.println("Currency measures value of goods");
    }

    public void legalStatus() {
        System.out.println("Currency is recognized by governments");
    }
}
