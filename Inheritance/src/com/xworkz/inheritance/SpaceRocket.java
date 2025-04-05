package com.xworkz.inheritance;

public class SpaceRocket extends Rocket {
    public SpaceRocket() {
        System.out.println("no args const of SpaceRocket");
    }

    @Override
    public void launch() {
        System.out.println("SpaceRocket launched into orbit");
    }

    @Override
    public void land() {
        System.out.println("SpaceRocket landed on space station");
    }

    @Override
    public void ignite() {
        System.out.println("SpaceRocket boosters ignited");
    }

    @Override
    public void fuelCheck() {
        System.out.println("SpaceRocket fuel level optimal");
    }

    @Override
    public void abortMission() {
        System.out.println("SpaceRocket emergency mission aborted");
    }
}
