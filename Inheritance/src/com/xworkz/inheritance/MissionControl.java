package com.xworkz.inheritance;

public class MissionControl {
    public void executeMission(Astronaut astronaut) {
        astronaut.train();
        astronaut.launch();
        astronaut.conductExperiment();
        astronaut.spaceWalk();
        astronaut.communicate();

        if (astronaut instanceof CommanderAstronaut) {
            CommanderAstronaut commander = (CommanderAstronaut) astronaut;
            commander.commandCrew();
        }
    }
}
