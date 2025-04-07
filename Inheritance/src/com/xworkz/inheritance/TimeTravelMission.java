package com.xworkz.inheritance;

public class TimeTravelMission {
    public void execute(TimeTraveler traveler) {
        traveler.travelToPast();
        traveler.travelToFuture();
        traveler.observeHistory();
        traveler.avoidParadox();
        traveler.returnToPresent();

        if (traveler instanceof QuantumTimeTraveler) {
            QuantumTimeTraveler qtt = (QuantumTimeTraveler) traveler;
            qtt.stabilizeTimeline();
        }
    }
}
