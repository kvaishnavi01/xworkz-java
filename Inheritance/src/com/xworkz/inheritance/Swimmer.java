package com.xworkz.inheritance;

public class Swimmer {
    public void swim(Athlete athlete){
        athlete.compete();
        athlete.rest();
        athlete.hydrate();
        athlete.train();
        athlete.warmUp();

        if( athlete instanceof  Runner){
            Runner runner=(Runner) athlete;
            runner.run();
        }
    }
}
