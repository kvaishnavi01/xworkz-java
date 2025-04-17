package com.xworkz.interfaces;

public interface Earphone {
    void playAudio();
    void adjustVolume();
    void disconnect();
    default String getDescription() {
        return "This is a default method";
    }
}
