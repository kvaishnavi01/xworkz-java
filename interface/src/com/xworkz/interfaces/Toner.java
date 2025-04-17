package com.xworkz.interfaces;

public interface Toner {
    void tightenPores();
    void balancePH();
    void refreshSkin();
    default String getDescription() {
        return "This is a default method";
    }

}
