package com.xworkz.Spceifier;

public class Bank {
        public String bankName = "National Bank";
        private String bankSecretCode = "NB123";
        int totalAccounts = 100;


        public void showBankName() {
            System.out.println("Bank Name: " + bankName);
        }

        private boolean verifyBankCode(String code) {
            return code.equals(bankSecretCode);
        }


        void Accounts() {
           System.out.println("we have "+totalAccounts+ " Accounts");
        }
}

