package com.company.clase;

import com.company.exceptii.IllegalFundsException;
import com.company.exceptii.IllegalTransferException;
import com.company.interfete.Depositable;
import com.company.interfete.Transferable;
import com.company.interfete.Withdrawable;

public class CurrentAccount extends BankAccount implements Depositable, Withdrawable, Transferable {
    public static double MAXCREDIT = 5000;

    public CurrentAccount() {
        super();
    }

    public CurrentAccount(double balance, String iban) {
        super(balance, iban);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) throws IllegalFundsException {
        if (amount > this.balance)
            throw new IllegalFundsException("Fonduri insuficiente -> current account!!!");
        else this.balance -= amount;
    }

    @Override
    public void transfer(double amount, Depositable destination)
            throws IllegalFundsException, IllegalTransferException {
        if (amount > ((BankAccount) destination).getBalance())
            throw new IllegalFundsException("Fonduri insuficiente -> current account!!!");
        if (((BankAccount) destination).iban.equals(this.iban))
            throw new IllegalTransferException("Iban Identic!!!");
        else {
            this.withdraw(amount);
            destination.deposit(amount);
        }
    }
}
