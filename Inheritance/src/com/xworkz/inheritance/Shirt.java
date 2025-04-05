package com.xworkz.inheritance;

public class Shirt extends Clothing {
    public Shirt() {
        System.out.println("no args const of Shirt");
    }

    @Override
    public void wear() {
        System.out.println("Shirt is worn for casual or formal events");
    }

    @Override
    public void wash() {
        System.out.println("Shirt is washed with care to avoid wrinkles");
    }

    @Override
    public void dry() {
        System.out.println("Shirt is drying on a hanger");
    }

    @Override
    public void fold() {
        System.out.println("Shirt is folded neatly");
    }

    @Override
    public void pack() {
        System.out.println("Shirt is packed in a suitcase");
    }
}
