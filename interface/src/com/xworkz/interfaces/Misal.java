package com.xworkz.interfaces;

public interface Misal {
    void makeRassa();
    void fryUsal();
    void topWithFarsan();
    default String getDescription() {
        return "This is a default method";
    }
}
