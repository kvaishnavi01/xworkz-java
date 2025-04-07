package com.xworkz.inheritance;

public class EncryptionTester {
    public void test(Encryption encryption) {
        encryption.encrypt();
        encryption.decrypt();
        encryption.generateKey();
        encryption.validateData();
        encryption.terminateSession();

        if (encryption instanceof AesEncryption) {
            AesEncryption aes = (AesEncryption) encryption;
            aes.setEncryptionMode();
        }
    }
}
