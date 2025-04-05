package com.xworkz.inheritance;

public class Book {
    public Book() {
        System.out.println("no args const of Book");
    }

    public void open() {
        System.out.println("Book is opened");
    }

    public void read() {
        System.out.println("Reading a book");
    }

    public void close() {
        System.out.println("Book is closed");
    }

    public void bookmark() {
        System.out.println("Page is bookmarked");
    }

    public void flipPage() {
        System.out.println("Flipping the page");
    }
}
