package com.xworkz.inheritance;

public class Cryptocurrency extends Currency {
    public Cryptocurrency() {
        System.out.println("no args const of Cryptocurrency");
    }

    @Override
    public void exchange() {
        System.out.println("Cryptocurrency is exchanged digitally over blockchain");
    }

    @Override
    public void storeValue() {
        System.out.println("Cryptocurrency value stored in digital wallets");
    }

    @Override
    public void actAsMedium() {
        System.out.println("Cryptocurrency used for peer-to-peer transactions");
    }

    @Override
    public void provideUnit() {
        System.out.println("Cryptocurrency provides tokens as units");
    }

    @Override
    public void recognizeLegally() {
        System.out.println("Cryptocurrency legal status varies by country");
    }
}
