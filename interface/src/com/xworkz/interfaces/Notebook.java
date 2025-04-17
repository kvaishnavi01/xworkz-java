package com.xworkz.interfaces;

public interface Notebook {
    void open();
    void writePage();
    void close();
    default String getDescription() {
        return "This is a default method";
    }
}
