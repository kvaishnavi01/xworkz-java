package com.xworkz.interfaces;

public interface PavBhaji {
    void cookBhaji();
    void toastPav();
    void garnish();
    default String getDescription() {
        return "This is a default method";
    }
}
