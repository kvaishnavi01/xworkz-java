package com.xworkz.interfaces;

public interface BrowPencil {
    void shapeBrows();
    void fillGaps();
    void createDefinition();
    default String getDescription() {
        return "This is a default method";
    }
}
