package com.xworkz.interfaces;

public class Sculptor implements Artist {
    public void createArtwork() {
        System.out.println("Creates sculptures.");
    }
    public void showcaseArt() {
        System.out.println("Showcases sculptures in exhibitions.");
    }
    public void collaborateOnProjects() {
        System.out.println("Collaborates with other artists on sculpture projects.");
    }
    public String getDescription() {
        return "Creating and sharing artistic works.";
    }
}
