package com.xworkz.interfaces;

public interface NewsReporter {
    void gatherNews();
    void reportLive();
    void interviewPeople();
    default String getDescription() {
        return "This is a default method";
    }
}
