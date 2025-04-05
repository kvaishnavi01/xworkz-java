package com.xworkz.inheritance;

public class Puzzle {
    public Puzzle() {
        System.out.println("no args const of Puzzle");
    }

    public void solve() {
        System.out.println("Puzzle is being solved");
    }

    public void mix() {
        System.out.println("Puzzle is being mixed up");
    }

    public void display() {
        System.out.println("Puzzle is displayed on table");
    }

    public void reset() {
        System.out.println("Puzzle is reset to default");
    }

    public void checkCompletion() {
        System.out.println("Checking if puzzle is completed");
    }
}
