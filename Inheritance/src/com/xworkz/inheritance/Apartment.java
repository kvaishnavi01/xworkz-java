package com.xworkz.inheritance;

public class Apartment extends House {
    public Apartment() {
        System.out.println("no args const of Apartment");
    }

    @Override
    public void build() {
        System.out.println("Apartment is constructed with multiple floors");
    }

    @Override
    public void occupy() {
        System.out.println("Apartment is occupied by several families");
    }

    @Override
    public void decorate() {
        System.out.println("Apartment has minimalistic decoration");
    }

    @Override
    public void maintain() {
        System.out.println("Apartment undergoes periodic maintenance");
    }

    @Override
    public void clean() {
        System.out.println("Apartment common areas are cleaned regularly");
    }
}
