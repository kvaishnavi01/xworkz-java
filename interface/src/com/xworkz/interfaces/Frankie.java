package com.xworkz.interfaces;

public interface Frankie {
    void prepareFilling();
    void rollRoti();
    void packWrap();
    default String getDescription() {
        return "This is a default method";
    }
}
