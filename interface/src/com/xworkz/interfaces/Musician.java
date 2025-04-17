package com.xworkz.interfaces;

public interface Musician {
    void playInstrument();
    void composeSong();
    void attendRehearsal();
    default String getDescription() {
        return "This is a default method";
    }
}
