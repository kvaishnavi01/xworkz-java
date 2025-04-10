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
    public int hashCode(){
        return 64;
    }
}
