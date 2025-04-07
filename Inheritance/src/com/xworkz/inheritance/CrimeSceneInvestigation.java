package com.xworkz.inheritance;

public class CrimeSceneInvestigation extends Investigation {
    public CrimeSceneInvestigation() {
        System.out.println("no args const of CrimeSceneInvestigation");
    }

    @Override
    public void collectEvidence() {
        System.out.println("CrimeSceneInvestigation collects forensic evidence");
    }

    @Override
    public void interviewWitnesses() {
        System.out.println("CrimeSceneInvestigation interviews people at the crime scene");
    }

    @Override
    public void analyzeData() {
        System.out.println("CrimeSceneInvestigation analyzes crime patterns and DNA");
    }

    @Override
    public void followLeads() {
        System.out.println("CrimeSceneInvestigation follows up on criminal leads");
    }

    @Override
    public void writeReport() {
        System.out.println("CrimeSceneInvestigation prepares detailed crime reports");
    }

    public void securePerimeter() {
        System.out.println("CrimeSceneInvestigation secures the crime scene perimeter");
    }
}
