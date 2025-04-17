package com.xworkz.interfaces;

public class HBPencil implements Pencil {
    public void write() {
        System.out.println("Writing with HB pencil.");
    }
    public void erase() {
        System.out.println("Erasing pencil marks.");
    }
    public void sharpen() {
        System.out.println("Sharpening the pencil.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
