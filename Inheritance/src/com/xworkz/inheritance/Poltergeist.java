package com.xworkz.inheritance;

public class Poltergeist extends Ghost {
    public Poltergeist() {
        System.out.println("no args const of Poltergeist");
    }

    @Override
    public void appear() {
        System.out.println("Poltergeist manifests violently");
    }

    @Override
    public void haunt() {
        System.out.println("Poltergeist throws objects around");
    }

    @Override
    public void makeSound() {
        System.out.println("Poltergeist screams loudly");
    }

    @Override
    public void disappear() {
        System.out.println("Poltergeist vanishes with a bang");
    }

    @Override
    public void scare() {
        System.out.println("Poltergeist terrifies everyone");
    }
}