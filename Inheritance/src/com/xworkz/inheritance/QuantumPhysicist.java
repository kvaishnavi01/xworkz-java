package com.xworkz.inheritance;

public class QuantumPhysicist extends Scientist {
    public QuantumPhysicist() {
        System.out.println("no args const of QuantumPhysicist");
    }

    @Override
    public void conductResearch() {
        System.out.println("Quantum physicist is researching entangled particles");
    }

    @Override
    public void writePapers() {
        System.out.println("Quantum physicist is publishing on quantum decoherence");
    }

    @Override
    public void attendSeminars() {
        System.out.println("Quantum physicist is attending quantum computing conferences");
    }

    @Override
    public void experiment() {
        System.out.println("Quantum physicist is running lab experiments on superposition");
    }

    @Override
    public void collaborate() {
        System.out.println("Quantum physicist is working with CERN and NASA");
    }
}
