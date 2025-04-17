package com.xworkz.interfaces;

public interface Pencil {
    void write();
    void erase();
    void sharpen();
    default String getDescription() {
        return "This is a default method";
    }
}
