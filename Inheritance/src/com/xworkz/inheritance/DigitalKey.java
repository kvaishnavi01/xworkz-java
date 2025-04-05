package com.xworkz.inheritance;

public class DigitalKey extends Key {
    public DigitalKey() {
        System.out.println("no args const of DigitalKey");
    }

    @Override
    public void open() {
        System.out.println("DigitalKey opens with code");
    }

    @Override
    public void close() {
        System.out.println("DigitalKey auto locks");
    }

    @Override
    public void duplicate() {
        System.out.println("DigitalKey can't be duplicated easily");
    }

    @Override
    public void carry() {
        System.out.println("DigitalKey is stored in phone");
    }

    @Override
    public void identify() {
        System.out.println("DigitalKey links to user ID");
    }
}
