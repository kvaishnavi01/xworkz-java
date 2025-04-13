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

    @Override
    public int hashCode(){
        return 8;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Book) {
                System.out.println("will compare.....");
                Book b1 = this;
                Book b2 = (Book) obj;
                if(b1.author.equals(b2.author)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
