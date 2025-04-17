package com.xworkz.interfaces;

public class SEOContentWriter implements ContentWriter {
    public void writeArticle() {
        System.out.println("Writes SEO-friendly articles.");
    }
    public void proofreadContent() {
        System.out.println("Proofreads articles for grammar and clarity.");
    }
    public void researchTopic() {
        System.out.println("Researches topics for article writing.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
