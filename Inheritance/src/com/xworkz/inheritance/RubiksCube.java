package com.xworkz.inheritance;

public class RubiksCube extends Puzzle {
    public RubiksCube() {
        System.out.println("no args const of RubiksCube");
    }

    @Override
    public void solve() {
        System.out.println("Rubik's Cube is being solved using color patterns");
    }

    @Override
    public void mix() {
        System.out.println("Rubik's Cube is shuffled randomly");
    }

    @Override
    public void display() {
        System.out.println("Rubik's Cube is placed on the desk");
    }

    @Override
    public void reset() {
        System.out.println("Rubik's Cube is manually rotated to reset");
    }

    @Override
    public void checkCompletion() {
        System.out.println("Checking if all cube faces have the same color");
    }
}
