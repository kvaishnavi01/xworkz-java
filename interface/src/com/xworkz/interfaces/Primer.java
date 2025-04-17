package com.xworkz.interfaces;

public interface Primer {
    void prepSkin();
    void minimizePores();
    void smoothTexture();
    default String getDescription() {
        return "This is a default method";
    }
}
