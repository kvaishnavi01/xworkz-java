package com.xworkz.inheritance;

public class FestivalEvent {
    public void handleFestival(Festival festival) {
        festival.celebrate();
        festival.gatherPeople();
        festival.performRituals();
        festival.decorate();
        festival.serveFood();

        if (festival instanceof LanternFestival) {
            LanternFestival lantern = (LanternFestival) festival;
            lantern.releaseLanterns();
        }
    }
}
