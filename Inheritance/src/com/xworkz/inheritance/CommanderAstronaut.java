package com.xworkz.inheritance;

public class CommanderAstronaut extends Astronaut {
    public CommanderAstronaut() {
        System.out.println("no args const of CommanderAstronaut");
    }

    @Override
    public void launch() {
        System.out.println("Commander initiates launch sequence");
    }

    @Override
    public void performExperiment() {
        System.out.println("Commander oversees all onboard experiments");
    }

    @Override
    public void spaceWalk() {
        System.out.println("Commander leads the spacewalk operations");
    }

    @Override
    public void communicateWithBase() {
        System.out.println("Commander handles high-priority transmissions");
    }

    @Override
    public void maintainLifeSupport() {
        System.out.println("Commander performs critical life support diagnostics");
    }
}
