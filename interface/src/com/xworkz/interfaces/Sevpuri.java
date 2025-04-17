package com.xworkz.interfaces;

public interface Sevpuri {
    void addToppings();
    void crushPuri();
    void serveWithChutney();
    default String getDescription() {
        return "This is a default method";
    }
}
