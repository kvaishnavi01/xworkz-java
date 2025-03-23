package com.xworkz.javareferenceandvariable;

public class PersonalAssistant {
    String assistantName;
    String expertise;
    int ageInYears;
    int workExperience;

    PersonalAssistant(String assistantName, String expertise, int ageInYears, int workExperience) {
        this.assistantName = assistantName;
        this.expertise = expertise;
        this.ageInYears = ageInYears;
        this.workExperience = workExperience;
    }

    void display() {
        System.out.println("Showing assistant details");
        System.out.println("Name: " + this.assistantName + " | Expertise: " + this.expertise +
                " | Age: " + this.ageInYears + " | Experience: " + this.workExperience);
    }
}