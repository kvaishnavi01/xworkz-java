package com.xworkz.inheritance;

public class SubmarineMission {
    public void start(Submarine submarine) {
        submarine.dive();
        submarine.surface();
        submarine.navigate();
        submarine.communicate();
        submarine.maintainPressure();

        if (submarine instanceof ResearchSubmarine) {
            ResearchSubmarine research = (ResearchSubmarine) submarine;
            research.collectSamples();
        }
    }
}
