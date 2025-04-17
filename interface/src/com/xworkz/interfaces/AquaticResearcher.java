package com.xworkz.interfaces;

public interface AquaticResearcher {
    void studyMarineLife();
    void monitorEcosystemHealth();
    void leadResearchExpedition();
    default String getDescription() {
        return "Conducting research on marine ecosystems.";
    }
}
