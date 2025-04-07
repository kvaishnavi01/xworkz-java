package com.xworkz.inheritance;

public class Encryption {
    public Encryption() {
        System.out.println("no args const of Encryption");
    }

    public void encrypt() {
        System.out.println("Encryption is being performed");
    }

    public void decrypt() {
        System.out.println("Decryption is being performed");
    }

    public void generateKey() {
        System.out.println("Encryption key is generated");
    }

    public void validateData() {
        System.out.println("Validating the data before encryption");
    }

    public void terminateSession() {
        System.out.println("Encryption session is terminated");
    }
}
