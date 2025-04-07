package com.xworkz.inheritance;

public class AesEncryption extends Encryption {
    public AesEncryption() {
        System.out.println("no args const of AesEncryption");
    }

    @Override
    public void encrypt() {
        System.out.println("Data is encrypted using AES algorithm");
    }

    @Override
    public void decrypt() {
        System.out.println("Data is decrypted using AES algorithm");
    }

    @Override
    public void generateKey() {
        System.out.println("AES key is generated securely");
    }

    @Override
    public void validateData() {
        System.out.println("Data validated for AES encryption");
    }

    @Override
    public void terminateSession() {
        System.out.println("AES encryption session ended");
    }

    public void setEncryptionMode() {
        System.out.println("AES encryption mode set to CBC");
    }
}
