package com.company;

import exceptii.IllegalTransferException;
import exceptii.InsufficientFundsException;
import interfete.Profitable;

public class SavingsAccount extends BankAccount implements Profitable {
    @Override
    public void addInterest(double interest) {
        this.balance *= (1 + interest / 100);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;

    }

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(double balance, String iban) {
        super(balance, iban);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount <= this.balance)
            this.balance -= amount;

    }

    @Override
    public void transfer(double amount, Account destination)
            throws IllegalTransferException, InsufficientFundsException {
        if (((BankAccount) destination).iban.equals(this.iban))
            throw new IllegalTransferException("Conturile coincid!");
        else {
            this.withdraw(amount);
            destination.deposit(amount);
        }


    }
}
