package com.xworkz.interfaces;

public interface ContentWriter {
    void writeArticle();
    void proofreadContent();
    void researchTopic();
    default String getDescription() {
        return "This is a default method";
    }
}
