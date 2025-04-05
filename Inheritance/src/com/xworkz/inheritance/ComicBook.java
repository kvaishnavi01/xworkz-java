package com.xworkz.inheritance;

public class ComicBook extends Book {
    public ComicBook() {
        System.out.println("no args const of ComicBook");
    }

    @Override
    public void open() {
        System.out.println("ComicBook is opened with colorful pages");
    }

    @Override
    public void read() {
        System.out.println("Reading a fun comic story");
    }

    @Override
    public void close() {
        System.out.println("ComicBook is closed");
    }

    @Override
    public void bookmark() {
        System.out.println("Bookmarking a favorite comic panel");
    }

    @Override
    public void flipPage() {
        System.out.println("Flipping comic pages quickly");
    }
}
