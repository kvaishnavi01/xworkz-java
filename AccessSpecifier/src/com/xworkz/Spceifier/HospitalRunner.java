package com.xworkz.Spceifier;

import com.xworkz.Spceifier.checker.PublicChecker;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital h1 = new Hospital();
        PublicChecker p1 = new PublicChecker();

        p1.accessHospital();
        System.out.println("Our hospital has " + h1.numberOfDoctors + " doctors.");
        System.out.println("The hospital name is " + h1.hospitalName);

        h1.openHospital();
        h1.treatPatients();
    }
}
