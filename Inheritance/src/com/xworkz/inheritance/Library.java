package com.xworkz.inheritance;

public class Library {
    public Library() {
        System.out.println("no args const of Library");
    }

    public void open() {
        System.out.println("Library is opening");
    }

    public void issueBook() {
        System.out.println("Book is being issued from the library");
    }

    public void returnBook() {
        System.out.println("Book is being returned to the library");
    }

    public void readBook() {
        System.out.println("Reading book in the library");
    }

    public void close() {
        System.out.println("Library is closing");
    }
}
