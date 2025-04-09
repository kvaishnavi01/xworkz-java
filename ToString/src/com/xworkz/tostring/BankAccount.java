package com.xworkz.tostring;

public class BankAccount {
    private String holderName;
    private long accountNumber;
    private double balance;

    public BankAccount(String holderName, long accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "holder name is " + this.holderName + " account number is " + this.accountNumber + " balance is " + this.balance;
    }
}
