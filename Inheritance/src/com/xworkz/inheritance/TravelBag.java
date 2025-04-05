package com.xworkz.inheritance;

public class TravelBag extends Bag {
    public TravelBag() {
        System.out.println("no args const of TravelBag");
    }

    @Override
    public void carry() {
        System.out.println("Travel bag carries clothes and essentials");
    }

    @Override
    public void zip() {
        System.out.println("Travel bag is zipped securely");
    }

    @Override
    public void unzip() {
        System.out.println("Travel bag is unzipped at the airport");
    }

    @Override
    public void place() {
        System.out.println("Travel bag is placed in luggage rack");
    }

    @Override
    public void lift() {
        System.out.println("Travel bag is lifted using wheels handle");
    }
}
