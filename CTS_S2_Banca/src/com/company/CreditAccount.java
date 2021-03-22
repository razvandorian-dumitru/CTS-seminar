package com.company;

import exceptii.IllegalTransferException;
import exceptii.InsufficientFundsException;
import interfete.Depositable;
import interfete.Transferable;
import interfete.Withdrawable;

import java.nio.file.Watchable;

public class CreditAccount extends BankAccount implements Depositable, Withdrawable, Transferable {


    public void deposit(double amount) {
        if (amount > 0)
            this.balance += amount;

    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > 0)
            this.balance -= amount;
    }

    @Override
    public void transfer(double)

}
