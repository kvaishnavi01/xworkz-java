package com.xworkz.inheritance;

public class StandUpComedian extends Comedian {
    public StandUpComedian() {
        System.out.println("no args const of StandupComedian");
    }

    @Override
    public void tellJoke() {
        System.out.println("StandupComedian tells relatable jokes");
    }

    @Override
    public void mimic() {
        System.out.println("StandupComedian mimics politicians");
    }

    @Override
    public void improvise() {
        System.out.println("StandupComedian improvises with audience input");
    }

    @Override
    public void writeScript() {
        System.out.println("StandupComedian writes stand-up material");
    }

    @Override
    public void entertain() {
        System.out.println("StandupComedian keeps the crowd laughing");
    }

    public void performSet() {
        System.out.println("StandupComedian performs a 30-minute set");
    }
}
