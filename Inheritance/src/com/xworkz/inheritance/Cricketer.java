package com.xworkz.inheritance;

public class Cricketer extends Player {
    public Cricketer() {
        System.out.println("no args const of Cricketer");
    }

    @Override
    public void train() {
        System.out.println("Cricketer is practicing in the nets");
    }

    @Override
    public void playMatch() {
        System.out.println("Cricketer is playing an international match");
    }

    @Override
    public void travel() {
        System.out.println("Cricketer is flying to the tournament location");
    }

    @Override
    public void rest() {
        System.out.println("Cricketer is recovering post match");
    }

    @Override
    public void followDiet() {
        System.out.println("Cricketer is maintaining a high-protein diet");
    }
}
