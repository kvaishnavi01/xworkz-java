package com.xworkz.inheritance;

public class CrimeSceneInvestigation extends Investigation {
    public CrimeSceneInvestigation() {
        System.out.println("no args const of CrimeSceneInvestigation");
    }

    @Override
    public void gatherEvidence() {
        System.out.println("CSI collects fingerprints and DNA samples");
    }

    @Override
    public void interrogateWitnesses() {
        System.out.println("CSI interviews eyewitnesses and neighbors");
    }

    @Override
    public void analyzeData() {
        System.out.println("CSI analyzes forensic samples in the lab");
    }

    @Override
    public void identifySuspects() {
        System.out.println("CSI matches clues with criminal records");
    }

    @Override
    public void reportFindings() {
        System.out.println("CSI prepares detailed case reports for prosecution");
    }
}
