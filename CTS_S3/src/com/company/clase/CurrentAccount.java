package com.company.clase;

import com.company.exceptii.IllegalFundsException;
import com.company.exceptii.IllegalTransferException;

public class CurrentAccount extends BankAccount {
    public static double MAXCREDIT = 5000;

    public CurrentAccount() {
        super();
    }

    public CurrentAccount(double balance, String iban) {
        super(balance, iban);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) throws IllegalFundsException {
        if (amount > this.balance)
            throw new IllegalFundsException("Fonduri insuficiente!");
        else this.balance -= amount;
    }

    @Override
    public void transfer(double amount, Account destination) throws IllegalFundsException, IllegalTransferException {
        if (amount > destination.getBalance())
            throw new IllegalFundsException("Fonduri insuficiente!!!");
        if (((BankAccount) destination).iban.equals(this.iban))
            throw new IllegalTransferException("Iban Identic!!!");
        else {
            this.withdraw(amount);
            destination.deposit(amount);
        }
    }
}
