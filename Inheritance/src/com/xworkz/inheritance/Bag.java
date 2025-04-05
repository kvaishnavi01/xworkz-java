package com.xworkz.inheritance;

public class Bag {
    public Bag() {
        System.out.println("no args const of Bag");
    }

    public void carry() {
        System.out.println("Bag is used to carry items");
    }

    public void zip() {
        System.out.println("Bag is being zipped");
    }

    public void unzip() {
        System.out.println("Bag is being unzipped");
    }

    public void place() {
        System.out.println("Bag is placed on the table");
    }

    public void lift() {
        System.out.println("Bag is lifted by the handle");
    }
}
