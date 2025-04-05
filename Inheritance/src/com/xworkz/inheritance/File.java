package com.xworkz.inheritance;

public class File {
    public File() {
        System.out.println("no args const of File");
    }

    public void open() {
        System.out.println("Opening the file");
    }

    public void close() {
        System.out.println("Closing the file");
    }

    public void read() {
        System.out.println("Reading data from the file");
    }

    public void write() {
        System.out.println("Writing data to the file");
    }

    public void save() {
        System.out.println("Saving the file");
    }
}
