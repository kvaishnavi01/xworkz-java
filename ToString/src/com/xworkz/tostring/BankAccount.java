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

    @Override
    public int hashCode(){
        return 49;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof BankAccount) {
                System.out.println("will compare.....");
                BankAccount b1 = this;
                BankAccount b2 = (BankAccount) obj;
                if(b1.holderName.equals(b2.holderName) && b1.accountNumber == b2.accountNumber && b1.balance == b2.balance) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
