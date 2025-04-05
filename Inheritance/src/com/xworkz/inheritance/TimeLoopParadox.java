package com.xworkz.inheritance;

public class TimeLoopParadox extends Paradox {
    public TimeLoopParadox() {
        System.out.println("no args const of TimeLoopParadox");
    }

    @Override
    public void contradictItself() {
        System.out.println("TimeLoopParadox violates cause and effect");
    }

    @Override
    public void resistResolution() {
        System.out.println("TimeLoopParadox regenerates upon every attempt to solve");
    }

    @Override
    public void triggerConfusion() {
        System.out.println("TimeLoopParadox distorts memory and chronology");
    }

    @Override
    public void loopLogic() {
        System.out.println("TimeLoopParadox traps logic in infinite recursion");
    }

    @Override
    public void challengeReality() {
        System.out.println("TimeLoopParadox bends time into subjective perception");
    }
}
