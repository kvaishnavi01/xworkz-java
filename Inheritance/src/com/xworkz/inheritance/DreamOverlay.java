package com.xworkz.inheritance;

public class DreamOverlay extends MemoryBank {
    public DreamOverlay() {
        System.out.println("no args const of DreamOverlay");
    }

    @Override
    public void storeData() {
        System.out.println("DreamOverlay weaves abstract impressions into memory stream");
    }

    @Override
    public void retrieveData() {
        System.out.println("DreamOverlay projects surreal reconstructions of memory");
    }

    @Override
    public void archiveOldData() {
        System.out.println("DreamOverlay blends archived memory into symbolic dreams");
    }

    @Override
    public void eraseData() {
        System.out.println("DreamOverlay masks data through dream distortion");
    }

    @Override
    public void protectData() {
        System.out.println("DreamOverlay hides core memories in subconscious layers");
    }
}
