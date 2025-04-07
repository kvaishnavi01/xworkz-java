package com.xworkz.inheritance;

public class Daisy {
    public void color(Flower flower){
        flower.absorbSunlight();
        flower.attractBees();
        flower.bloom();
        flower.wilt();
        flower.smell();

        if(flower instanceof Rose){
            Rose rose=(Rose) flower;
            rose.smells();
        }
    }
}
