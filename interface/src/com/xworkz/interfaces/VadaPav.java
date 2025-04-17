package com.xworkz.interfaces;

public interface VadaPav {
    void fryVada();
    void applyChutney();
    void wrapInPaper();
    default String getDescription() {
        return "This is a default method";
    }
}
