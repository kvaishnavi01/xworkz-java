package com.xworkz.interfaces;

public class FieldReporter implements NewsReporter {
    public void gatherNews() {
        System.out.println("Gathers news on the field.");
    }
    public void reportLive() {
        System.out.println("Reports news live from the location.");
    }
    public void interviewPeople() {
        System.out.println("Interviews people for news stories.");
    }
}
