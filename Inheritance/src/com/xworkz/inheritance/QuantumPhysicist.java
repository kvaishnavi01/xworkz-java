package com.xworkz.inheritance;

public class QuantumPhysicist extends Scientist {
    public QuantumPhysicist() {
        System.out.println("no args const of QuantumPhysicist");
    }

    @Override
    public void research() {
        System.out.println("Quantum Physicist is researching quantum mechanics");
    }

    @Override
    public void publish() {
        System.out.println("Quantum Physicist is publishing in physics journals");
    }

    @Override
    public void experiment() {
        System.out.println("Quantum Physicist is conducting particle experiments");
    }

    @Override
    public void collaborate() {
        System.out.println("Quantum Physicist collaborates with global physicists");
    }

    @Override
    public void attendConference() {
        System.out.println("Quantum Physicist is presenting at a quantum physics conference");
    }

    public void observeEntanglement() {
        System.out.println("Quantum Physicist is observing quantum entanglement");
    }
}
