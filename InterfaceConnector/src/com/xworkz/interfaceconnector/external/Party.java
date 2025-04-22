package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Speaker;

public class Party {
    private Speaker speaker;

    public Party(Speaker speaker) {
        System.out.println("Party with Speaker created");
        this.speaker = speaker;
    }

    public void playMusic() {
        System.out.println("Party is using speaker");
        if (speaker != null) {
            this.speaker.sound();
        }
    }
}