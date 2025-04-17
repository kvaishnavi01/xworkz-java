package com.xworkz.interfaces;

public interface Artist {
    void createArtwork();
    void showcaseArt();
    void collaborateOnProjects();
    default String getDescription() {
        return "Creating and sharing artistic works.";
    }
}
