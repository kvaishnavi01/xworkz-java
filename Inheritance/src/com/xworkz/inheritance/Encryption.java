package com.xworkz.inheritance;

public class Encryption {
    public Encryption() {
        System.out.println("no args const of Encryption");
    }

    public void encrypt() {
        System.out.println("Encrypting data using base algorithm");
    }

    public void decrypt() {
        System.out.println("Decrypting data using base algorithm");
    }

    public void useKey() {
        System.out.println("Using a key for encryption/decryption");
    }

    public void protectData() {
        System.out.println("Encryption protects sensitive data");
    }

    public void verifyIntegrity() {
        System.out.println("Verifying data integrity post decryption");
    }
}
