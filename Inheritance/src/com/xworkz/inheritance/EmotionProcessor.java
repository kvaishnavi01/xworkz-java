package com.xworkz.inheritance;

public class EmotionProcessor {
    public void analyze(Emotion emotion) {
        emotion.expressJoy();
        emotion.expressSadness();
        emotion.expressAnger();
        emotion.expressFear();
        emotion.expressSurprise();

        if (emotion instanceof SyntheticEmotion) {
            SyntheticEmotion se = (SyntheticEmotion) emotion;
            se.calibrateEmotionModel();
        }
    }
}
