package com.xworkz.interfaces;

public class ChefWriter implements Chef, ContentWriter {
    public void cook() {
        System.out.println("Cooks and blogs recipes.");
    }

    public void planMenu() {
        System.out.println("Plans menu and writes about it.");
    }

    public void manageKitchen() {
        System.out.println("Manages kitchen while proofreading.");
    }

    public void writeArticle() {
        System.out.println("Writes culinary articles.");
    }

    public void proofreadContent() {
        System.out.println("Proofreads cooking instructions.");
    }

    public void researchTopic() {
        System.out.println("Researches food trends.");
    }
}
