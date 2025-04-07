package com.xworkz.inheritance;

public class InvestigativeJournalist extends Journalist {
    public InvestigativeJournalist() {
        System.out.println("no args const of InvestigativeJournalist");
    }

    @Override
    public void writeArticle() {
        System.out.println("Investigative Journalist writes in-depth investigative reports");
    }

    @Override
    public void attendPressMeet() {
        System.out.println("Investigative Journalist rarely attends press meets");
    }

    @Override
    public void interview() {
        System.out.println("Investigative Journalist conducts secretive interviews");
    }

    @Override
    public void publishNews() {
        System.out.println("Investigative Journalist publishes sensitive findings");
    }

    @Override
    public void travel() {
        System.out.println("Investigative Journalist travels undercover");
    }

    public void revealScandal() {
        System.out.println("Investigative Journalist reveals a major scandal");
    }
}
