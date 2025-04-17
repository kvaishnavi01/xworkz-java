package com.xworkz.interfaces;

public interface Spoon {
    void scoop();
    void stir();
    void clean();
    default String getDescription() {
        return "This is a default method";
    }
}
