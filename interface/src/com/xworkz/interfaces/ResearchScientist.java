package com.xworkz.interfaces;

public interface ResearchScientist {
    void conductResearch();
    void publishPapers();
    void presentFindings();
    default String getDescription() {
        return "This is a default method";
    }
}
