package com.company.clase;

import com.company.interfete.Depositable;
import com.company.interfete.Transferable;
import com.company.interfete.Withdrawable;

public abstract class BankAccount extends Account  {

    public double balance;
    public String iban;

    public BankAccount() {
        this.balance = 100;
        this.iban = "NULL";
    }

    public BankAccount(double balance, String iban) {
        this.balance = balance;
        this.iban = iban;
    }

    public double getBalance() {
        return this.balance;
    }
}
