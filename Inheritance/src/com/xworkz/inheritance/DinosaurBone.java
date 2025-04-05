package com.xworkz.inheritance;

public class DinosaurBone extends Fossil {
    public DinosaurBone() {
        System.out.println("no args const of DinosaurBone");
    }

    @Override
    public void display() {
        System.out.println("Dinosaur bone is showcased in the Jurassic gallery");
    }

    @Override
    public void analyze() {
        System.out.println("Dinosaur bone is analyzed for bone structure");
    }

    @Override
    public void date() {
        System.out.println("Dinosaur bone is carbon dated");
    }

    @Override
    public void preserve() {
        System.out.println("Dinosaur bone is stored in controlled humidity");
    }

    @Override
    public void catalog() {
        System.out.println("Dinosaur bone is tagged with a unique specimen ID");
    }
}
