package com.xworkz.inheritance;

public class DreamExplorer {
    public void explore(Dream dream) {
        dream.start();
        dream.shiftScene();
        dream.feelReal();
        dream.fade();
        dream.end();

        if (dream instanceof LucidDream) {
            LucidDream lucid = (LucidDream) dream;
            lucid.controlDream();
        }
    }
}
