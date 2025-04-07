package com.xworkz.inheritance;

public class NewsAgency {
    public void report(Journalist journalist) {
        journalist.writeArticle();
        journalist.attendPressMeet();
        journalist.interview();
        journalist.publishNews();
        journalist.travel();

        if (journalist instanceof InvestigativeJournalist) {
            InvestigativeJournalist inv = (InvestigativeJournalist) journalist;
            inv.revealScandal();
        }
    }
}
