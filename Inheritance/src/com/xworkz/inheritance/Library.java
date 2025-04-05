package com.xworkz.inheritance;

public class Library {
    public Library() {
        System.out.println("no args const of Library");
    }

    public void open() {
        System.out.println("Library is now open to the public");
    }

    public void lendBook() {
        System.out.println("Library lends out physical books");
    }

    public void returnBook() {
        System.out.println("Library accepts returned books");
    }

    public void maintainSilence() {
        System.out.println("Library maintains a quiet environment");
    }

    public void organizeShelves() {
        System.out.println("Library staff organizes physical bookshelves");
    }
}
