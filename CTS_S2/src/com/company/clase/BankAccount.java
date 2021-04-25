package com.company.clase;

public abstract class BankAccount extends Account {

    protected double balance;
    protected String iban;

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
