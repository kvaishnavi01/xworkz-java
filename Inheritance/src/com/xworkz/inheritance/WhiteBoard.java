package com.xworkz.inheritance;

public class WhiteBoard extends Board {
    public WhiteBoard() {
        System.out.println("no args const of WhiteBoard");
    }

    @Override
    public void write() {
        System.out.println("WhiteBoard is written with dry erase marker");
    }

    @Override
    public void clean() {
        System.out.println("WhiteBoard is cleaned with duster");
    }

    @Override
    public void hang() {
        System.out.println("WhiteBoard is mounted in classroom");
    }

    @Override
    public void shine() {
        System.out.println("WhiteBoard reflects projector light");
    }

    @Override
    public void display() {
        System.out.println("WhiteBoard displays math problems");
    }
}
