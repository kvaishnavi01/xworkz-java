package com.xworkz.interfaces;

public class SpiralNotebook implements Notebook {
    public void open() {
        System.out.println("Opening the spiral notebook.");
    }
    public void writePage() {
        System.out.println("Writing on the page.");
    }
    public void close() {
        System.out.println("Closing the notebook.");
    }
}
