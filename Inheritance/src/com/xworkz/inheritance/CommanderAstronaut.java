package com.xworkz.inheritance;

public class CommanderAstronaut extends Astronaut {
    public CommanderAstronaut() {
        System.out.println("no args const of CommanderAstronaut");
    }

    @Override
    public void train() {
        System.out.println("CommanderAstronaut is leading training sessions");
    }

    @Override
    public void launch() {
        System.out.println("CommanderAstronaut initiates the launch");
    }

    @Override
    public void conductExperiment() {
        System.out.println("CommanderAstronaut supervises scientific experiments");
    }

    @Override
    public void spaceWalk() {
        System.out.println("CommanderAstronaut manages spacewalk activities");
    }

    @Override
    public void communicate() {
        System.out.println("CommanderAstronaut handles critical communications");
    }

    public void commandCrew() {
        System.out.println("CommanderAstronaut is commanding the space crew");
    }
}
