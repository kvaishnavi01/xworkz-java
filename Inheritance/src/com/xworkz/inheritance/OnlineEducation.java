package com.xworkz.inheritance;

public class OnlineEducation extends Education {
    public OnlineEducation() {
        System.out.println("no args const of OnlineEducation");
    }

    @Override
    public void deliverContent() {
        System.out.println("Online education delivers content through digital platforms");
    }

    @Override
    public void evaluateStudents() {
        System.out.println("Online education evaluates using quizzes and interactive tools");
    }

    @Override
    public void promoteSkills() {
        System.out.println("Online education promotes digital and self-learning skills");
    }

    @Override
    public void provideCertification() {
        System.out.println("Online education grants e-certificates via platforms");
    }

    @Override
    public void encourageCuriosity() {
        System.out.println("Online education encourages learners through diverse multimedia");
    }
}
