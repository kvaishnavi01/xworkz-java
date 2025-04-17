package com.xworkz.interfaces;

public interface Chef {
    void cook();
    void planMenu();
    void manageKitchen();
    default String getDescription() {
        return "This is a default method";
    }
}
