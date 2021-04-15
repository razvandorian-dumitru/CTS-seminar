package com.company;

public abstract class BankAccount extends Account {
    private double balance;
    private String IBAN;

    public BankAccount() {
        this.balance = 100;
        this.IBAN = "";
    }

    public BankAccount(double balance, String IBAN) {
        this.balance = balance;
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }
}