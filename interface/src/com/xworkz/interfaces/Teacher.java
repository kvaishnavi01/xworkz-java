package com.xworkz.interfaces;

public interface Teacher {
    void teachSubject();
    void assignHomework();
    void evaluateExam();
    default String getDescription() {
        return "This is a default method";
    }
}
