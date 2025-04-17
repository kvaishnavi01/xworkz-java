package com.xworkz.interfaces;

public interface BankManager {
    void approveLoan();
    void manageAccounts();
    void meetCustomers();
    default String getDescription() {
        return "This is a default method";
    }
}
