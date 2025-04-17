package com.xworkz.interfaces;

public interface SecurityGuard {
    void patrolArea();
    void monitorCCTV();
    void checkID();
    default String getDescription() {
        return "This is a default method";
    }
}
