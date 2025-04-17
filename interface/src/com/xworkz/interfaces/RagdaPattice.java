package com.xworkz.interfaces;

public interface RagdaPattice {
    void prepareRagda();
    void shallowFryPattice();
    void serveWithGarnish();
    default String getDescription() {
        return "This is a default method";
    }
}
