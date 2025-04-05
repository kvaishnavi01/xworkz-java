package com.xworkz.inheritance;

public class Key {
    public Key() {
        System.out.println("no args const of Key");
    }

    public void open() {
        System.out.println("Key opens the lock");
    }

    public void close() {
        System.out.println("Key closes the lock");
    }

    public void duplicate() {
        System.out.println("Key can be duplicated");
    }

    public void carry() {
        System.out.println("Key is easy to carry");
    }

    public void identify() {
        System.out.println("Key is used to identify ownership");
    }
}
