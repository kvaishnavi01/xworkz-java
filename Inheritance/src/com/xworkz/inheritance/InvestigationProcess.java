package com.xworkz.inheritance;

public class InvestigationProcess {
    public void handle(Investigation investigation) {
        investigation.collectEvidence();
        investigation.interviewWitnesses();
        investigation.analyzeData();
        investigation.followLeads();
        investigation.writeReport();

        if (investigation instanceof CrimeSceneInvestigation) {
            CrimeSceneInvestigation csi = (CrimeSceneInvestigation) investigation;
            csi.securePerimeter();
        }
    }
}
