package com.xworkz.inheritance;

public class PDFFile extends File {
    public PDFFile() {
        System.out.println("no args const of PDFFile");
    }

    @Override
    public void open() {
        System.out.println("Opening PDF file in a viewer");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF file");
    }

    @Override
    public void read() {
        System.out.println("Reading contents from PDF file");
    }

    @Override
    public void write() {
        System.out.println("Writing annotations to PDF file");
    }

    @Override
    public void save() {
        System.out.println("Saving the modified PDF file");
    }
}
