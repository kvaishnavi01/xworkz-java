package com.xworkz.inheritance;

public class VirtualLibrary extends Library {
    public VirtualLibrary() {
        System.out.println("no args const of VirtualLibrary");
    }

    @Override
    public void open() {
        System.out.println("Virtual Library is opening online");
    }

    @Override
    public void issueBook() {
        System.out.println("E-book is being issued online");
    }

    @Override
    public void returnBook() {
        System.out.println("E-book is being returned through portal");
    }

    @Override
    public void readBook() {
        System.out.println("Reading digital book in Virtual Library");
    }

    @Override
    public void close() {
        System.out.println("Virtual Library session is ending");
    }

    public void downloadEbook() {
        System.out.println("Downloading ebook from Virtual Library");
    }
}
