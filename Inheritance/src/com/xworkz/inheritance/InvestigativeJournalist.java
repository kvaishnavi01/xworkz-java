package com.xworkz.inheritance;

public class InvestigativeJournalist extends Journalist {
    public InvestigativeJournalist() {
        System.out.println("no args const of InvestigativeJournalist");
    }

    @Override
    public void research() {
        System.out.println("Investigative journalist is researching hidden facts");
    }

    @Override
    public void writeArticle() {
        System.out.println("Investigative journalist is writing a deep expose");
    }

    @Override
    public void interviewPeople() {
        System.out.println("Investigative journalist is interviewing key witnesses");
    }

    @Override
    public void attendConference() {
        System.out.println("Investigative journalist is attending secret briefings");
    }

    @Override
    public void publish() {
        System.out.println("Investigative journalist publishes on global platforms");
    }
}
