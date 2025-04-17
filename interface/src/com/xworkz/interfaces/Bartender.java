package com.xworkz.interfaces;

public interface Bartender {
    void mixDrinks();
    void takeOrders();
    void maintainBar();
    default String getDescription() {
        return "This is a default method";
    }
}
