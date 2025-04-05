package com.xworkz.inheritance;

public class AesEncryption extends Encryption {
    public AesEncryption() {
        System.out.println("no args const of AesEncryption");
    }

    @Override
    public void encrypt() {
        System.out.println("Encrypting data using AES algorithm");
    }

    @Override
    public void decrypt() {
        System.out.println("Decrypting data using AES algorithm");
    }

    @Override
    public void useKey() {
        System.out.println("Using 128/192/256-bit symmetric key");
    }

    @Override
    public void protectData() {
        System.out.println("AES encryption ensures data confidentiality");
    }

    @Override
    public void verifyIntegrity() {
        System.out.println("AES includes integrity checks with CBC or GCM modes");
    }
}
