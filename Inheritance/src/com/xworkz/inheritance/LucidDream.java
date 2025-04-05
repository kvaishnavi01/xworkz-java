package com.xworkz.inheritance;

public class LucidDream extends Dream {
    public LucidDream() {
        System.out.println("no args const of LucidDream");
    }

    @Override
    public void visualize() {
        System.out.println("LucidDream creates vivid and controllable imagery");
    }

    @Override
    public void shiftScenes() {
        System.out.println("LucidDream transitions between scenes intentionally");
    }

    @Override
    public void feelEmotion() {
        System.out.println("LucidDream allows awareness of dream emotions");
    }

    @Override
    public void loseControl() {
        System.out.println("LucidDream maintains awareness and control");
    }

    @Override
    public void fadeAway() {
        System.out.println("LucidDream is often remembered clearly after waking");
    }
}
