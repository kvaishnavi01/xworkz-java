package com.xworkz.inheritance;

public class Cryptocurrency extends Currency {
    public Cryptocurrency() {
        System.out.println("no args const of Cryptocurrency");
    }

    @Override
    public void use() {
        System.out.println("Cryptocurrency is used for digital transactions");
    }

    @Override
    public void exchange() {
        System.out.println("Cryptocurrency can be exchanged on crypto exchanges");
    }

    @Override
    public void storeValue() {
        System.out.println("Cryptocurrency is stored in digital wallets");
    }

    @Override
    public void measureValue() {
        System.out.println("Cryptocurrency value is measured by market demand");
    }

    @Override
    public void legalStatus() {
        System.out.println("Cryptocurrency legality varies by country");
    }

    public void mine() {
        System.out.println("Cryptocurrency is mined using computational power");
    }
}
