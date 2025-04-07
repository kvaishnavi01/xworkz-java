package com.xworkz.inheritance;

public class ResearchLab {
    public void conductSession(Scientist scientist) {
        scientist.research();
        scientist.publish();
        scientist.experiment();
        scientist.collaborate();
        scientist.attendConference();

        if (scientist instanceof QuantumPhysicist) {
            QuantumPhysicist qp = (QuantumPhysicist) scientist;
            qp.observeEntanglement();
        }
    }
}
