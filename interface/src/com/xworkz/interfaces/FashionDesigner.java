package com.xworkz.interfaces;

public interface FashionDesigner {
    void sketchDesigns();
    void chooseFabric();
    void attendFashionShow();
    default String getDescription() {
        return "This is a default method";
    }
}
