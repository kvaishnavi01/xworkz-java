package com.xworkz.inheritance;

public class VirtualLibrary extends Library {
    public VirtualLibrary() {
        System.out.println("no args const of VirtualLibrary");
    }

    @Override
    public void open() {
        System.out.println("VirtualLibrary goes live for global access");
    }

    @Override
    public void lendBook() {
        System.out.println("VirtualLibrary allows digital book downloads");
    }

    @Override
    public void returnBook() {
        System.out.println("VirtualLibrary logs return of eBooks automatically");
    }

    @Override
    public void maintainSilence() {
        System.out.println("VirtualLibrary uses noise-canceling algorithms");
    }

    @Override
    public void organizeShelves() {
        System.out.println("VirtualLibrary uses AI to categorize digital content");
    }
}
