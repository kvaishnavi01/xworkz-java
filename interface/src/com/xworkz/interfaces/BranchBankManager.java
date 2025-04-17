package com.xworkz.interfaces;

public class BranchBankManager implements BankManager {
    public void approveLoan() {
        System.out.println("Approves loan applications.");
    }
    public void manageAccounts() {
        System.out.println("Manages bank accounts.");
    }
    public void meetCustomers() {
        System.out.println("Meets customers to resolve banking issues.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
