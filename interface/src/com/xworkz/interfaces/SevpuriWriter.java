package com.xworkz.interfaces;

public class SevpuriWriter implements Sevpuri, ContentWriter {
    public void prepareSevpuri() {
        System.out.println("Prepares tangy sevpuri.");
    }
    public void serveSevpuri() {
        System.out.println("Serves sevpuri on leaf plate.");
    }
    public void garnishSevpuri() {
        System.out.println("Garnishes with sev and coriander.");
    }

    public void writeArticle() {
        System.out.println("Writes spicy food blogs.");
    }
    public void proofreadContent() {
        System.out.println("Proofreads food articles.");
    }
    public void researchTopic() {
        System.out.println("Researches street food trends.");
    }

    @Override
    public void addToppings() {

    }

    @Override
    public void crushPuri() {

    }

    @Override
    public void serveWithChutney() {

    }
}
