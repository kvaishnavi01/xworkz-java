package com.xworkz.interfaces;

public interface Librarian {
    void catalogBooks();
    void assistPatrons();
    void organizeEvents();
    default String getDescription() {
        return "This is a default method";
    }
}
