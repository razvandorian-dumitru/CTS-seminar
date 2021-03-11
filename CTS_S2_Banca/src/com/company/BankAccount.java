package com.company;

public abstract class BankAccount extends Account {
    protected double balance;
    protected String iban;


    public BankAccount() {
        this.balance = 0;
        this.iban = "NULL";
    }

    public BankAccount(double balance, String iban) {
        this.balance = balance;
        this.iban = iban;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
