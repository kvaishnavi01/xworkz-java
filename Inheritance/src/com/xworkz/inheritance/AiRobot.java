package com.xworkz.inheritance;

public class AiRobot {
    public void code(Robot robot){
        robot.move();
        robot.processTask();
        robot.recharge();
        robot.start();
        robot.stop();

        if( robot instanceof  CleaningRobot){
            CleaningRobot cleaningRobot=(CleaningRobot) robot;
            cleaningRobot.cleans();
        }
    }
}
