package com.xworkz.interfaces;

public class WiredEarphone implements Earphone {
    public void playAudio() {
        System.out.println("Playing audio through wired earphone.");
    }

    public void adjustVolume() {
        System.out.println("Adjusting volume via in-line controls.");
    }

    public void disconnect() {
        System.out.println("Wired earphone disconnected.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
