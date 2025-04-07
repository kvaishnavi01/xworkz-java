package com.xworkz.inheritance;

public class ComedyClub {
    public void hostShow(Comedian comedian) {
        comedian.tellJoke();
        comedian.mimic();
        comedian.improvise();
        comedian.writeScript();
        comedian.entertain();

        if (comedian instanceof StandUpComedian) {
            StandUpComedian standup = (StandUpComedian) comedian;
            standup.performSet();
        }
    }
}
