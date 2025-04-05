package com.xworkz.inheritance;

public class StandUpComedian extends Comedian {
    public StandUpComedian() {
        System.out.println("no args const of StandUpComedian");
    }

    @Override
    public void writeJokes() {
        System.out.println("Stand-up comedian writes jokes about daily life");
    }

    @Override
    public void rehearse() {
        System.out.println("Stand-up comedian rehearses in front of a mirror");
    }

    @Override
    public void perform() {
        System.out.println("Stand-up comedian performs at comedy clubs");
    }

    @Override
    public void interactWithAudience() {
        System.out.println("Stand-up comedian roasts and chats with audience");
    }

    @Override
    public void uploadVideo() {
        System.out.println("Stand-up comedian uploads video to YouTube");
    }
}
