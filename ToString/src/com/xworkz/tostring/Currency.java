package com.xworkz.tostring;

public class Currency {
    private String country;
    private long valueInPaise;
    private char symbol;

    public Currency(String country, long valueInPaise, char symbol) {
        this.country = country;
        this.valueInPaise = valueInPaise;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "country is " + this.country + " value is " + this.valueInPaise + " symbol is " + this.symbol;
    }

    @Override
    public int hashCode() {
        return 64;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Currency) {
                System.out.println("will compare.....");
                Currency c1 = this;
                Currency c2 = (Currency) obj;
                if (c1.country.equals(c2.country) && c1.valueInPaise == c2.valueInPaise && c1.symbol == c2.symbol) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
