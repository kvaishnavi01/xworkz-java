package com.xworkz.interfaces;

public class PilotTeacher implements Pilot, Teacher {
    public void flyAircraft() {
        System.out.println("Flies commercial aircraft.");
    }

    public void checkWeather() {
        System.out.println("Checks the weather for flight safety.");
    }

    public void passengerAnnouncement() {
        System.out.println("Makes announcements for passengers.");
    }

    public void teachSubject() {
        System.out.println("Teaches subjects to students.");
    }

    public void assignHomework() {
        System.out.println("Assigns homework.");
    }

    public void evaluateExam() {
        System.out.println("Evaluates student exams.");
    }
}
