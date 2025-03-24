package com.xworkz.Spceifier.checker;

import com.xworkz.Spceifier.Hospital;

public class PublicChecker {
    public void accessHospital() {
        Hospital h1 = new Hospital();
        System.out.println("Our hospital has " + h1.numberOfDoctors + " doctors. (Accessing this from another package)");

        h1.openHospital();
        System.out.println("***********************************************");
    }
}
