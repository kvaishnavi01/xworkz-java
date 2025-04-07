package com.xworkz.inheritance;

public class OnlineEducation extends Education {
    public OnlineEducation() {
        System.out.println("no args const of OnlineEducation");
    }

    @Override
    public void teach() {
        System.out.println("OnlineEducation provides virtual teaching");
    }

    @Override
    public void assess() {
        System.out.println("OnlineEducation conducts online assessments");
    }

    @Override
    public void enroll() {
        System.out.println("Students enroll via online portals");
    }

    @Override
    public void conductClass() {
        System.out.println("Online classes are conducted via video platforms");
    }

    @Override
    public void evaluate() {
        System.out.println("OnlineEducation uses digital tools for evaluation");
    }

    public void provideRecordedLectures() {
        System.out.println("OnlineEducation provides recorded lectures");
    }
}
