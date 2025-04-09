package com.xworkz.tostring;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "title is " + this.title +
                " author is " + this.author +
                " pages are " + this.pages;
    }
}
