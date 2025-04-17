package com.xworkz.interfaces;

public interface Gardener {
    void plantTrees();
    void maintainLawns();
    void landscapeGardens();
    default String getDescription() {
        return "This is a default method";
    }
}
