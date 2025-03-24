package com.xworkz.Spceifier;

import com.xworkz.Spceifier.checker.BankAcoount;

public class BankRunner {
    public static void main(String[] args) {
        BankAcoount ba1=new BankAcoount();
        ba1.userAccount();
        Bank b1=new Bank();
        b1.Accounts();
        System.out.println(b1.totalAccounts);
    }
}
