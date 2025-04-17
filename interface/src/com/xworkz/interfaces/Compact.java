package com.xworkz.interfaces;

public interface Compact {
    void setMakeup();
    void reduceShine();
    void carryEasily();
    default String getDescription() {
        return "This is a default method";
    }
}
