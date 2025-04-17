package com.xworkz.interfaces;

public interface Bag {
    void carry();
    void zip();
    void unpack();
    default String getDescription() {
        return "This is a default method";
    }
}
