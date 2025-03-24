package com.xworkz.Spceifier;

public class Hospital {
    public int numberOfDoctors = 20;
    private String emergencyCode = "E123";
    String hospitalName = "City Care";

    public void openHospital() {
        System.out.println("Hospital is now open for patients.");
    }

    private void closeHospital() {
        System.out.println("Hospital is now closed.");
    }

    void treatPatients() {
        System.out.println("Doctors are treating patients.");
    }
}
