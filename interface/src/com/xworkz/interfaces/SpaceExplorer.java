package com.xworkz.interfaces;

public interface SpaceExplorer {
    void planMission();
    void analyzeData();
    void performExtravehicularActivity();
    default String getDescription() {
        return "This is a default method";
    }
}
