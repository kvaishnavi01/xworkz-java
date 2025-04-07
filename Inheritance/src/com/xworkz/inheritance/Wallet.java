package com.xworkz.inheritance;

public class Wallet {
    public void process(Currency currency) {
        currency.use();
        currency.exchange();
        currency.storeValue();
        currency.measureValue();
        currency.legalStatus();

        if (currency instanceof Cryptocurrency) {
            Cryptocurrency crypto = (Cryptocurrency) currency;
            crypto.mine();
        }
    }
}
