package com.xworkz.interfaces;

public interface Keyboard {
    void type();
    void backlight();
    void connect();
    default String getDescription() {
        return "This is a default method";
    }
}
